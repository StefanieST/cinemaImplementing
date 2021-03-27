/**--- Generated at Sat Mar 27 18:25:07 CET 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaApp.proxies;
import idManagement.Identifiable;
import db.executer.PersistenceException;
import generated.cinemaApp.Person;
import generated.cinemaApp.Reservation;
import java.util.Set;
public interface IPerson extends Identifiable{
   public Person getTheObject();
   public Integer getId();
   public String getName() ;
   public void setName(String newName) throws PersistenceException;
   public Set<Reservation> getReserveration() throws PersistenceException;
}
