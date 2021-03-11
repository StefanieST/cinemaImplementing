/**--- Generated at Sun Mar 07 17:38:01 CET 2021 
 * --- Change only in Editable Sections!  
 * --- Do not touch section numbering!   
 */
package generated.kinoApp;
//10 ===== GENERATED:      Import Section =========
import java.sql.SQLException;
import db.connection.NoConnectionException;
import db.connection.TypeKeyManager;
import db.executer.PersistenceExecuterFactory;
import generated.kinoApp.proxies.SitzProxy;
import observation.Observable;
import generated.kinoApp.proxies.ISitz;
import generated.kinoApp.relationControl.*;
import generated.kinoApp.proxies.*;
import db.executer.PersistenceException;
import exceptions.ConstraintViolation;
//20 ===== Editable : Your Import Section =========

//25 ===== GENERATED:      Header Section =========
public class Sitz extends Observable implements java.io.Serializable, ISitz
{
   //30 ===== GENERATED:      Attribute Section ======
   private Integer id;
   private Integer nummer;
   //40 ===== Editable : Your Attribute Section ======
   
   //50 ===== GENERATED:      Constructor ============
   private Sitz(Integer id, Reihe reihe, Integer nummer, boolean objectOnly)
   throws PersistenceException{
      super();
      this.setId(id);
      sitzReiheSupervisor.getInstance().set(this, reihe);
      this.nummer = nummer;
      if(objectOnly) return;
   }
   /** Caution: A Call to this Method Requires to add any newly instantiated Object to its Cache! */
   public static Sitz createAlreadyPersistent(SitzProxy proxy, Reihe reihe, Integer nummer)throws PersistenceException{
      if(proxy.isObjectPresent()) return proxy.getTheObject();
      return new Sitz(proxy.getId(), reihe, nummer, true);
   }
   public static Sitz createFresh(Reihe reihe, Integer nummer)throws PersistenceException{
      db.executer.DBDMLExecuter dmlExecuter = PersistenceExecuterFactory.getConfiguredFactory().getDBDMLExecuter();
      Integer id = dmlExecuter.getNextId();
      try{
         dmlExecuter.insertInto("Sitz", "id, typeKey, nummer", 
         id.toString() + ", " + TypeKeyManager.getTheInstance().getTypeKey("KinoApp", "Sitz").toString() + ", " + nummer.toString());
      }catch(SQLException|NoConnectionException e){throw new PersistenceException(e.getMessage());}
      Sitz me = new Sitz(id, reihe, nummer, false);
      KinoApp.getInstance().addSitzProxy(new SitzProxy(me));
      return me;
   }
   //60 ===== Editable : Your Constructors ===========
   
   //70 ===== GENERATED:      Feature Access =========
   public Sitz getTheObject(){
      return this;
   }
   public Integer getId(){
      return this.id;
   }
   protected void setId(Integer id){
      this.id = id;
   }
   public boolean equals(Object o) {
      if(!(o instanceof ISitz)) return false;
      return ((ISitz)o).getId().equals(this.getId());
   }
   public int hashCode() {return this.getId().hashCode();}
   public Reihe getReihe() throws PersistenceException{
      return sitzReiheSupervisor.getInstance().getReihe(this).getTheObject();
   }
   public void setReihe(Reihe newReihe)throws PersistenceException{
      sitzReiheSupervisor.getInstance().change(this, this.getReihe(), newReihe);
   }
   public Integer getNummer() {
      return this.nummer;
   }
   public void setNummer(Integer newNummer) throws PersistenceException{
      this.nummer = newNummer;
      try{PersistenceExecuterFactory.getConfiguredFactory().getDBDMLExecuter().update("Sitz", "nummer", newNummer.toString(), this.getId());
      }catch(SQLException|NoConnectionException e){throw new PersistenceException(e.getMessage());}
   }
   //80 ===== Editable : Your Operations =============
//90 ===== GENERATED: End of Your Operations ======
}
