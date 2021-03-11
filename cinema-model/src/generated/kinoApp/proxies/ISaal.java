/**--- Generated at Sun Mar 07 17:38:00 CET 2021 
 * --- No Change Allowed!  
 */
package generated.kinoApp.proxies;
import idManagement.Identifiable;
import db.executer.PersistenceException;
import generated.kinoApp.Saal;
import generated.kinoApp.Reihe;
import java.util.Set;
import exceptions.ConstraintViolation;
import generated.kinoApp.Sitz;
import generated.kinoApp.NotAvailable;
public interface ISaal extends Identifiable{
   public Saal getTheObject();
   public Integer getId();
   public Set<Reihe> getReihen() throws PersistenceException;
   public void addToReihen(Reihe arg) throws ConstraintViolation, PersistenceException;
   public boolean removeFromReihen(Reihe arg) throws ConstraintViolation, PersistenceException;
   public String getUpdata() ;
   public void setUpdata(String newUpdata) throws PersistenceException;
   public void reserviere(Sitz sitz)throws NotAvailable;
}
