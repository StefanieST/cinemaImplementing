/**--- Generated at Wed Mar 31 23:30:54 CEST 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaApp.proxies;
import idManagement.Identifiable;
import db.executer.PersistenceException;
import generated.cinemaApp.Seat;
import generated.cinemaApp.Row;
public interface ISeat extends Identifiable{
   public Seat getTheObject();
   public Integer getId();
   public Integer getNumber() ;
   public void setNumber(Integer newNumber) throws PersistenceException;
   public Row getRow() throws PersistenceException;
}
