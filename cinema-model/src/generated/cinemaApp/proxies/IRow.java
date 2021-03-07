/**--- Generated at Sun Mar 07 14:53:48 CET 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaApp.proxies;
import idManagement.Identifiable;
import db.executer.PersistenceException;
import generated.cinemaApp.Row;
import generated.cinemaApp.Seat;
import java.util.List;
import exceptions.ConstraintViolation;
import generated.cinemaApp.Category;
import generated.cinemaApp.Room;
public interface IRow extends Identifiable{
   public Row getTheObject();
   public Integer getId();
   public List<Seat> getSeats() throws PersistenceException;
   public void addToSeats(Seat arg) throws ConstraintViolation, PersistenceException;
   public boolean removeFromSeats(Seat arg) throws ConstraintViolation, PersistenceException;
   public Category getCategory() throws PersistenceException;
   public void setCategory(Category newCategory)throws PersistenceException;
   public String getName() ;
   public void setName(String newName) throws PersistenceException;
   public Room getRoom() throws PersistenceException;
}
