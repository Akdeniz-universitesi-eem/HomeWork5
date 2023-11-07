package UML;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Receptionist  extends Reservation{

    int whatTodo;
  int changeType;
  String code;

    

    public void key(Reservation reservation){

     try { // exit ya da cancel girildiğinde error handling yapmak için try-cache
      
      int ctrl1=1; 
      do{
        if(reservation.choice==0 || reservation.choice==1){
        code = JOptionPane.showInputDialog(null, "Please give The Confirmation Code: "+ "\n(The Code: "+ reservation.confirmationCode+")");
        if(code.equals(reservation.confirmationCode)){
          ctrl1=0;
          ImageIcon icon =new ImageIcon("src\\UML\\key.jpg");
          JOptionPane.showMessageDialog(null, "  login process is completed. Here's your key ","",JOptionPane.PLAIN_MESSAGE,icon);
          
           
        }
        else{
          ctrl1 =1;
           
            JOptionPane.showMessageDialog(null, "I can't give you any key 'till you bring the right code" + "\n(The Code: "+ reservation.confirmationCode+")");
        }
}
     }
     while(ctrl1==1);  
    }
    catch(NullPointerException e) {
      System.exit(0);
    }

    }












     public void changeorend(Reservation reservation,Receptionist receptionist){
        int ctrl =1; // ctrl 0 olunca reservasyonu sonlandırcak ve döngüden çıkacak (87. satırda)
        do{  

        
        
        if((reservation.choice==0 || reservation.choice==1)&& receptionist.code.equals(reservation.confirmationCode)){


        JOptionPane.showMessageDialog(null, "Days later \ncustomer comes back to reception ");

         Object[] options = {"Change", "End"};

         whatTodo =  JOptionPane.showOptionDialog(null,"Receptionist: \nWhat do you want to do?: ", null,JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0] );

        if(whatTodo == 0 ){ // Resepsiyon ya da oda değişikliği talebi
          ctrl=0;
          
          Object[] options2 = {"Room", "ReceptionType"};
          
          changeType= JOptionPane.showOptionDialog(null,"Receptionist: \nChange room or receptiontype: ", null,JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,options2,options2[0] );
          

         if(changeType==0) { // oda değişikliği

         Random rand = new Random();
         intCode = rand.nextInt(1000 - 100 + 1) + 100;
         confirmationCode = reservation.reservationType + intCode;
         JOptionPane.showMessageDialog(null, "A " + "'"+reservation.reservationType+"'" + "  room has changed in the name of " + reservation.name +" "+reservation.surname + "\nNEWroom number : "+intCode + " \nnew reception code: "+confirmationCode);
         
         }
         else if(changeType==1){ // resepsiyon değişikliği
            int ctrl0 =1;  // resepsiyon tipini A ve B den farklı girerse :
            do{
                reservationType= JOptionPane.showInputDialog(null,"choose Reservation type \n(type A costs 100)\n(type B costs 200)\n : ");
              if(!reservationType.equals("A")&&!reservationType.equals("B")||reservationType.equals(null)){
                ctrl0=0;
                JOptionPane.showMessageDialog(null, "We have only 2 types as a reservation Types. These are A and B");
               }
               else{
                ctrl0=1; 
                confirmationCode = reservationType + reservation.intCode;
                JOptionPane.showMessageDialog(null, "A " + reservation.reservationType + " type reservation has changed in the name of " + reservation.name +" "+reservation.surname + "\nroom number : "+reservation.intCode + " \nnew reception code: "+confirmationCode);
               }
              }while(ctrl0==0);
           
           
         }
         else if(changeType==JOptionPane.CLOSED_OPTION){
          System.exit(0);
         }


        }
        else if(whatTodo==1 ){// reservasyon sonlandırma
           try{
          ctrl=1; // burda ctrl 1 olduğu için döngüden çıkıyor (reservasyon sonlandı)
          String confirmation =  JOptionPane.showInputDialog(null, "Can i get your name to confirm:  "+ "\n(The Name: "+ reservation.name+")");
          if(confirmation.equals(reservation.name)){
            ImageIcon icon = new ImageIcon("src\\UML\\congratulations-congrats.gif");
            JOptionPane.showMessageDialog(null, "Have a nice day",confirmation, JOptionPane.PLAIN_MESSAGE,icon);
            ctrl=1;
          }
          else{
            JOptionPane.showMessageDialog(null, "Your name does not match previous information");
          }

        }
        catch(NullPointerException e){
          System.exit(0);
        }

      }
        else if(whatTodo==JOptionPane.CLOSED_OPTION){
          System.exit(0);
        }

       }

     } 
     while(ctrl==0);
    
  }

public Receptionist(){

  this.whatTodo=whatTodo;
  this.reservationType=reservationType;
  this.changeType=changeType;
  this.code=code;

}
    
}