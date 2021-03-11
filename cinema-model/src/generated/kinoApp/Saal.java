/**--- Generated at Sun Mar 07 17:38:00 CET 2021 
 * --- Change only in Editable Sections!  
 * --- Do not touch section numbering!   
 */
package generated.kinoApp;
//10 ===== GENERATED:      Import Section =========
import java.sql.SQLException;
import db.connection.NoConnectionException;
import db.connection.TypeKeyManager;
import db.executer.PersistenceExecuterFactory;
import generated.kinoApp.proxies.SaalProxy;
import observation.Observable;
import generated.kinoApp.proxies.ISaal;
import generated.kinoApp.relationControl.*;
import generated.kinoApp.proxies.*;
import db.executer.PersistenceException;
import java.util.Set;
import java.util.HashSet;
import exceptions.ConstraintViolation;
//20 ===== Editable : Your Import Section =========

//25 ===== GENERATED:      Header Section =========
public class Saal extends Observable implements java.io.Serializable, ISaal
{
   //30 ===== GENERATED:      Attribute Section ======
   private Integer id;
   private String updata;
   //40 ===== Editable : Your Attribute Section ======
   
   //50 ===== GENERATED:      Constructor ============
   private Saal(Integer id, String updata, boolean objectOnly)
   {
      super();
      this.setId(id);
      this.updata = updata;
      if(objectOnly) return;
   }
   /** Caution: A Call to this Method Requires to add any newly instantiated Object to its Cache! */
   public static Saal createAlreadyPersistent(SaalProxy proxy, String updata){
      if(proxy.isObjectPresent()) return proxy.getTheObject();
      return new Saal(proxy.getId(), updata, true);
   }
   public static Saal createFresh(String updata)throws PersistenceException{
      db.executer.DBDMLExecuter dmlExecuter = PersistenceExecuterFactory.getConfiguredFactory().getDBDMLExecuter();
      Integer id = dmlExecuter.getNextId();
      try{
         dmlExecuter.insertInto("Saal", "id, typeKey, updata", 
         id.toString() + ", " + TypeKeyManager.getTheInstance().getTypeKey("KinoApp", "Saal").toString() + ", " + "'" + updata + "'");
      }catch(SQLException|NoConnectionException e){throw new PersistenceException(e.getMessage());}
      Saal me = new Saal(id, updata, false);
      KinoApp.getInstance().addSaalProxy(new SaalProxy(me));
      return me;
   }
   //60 ===== Editable : Your Constructors ===========
   
   //70 ===== GENERATED:      Feature Access =========
   public Saal getTheObject(){
      return this;
   }
   public Integer getId(){
      return this.id;
   }
   protected void setId(Integer id){
      this.id = id;
   }
   public boolean equals(Object o) {
      if(!(o instanceof ISaal)) return false;
      return ((ISaal)o).getId().equals(this.getId());
   }
   public int hashCode() {return this.getId().hashCode();}
   public Set<Reihe> getReihen() throws PersistenceException{
      Set<Reihe> result = new HashSet<>();
      for (IReihe i : ReiheImSaalSupervisor.getInstance().getReihen(this)) result.add(i.getTheObject());
      return result;
   }
   public void addToReihen(Reihe arg) throws ConstraintViolation, PersistenceException{
      ReiheImSaalSupervisor.getInstance().add(this, arg);
   }
   public boolean removeFromReihen(Reihe arg) throws ConstraintViolation, PersistenceException{
      return ReiheImSaalSupervisor.getInstance().remove(this, arg);
   }
   public String getUpdata() {
      return this.updata;
   }
   public void setUpdata(String newUpdata) throws PersistenceException{
      this.updata = newUpdata;
      try{PersistenceExecuterFactory.getConfiguredFactory().getDBDMLExecuter().update("Saal", "updata", "'" + newUpdata + "'", this.getId());
      }catch(SQLException|NoConnectionException e){throw new PersistenceException(e.getMessage());}
   }
   //80 ===== Editable : Your Operations =============
/**
 * Reserviert einen Platz ...
 */
   public void reserviere(Sitz sitz)throws NotAvailable{
      // TODO: Implement Operation reserviere
      return;
   }
//90 ===== GENERATED: End of Your Operations ======
}
