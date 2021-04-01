/**--- Generated at Wed Mar 31 23:30:54 CEST 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaApp.proxies;
import idManagement.Identifiable;
import db.executer.PersistenceException;
import generated.cinemaApp.Room;
import generated.cinemaApp.Row;
import java.util.List;
import exceptions.ConstraintViolation;
public interface IRoom extends Identifiable{
   public Room getTheObject();
   public Integer getId();
   public List<Row> getRows() throws PersistenceException;
   public void addToRows(Row arg) throws ConstraintViolation, PersistenceException;
   public boolean removeFromRows(Row arg) throws ConstraintViolation, PersistenceException;
   public String getName() ;
   public void setName(String newName) throws PersistenceException;
}
