/**--- Generated at Sun Mar 07 17:38:01 CET 2021 
 * --- No Change Allowed!  
 */
package generated.kinoApp.proxies;
import idManagement.Identifiable;
import db.executer.PersistenceException;
import generated.kinoApp.Sitz;
import generated.kinoApp.Reihe;
public interface ISitz extends Identifiable{
   public Sitz getTheObject();
   public Integer getId();
   public Reihe getReihe() throws PersistenceException;
   public void setReihe(Reihe newReihe)throws PersistenceException;
   public Integer getNummer() ;
   public void setNummer(Integer newNummer) throws PersistenceException;
}
