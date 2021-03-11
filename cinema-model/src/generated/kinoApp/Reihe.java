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
import generated.kinoApp.proxies.ReiheProxy;
import observation.Observable;
import generated.kinoApp.proxies.IReihe;
import db.executer.PersistenceException;
import generated.kinoApp.relationControl.*;
import exceptions.ConstraintViolation;
//20 ===== Editable : Your Import Section =========

//25 ===== GENERATED:      Header Section =========
public class Reihe extends Observable implements java.io.Serializable, IReihe
{
   //30 ===== GENERATED:      Attribute Section ======
   private Integer id;
   private Integer nummer;
   //40 ===== Editable : Your Attribute Section ======
   
   //50 ===== GENERATED:      Constructor ============
   private Reihe(Integer id, Integer nummer, Saal container, boolean objectOnly)
   throws PersistenceException{
      super();
      this.setId(id);
      this.nummer = nummer;
      if(objectOnly) return;
      try{ReiheImSaalSupervisor.getInstance().add(container,this);}catch(ConstraintViolation cv){}// Ok, because consistency is guaranteed with this statement
   }
   /** Caution: A Call to this Method Requires to add any newly instantiated Object to its Cache! */
   public static Reihe createAlreadyPersistent(ReiheProxy proxy, Integer nummer, Saal container)throws PersistenceException{
      if(proxy.isObjectPresent()) return proxy.getTheObject();
      return new Reihe(proxy.getId(), nummer, container, true);
   }
   public static Reihe createFresh(Integer nummer, Saal container)throws PersistenceException{
      db.executer.DBDMLExecuter dmlExecuter = PersistenceExecuterFactory.getConfiguredFactory().getDBDMLExecuter();
      Integer id = dmlExecuter.getNextId();
      try{
         dmlExecuter.insertInto("Reihe", "id, typeKey, nummer", 
         id.toString() + ", " + TypeKeyManager.getTheInstance().getTypeKey("KinoApp", "Reihe").toString() + ", " + nummer.toString());
      }catch(SQLException|NoConnectionException e){throw new PersistenceException(e.getMessage());}
      Reihe me = new Reihe(id, nummer, container, false);
      KinoApp.getInstance().addReiheProxy(new ReiheProxy(me));
      return me;
   }
   //60 ===== Editable : Your Constructors ===========
   
   //70 ===== GENERATED:      Feature Access =========
   public Reihe getTheObject(){
      return this;
   }
   public Integer getId(){
      return this.id;
   }
   protected void setId(Integer id){
      this.id = id;
   }
   public boolean equals(Object o) {
      if(!(o instanceof IReihe)) return false;
      return ((IReihe)o).getId().equals(this.getId());
   }
   public int hashCode() {return this.getId().hashCode();}
   public Integer getNummer() {
      return this.nummer;
   }
   public void setNummer(Integer newNummer) throws PersistenceException{
      this.nummer = newNummer;
      try{PersistenceExecuterFactory.getConfiguredFactory().getDBDMLExecuter().update("Reihe", "nummer", newNummer.toString(), this.getId());
      }catch(SQLException|NoConnectionException e){throw new PersistenceException(e.getMessage());}
   }
   public Saal getContainer() throws PersistenceException{
      return ReiheImSaalSupervisor.getInstance().getContainer(this).getTheObject();
   }
   //80 ===== Editable : Your Operations =============
//90 ===== GENERATED: End of Your Operations ======
}
