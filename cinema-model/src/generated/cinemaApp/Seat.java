/**--- Generated at Sun Mar 07 14:53:48 CET 2021 
 * --- Change only in Editable Sections!  
 * --- Do not touch section numbering!   
 */
package generated.cinemaApp;
//10 ===== GENERATED:      Import Section =========
import java.sql.SQLException;
import db.connection.NoConnectionException;
import db.connection.TypeKeyManager;
import db.executer.PersistenceExecuterFactory;
import generated.cinemaApp.proxies.SeatProxy;
import observation.Observable;
import generated.cinemaApp.proxies.ISeat;
import db.executer.PersistenceException;
import generated.cinemaApp.relationControl.*;
import exceptions.ConstraintViolation;
//20 ===== Editable : Your Import Section =========

//25 ===== GENERATED:      Header Section =========
public class Seat extends Observable implements java.io.Serializable, ISeat
{
   //30 ===== GENERATED:      Attribute Section ======
   private Integer id;
   private Integer number;
   //40 ===== Editable : Your Attribute Section ======
   
   //50 ===== GENERATED:      Constructor ============
   private Seat(Integer id, Integer number, Row row, boolean objectOnly)
   throws PersistenceException{
      super();
      this.setId(id);
      this.number = number;
      if(objectOnly) return;
      try{rowSeatSupervisor.getInstance().add(row,this);}catch(ConstraintViolation cv){}// Ok, because consistency is guaranteed with this statement
   }
   /** Caution: A Call to this Method Requires to add any newly instantiated Object to its Cache! */
   public static Seat createAlreadyPersistent(SeatProxy proxy, Integer number, Row row)throws PersistenceException{
      if(proxy.isObjectPresent()) return proxy.getTheObject();
      return new Seat(proxy.getId(), number, row, true);
   }
   public static Seat createFresh(Integer number, Row row)throws PersistenceException{
      db.executer.DBDMLExecuter dmlExecuter = PersistenceExecuterFactory.getConfiguredFactory().getDBDMLExecuter();
      Integer id = dmlExecuter.getNextId();
      try{
         dmlExecuter.insertInto("Seat", "id, typeKey, number", 
         id.toString() + ", " + TypeKeyManager.getTheInstance().getTypeKey("CinemaApp", "Seat").toString() + ", " + number.toString());
      }catch(SQLException|NoConnectionException e){throw new PersistenceException(e.getMessage());}
      Seat me = new Seat(id, number, row, false);
      CinemaApp.getInstance().addSeatProxy(new SeatProxy(me));
      return me;
   }
   //60 ===== Editable : Your Constructors ===========
   
   //70 ===== GENERATED:      Feature Access =========
   public Seat getTheObject(){
      return this;
   }
   public Integer getId(){
      return this.id;
   }
   protected void setId(Integer id){
      this.id = id;
   }
   public boolean equals(Object o) {
      if(!(o instanceof ISeat)) return false;
      return ((ISeat)o).getId().equals(this.getId());
   }
   public int hashCode() {return this.getId().hashCode();}
   public Integer getNumber() {
      return this.number;
   }
   public void setNumber(Integer newNumber) throws PersistenceException{
      this.number = newNumber;
      try{PersistenceExecuterFactory.getConfiguredFactory().getDBDMLExecuter().update("Seat", "number", newNumber.toString(), this.getId());
      }catch(SQLException|NoConnectionException e){throw new PersistenceException(e.getMessage());}
   }
   public Row getRow() throws PersistenceException{
      return rowSeatSupervisor.getInstance().getRow(this).getTheObject();
   }
   //80 ===== Editable : Your Operations =============
//90 ===== GENERATED: End of Your Operations ======
}
