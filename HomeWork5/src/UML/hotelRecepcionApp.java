package UML;


public class hotelRecepcionApp  {
    public static void main(String[] args) throws Exception {
       

    Customer customer = new Customer();
    
    Reservation reservation = new Reservation();
    reservation.add(customer);
    Receptionist receptionist = new Receptionist();
    receptionist.key(reservation);
    
    receptionist.changeorend(reservation, receptionist);   
    Accountant accountant =new Accountant();
    accountant.ReservationPrice(receptionist, reservation) ;
    accountant.theEnd();
    
        
    }
}
