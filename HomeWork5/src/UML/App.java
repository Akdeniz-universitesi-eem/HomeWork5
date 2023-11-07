package UML;


import javax.swing.JOptionPane;

public class App  {
    public static void main(String[] args) throws Exception {
        

        Customer customer = new Customer();
        Accountant accountant =new Accountant();
        Reservation reservation = new Reservation();
        reservation.add(customer);
        Receptionist receptionist = new Receptionist();
        receptionist.key(reservation);

        receptionist.changeorend(reservation,receptionist); 

        JOptionPane.showMessageDialog(null, accountant.ReservationPrice(receptionist,reservation));





       

        
        
        

        
        
    }
}
