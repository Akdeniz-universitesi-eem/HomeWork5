package UML;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.annotation.processing.Generated;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Accountant extends Receptionist {

   int reservationPrice;

  


    public int ReservationPrice(Receptionist receptionist,Reservation reservation){
    
        
        if (reservation.reservationType.equals("A")){
            
            reservationPrice =  100;
            
        }
        else if(reservation.reservationType.equals("B")){

            reservationPrice = 200;
        }

        
       // oda değişikliği olduğu durumda toplam tutar 80 artar
        if(receptionist.whatTodo==0&&receptionist.changeType==1){  // Ama reservationPrice değişmiyor, çözemedim (S.O.S. !!!)

            reservationPrice = reservationPrice + 80;

            
        }
         ImageIcon icon = new ImageIcon("src\\UML\\byebye.png");

         JOptionPane.showMessageDialog(null,"Accountant: \n total expenditure = " + reservationPrice,"",JOptionPane.PLAIN_MESSAGE,icon);
        
        return reservationPrice;
        
    }

    public void theEnd(){
        
        ImageIcon icon = new ImageIcon("src\\UML\\end.jpg"); 
        
        JOptionPane.showMessageDialog(null,"Ödev'in UML kısmını yapmak \n toplam 20 saat sürmüştür","",JOptionPane.PLAIN_MESSAGE,icon);


    }

      public Accountant(){

        this.reservationPrice=reservationPrice;
       
        
        
    }

    
}
