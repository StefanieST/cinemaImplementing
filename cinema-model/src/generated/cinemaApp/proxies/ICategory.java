/**--- Generated at Sun Mar 07 14:53:48 CET 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaApp.proxies;
import idManagement.Identifiable;
import db.executer.PersistenceException;
import generated.cinemaApp.Category;
import java.util.Optional;
public interface ICategory extends Identifiable{
   public Category getTheObject();
   public Optional<String> getName() ;
   public void setName(String newName) throws PersistenceException;
   public Optional<Integer> getPrice() ;
   public void setPrice(Integer newPrice) throws PersistenceException;
}
