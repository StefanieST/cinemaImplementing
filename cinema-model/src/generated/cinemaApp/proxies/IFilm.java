/**--- Generated at Thu Apr 08 13:20:09 CEST 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaApp.proxies;
import idManagement.Identifiable;
import db.executer.PersistenceException;
import generated.cinemaApp.Film;
public interface IFilm extends Identifiable{
   public Film getTheObject();
   public Integer getId();
   public String getName() ;
   public void setName(String newName) throws PersistenceException;
}
