/**--- Generated at Sun Mar 07 17:38:00 CET 2021 
 * --- No Change Allowed!  
 */
package generated.kinoApp.proxies;
import idManagement.Identifiable;
import db.executer.PersistenceException;
import generated.kinoApp.Reihe;
import generated.kinoApp.Saal;
public interface IReihe extends Identifiable{
   public Reihe getTheObject();
   public Integer getId();
   public Integer getNummer() ;
   public void setNummer(Integer newNummer) throws PersistenceException;
   public Saal getContainer() throws PersistenceException;
}
