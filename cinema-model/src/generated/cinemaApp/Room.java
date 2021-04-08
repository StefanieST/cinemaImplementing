/**--- Generated at Thu Apr 08 13:20:09 CEST 2021 
 * --- Change only in Editable Sections!  
 * --- Do not touch section numbering!   
 */
package generated.cinemaApp;
//10 ===== GENERATED:      Import Section =========
import java.sql.SQLException;
import db.connection.NoConnectionException;
import db.connection.TypeKeyManager;
import db.executer.PersistenceExecuterFactory;
import generated.cinemaApp.proxies.RoomProxy;
import observation.Observable;
import generated.cinemaApp.proxies.IRoom;
import generated.cinemaApp.relationControl.*;
import generated.cinemaApp.proxies.*;
import db.executer.PersistenceException;
import java.util.List;
import java.util.ArrayList;
import exceptions.ConstraintViolation;
//20 ===== Editable : Your Import Section =========

//25 ===== GENERATED:      Header Section =========
public class Room extends Observable implements java.io.Serializable, IRoom
{
   //30 ===== GENERATED:      Attribute Section ======
   private Integer id;
   private String name;
   //40 ===== Editable : Your Attribute Section ======
   
   //50 ===== GENERATED:      Constructor ============
   private Room(Integer id, String name, boolean objectOnly)
   {
      super();
      this.setId(id);
      this.name = name;
      if(objectOnly) return;
   }
   /** Caution: A Call to this Method Requires to add any newly instantiated Object to its Cache! */
   public static Room createAlreadyPersistent(RoomProxy proxy, String name){
      if(proxy.isObjectPresent()) return proxy.getTheObject();
      return new Room(proxy.getId(), name, true);
   }
   public static Room createFresh(String name)throws PersistenceException{
      db.executer.DBDMLExecuter dmlExecuter = PersistenceExecuterFactory.getConfiguredFactory().getDBDMLExecuter();
      Integer id = dmlExecuter.getNextId();
      try{
         dmlExecuter.insertInto("Room", "id, typeKey, name", 
         id.toString() + ", " + TypeKeyManager.getTheInstance().getTypeKey("CinemaApp", "Room").toString() + ", " + "'" + name + "'");
      }catch(SQLException|NoConnectionException e){throw new PersistenceException(e.getMessage());}
      Room me = new Room(id, name, false);
      CinemaApp.getInstance().addRoomProxy(new RoomProxy(me));
      return me;
   }
   //60 ===== Editable : Your Constructors ===========
   
   //70 ===== GENERATED:      Feature Access =========
   public Room getTheObject(){
      return this;
   }
   public Integer getId(){
      return this.id;
   }
   protected void setId(Integer id){
      this.id = id;
   }
   public boolean equals(Object o) {
      if(!(o instanceof IRoom)) return false;
      return ((IRoom)o).getId().equals(this.getId());
   }
   public int hashCode() {return this.getId().hashCode();}
   public List<Row> getRows() throws PersistenceException{
      List<Row> result = new ArrayList<>();
      for (IRow i : rowRoomSupervisor.getInstance().getRows(this)) result.add(i.getTheObject());
      return result;
   }
   public void addToRows(Row arg) throws ConstraintViolation, PersistenceException{
      rowRoomSupervisor.getInstance().add(this, arg);
   }
   public boolean removeFromRows(Row arg) throws ConstraintViolation, PersistenceException{
      return rowRoomSupervisor.getInstance().remove(this, arg);
   }
   public String getName() {
      return this.name;
   }
   public void setName(String newName) throws PersistenceException{
      this.name = newName;
      try{PersistenceExecuterFactory.getConfiguredFactory().getDBDMLExecuter().update("Room", "name", "'" + newName + "'", this.getId());
      }catch(SQLException|NoConnectionException e){throw new PersistenceException(e.getMessage());}
   }
   //80 ===== Editable : Your Operations =============
//90 ===== GENERATED: End of Your Operations ======
}
