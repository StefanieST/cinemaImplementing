/**--- Generated at Sat Mar 27 14:21:54 CET 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaApp.proxies;
import idManagement.Identifiable;
import db.executer.PersistenceException;
import generated.cinemaApp.Reservation;
import generated.cinemaApp.Person;
import generated.cinemaApp.Booking;
import java.util.Optional;
import generated.cinemaApp.Seat;
import generated.cinemaApp.Showing;
public interface IReservation extends Identifiable{
   public Reservation getTheObject();
   public Integer getId();
   public Person getPerson() throws PersistenceException;
   public void setPerson(Person newPerson)throws PersistenceException;
   public Optional<Booking> getBooking() throws PersistenceException;
   public void setBooking(Booking newBooking)throws PersistenceException;
   public Seat getSeat() throws PersistenceException;
   public void setSeat(Seat newSeat)throws PersistenceException;
   public Showing getShowing() throws PersistenceException;
}
