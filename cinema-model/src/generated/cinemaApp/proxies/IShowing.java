/**--- Generated at Thu Apr 08 13:20:09 CEST 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaApp.proxies;
import idManagement.Identifiable;
import db.executer.PersistenceException;
import generated.cinemaApp.Showing;
import generated.cinemaApp.Reservation;
import java.util.Set;
import exceptions.ConstraintViolation;
import generated.cinemaApp.Film;
import generated.cinemaApp.Room;
public interface IShowing extends Identifiable{
   public Showing getTheObject();
   public Integer getId();
   public Set<Reservation> getReservation() throws PersistenceException;
   public void addToReservation(Reservation arg) throws ConstraintViolation, PersistenceException;
   public boolean removeFromReservation(Reservation arg) throws ConstraintViolation, PersistenceException;
   public Film getFilm() throws PersistenceException;
   public void setFilm(Film newFilm)throws PersistenceException;
   public Room getRoom() throws PersistenceException;
   public void setRoom(Room newRoom)throws PersistenceException;
}
