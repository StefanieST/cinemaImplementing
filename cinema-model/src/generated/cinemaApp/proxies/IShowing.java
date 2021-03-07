/**--- Generated at Sun Mar 07 18:18:52 CET 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaApp.proxies;
import idManagement.Identifiable;
import db.executer.PersistenceException;
import generated.cinemaApp.Showing;
import generated.cinemaApp.Reservation;
import java.util.Set;
import generated.cinemaApp.Film;
import generated.cinemaApp.Room;
public interface IShowing extends Identifiable{
   public Showing getTheObject();
   public Integer getId();
   public Set<Reservation> getReservation() throws PersistenceException;
   public void addToReservation(Reservation arg) throws PersistenceException;
   public boolean removeFromReservation(Reservation arg) throws PersistenceException;
   public Film getFilm() throws PersistenceException;
   public void setFilm(Film newFilm)throws PersistenceException;
   public Room getRoom() throws PersistenceException;
   public void setRoom(Room newRoom)throws PersistenceException;
}
