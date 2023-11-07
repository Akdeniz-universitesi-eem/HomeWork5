package UML;
import java.util.Random;
import java.awt.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Reservation extends Customer {
    
    int intCode;
    String confirmationCode ;
    int choice;
    String reservationType;
    
      public Reservation(){
      
         this.intCode=intCode;
         this.confirmationCode = confirmationCode;
         this.choice=choice;
         this.reservationType=reservationType;
         
         
      
    
      }


     public void add(Customer customer) {
   
 
       
    

        Object[] choiceoptions = {"Phone", "Online"};

    choice =  JOptionPane.showOptionDialog(null,"Receptionist: \nWhat do you want to use book?: ", null,JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,choiceoptions,choiceoptions[0] );
    if(choice==0){ // telefondan rezervasyon yapılırsa
        
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 5));

        JTextField name0 = new JTextField(10);
        JTextField surname0 = new JTextField(10);
        JTextField date0 = new JTextField(10);
        JTextField no0 = new JTextField(10);
        JTextField reservationType0 = new JTextField(10);
        Random rand = new Random();
        intCode = rand.nextInt(1000 - 100 + 1) + 100;
        panel.add(new JLabel("name:"));
        panel.add(name0);
        panel.add(new JLabel("surname:"));
        panel.add(surname0);
        panel.add(new JLabel("Date(dd-mm-yy):"));
        panel.add(date0);
        panel.add(new JLabel("no:"));
        panel.add(no0);
        panel.add(new JLabel("reservationType:"));
        panel.add(reservationType0);
        int ctrl2=1;
        do{ // girişler uygun olmazsa (numaraya harf veya boşluk girme, olmayan bir rezervasyon tipi yazma) tekrar sorar
        int result = JOptionPane.showConfirmDialog(null, panel, "info's", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            name =  name0.getText();
            surname = surname0.getText();
            date = date0.getText();
            no = no0.getText();
            reservationType = reservationType0.getText();
            confirmationCode = intCode + reservationType; 
            
            
        if(no.matches("^0[0-9]{10}$")&& reservationType != null && (reservationType.equals("A") || reservationType.equals("B"))){    // sadece numarayı yanlış yazıp type doğru seçsem bile burda kalıyor
            ctrl2=0;
            
            JOptionPane.showMessageDialog(null, "name: " + name + "\nsurname: " + surname + "\ndate: " + date + "\nno: " + no+ "\nreservationType: " + reservationType);
            JOptionPane.showMessageDialog(null, "A " + "'"+reservationType+"'" + " type reservation was made in the name of " + name +" "+surname+"\nHis/Her number : "+no);
            JOptionPane.showMessageDialog(null, "room number : "+intCode +"\n reception confirmation code:  " + confirmationCode);
           
        }else if(no.matches("^0[0-9]{10}$")){
            ctrl2=1;
            JOptionPane.showMessageDialog(null, "We have only 2 types as a reservation Types. These are A and B");
        }else if( reservationType != null && (reservationType.equals("A") || reservationType.equals("B"))){
            ctrl2=1;
            JOptionPane.showMessageDialog(null, "Please write a valid number");
        }
        else{
            ctrl2=1;
            JOptionPane.showMessageDialog(null, "We have only 2 types as a reservation Types. These are A and B\nPlease write a valid number");
        }  
        
           
            
    }
    else if(result==JOptionPane.CANCEL_OPTION ||result== JOptionPane.CLOSED_OPTION){
       System.exit(0) ;  
    }
      } while( ctrl2==1);
    
    }
    else if(choice==1){ // Online rezervasyon yapılırsa
        
        
         JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 5));

        JTextField name0 = new JTextField(10);
        JTextField surname0 = new JTextField(10);
        JTextField date0 = new JTextField(10);
        JTextField email0 = new JTextField(10);
        JTextField reservationType0 = new JTextField(10);
        Random rand = new Random();
        intCode = rand.nextInt(1000 - 100 + 1) + 100;
        panel.add(new JLabel("name:"));
        panel.add(name0);
        panel.add(new JLabel("surname:"));
        panel.add(surname0);
        panel.add(new JLabel("Date(dd-mm-yy):"));
        panel.add(date0);
        panel.add(new JLabel("email:"));
        panel.add(email0);
        panel.add(new JLabel("reservationType:"));
        panel.add(reservationType0);
        int ctrl1=1;
        do{ // girişler uygun olmazsa (numaraya harf veya boşluk girme, olmayan bir rezervasyon tipi yazma) tekrar sorar
        int result = JOptionPane.showConfirmDialog(null, panel, "info's", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
             name =  name0.getText();
             surname = surname0.getText();
             date = date0.getText();
             email = email0.getText();
             reservationType = reservationType0.getText();
             confirmationCode = intCode + reservationType; 
        
        if(!reservationType.equals("A")&&!reservationType.equals("B")||reservationType.equals(null)){
            ctrl1=0;
            
            JOptionPane.showMessageDialog(null, "We have only 2 types as a reservation Types. These are A and B");
        
        }
        else{
            ctrl1=1;
            JOptionPane.showMessageDialog(null, "name: " + name + "\nsurname: " + surname + "\ndate: " + date + "\nemail: " +email+ "\nreservationType: " + reservationType);
            JOptionPane.showMessageDialog(null, "A " + "'"+reservationType+"'" + " type reservation was made in the name of " + name +" "+surname+"\nHis/Her email : "+email);
            JOptionPane.showMessageDialog(null, "room number : "+intCode +"\n reception confirmation code:  " + confirmationCode);
        }
       
    }else if(result==JOptionPane.CANCEL_OPTION ||result== JOptionPane.CLOSED_OPTION){
       System.exit(0) ;  
    }
    
}while(ctrl1==0);
    
    
      

        
    }else if(choice==JOptionPane.CLOSED_OPTION)
    {
         System.exit(0) ;
    }
    
    


    
}
}