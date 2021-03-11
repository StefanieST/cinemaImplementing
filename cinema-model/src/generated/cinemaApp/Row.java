/**--- Generated at Tue Mar 09 22:50:57 CET 2021 
 * --- Change only in Editable Sections!  
 * --- Do not touch section numbering!   
 */
package generated.cinemaApp;
//10 ===== GENERATED:      Import Section =========
import java.sql.SQLException;
import db.connection.NoConnectionException;
import db.connection.TypeKeyManager;
import db.executer.PersistenceExecuterFactory;
import generated.cinemaApp.proxies.RowProxy;
import observation.Observable;
import generated.cinemaApp.proxies.IRow;
import generated.cinemaApp.relationControl.*;
import generated.cinemaApp.proxies.*;
import db.executer.PersistenceException;
import java.util.List;
import java.util.ArrayList;
import exceptions.ConstraintViolation;
//20 ===== Editable : Your Import Section =========

//25 ===== GENERATED:      Header Section =========
public class Row extends Observable implements java.io.Serializable, IRow
{
   //30 ===== GENERATED:      Attribute Section ======
   private Integer id;
   private String name;
   //40 ===== Editable : Your Attribute Section ======
   
   //50 ===== GENERATED:      Constructor ============
   private Row(Integer id, Category category, String name, Room room, boolean objectOnly)
   throws PersistenceException{
      super();
      this.setId(id);
      rowCategorySupervisor.getInstance().set(this, category);
      this.name = name;
      if(objectOnly) return;
      try{rowRoomSupervisor.getInstance().add(room,this);}catch(ConstraintViolation cv){}// Ok, because consistency is guaranteed with this statement
   }
   /** Caution: A Call to this Method Requires to add any newly instantiated Object to its Cache! */
   public static Row createAlreadyPersistent(RowProxy proxy, Category category, String name, Room room)throws PersistenceException{
      if(proxy.isObjectPresent()) return proxy.getTheObject();
      return new Row(proxy.getId(), category, name, room, true);
   }
   public static Row createFresh(Category category, String name, Room room)throws PersistenceException{
      db.executer.DBDMLExecuter dmlExecuter = PersistenceExecuterFactory.getConfiguredFactory().getDBDMLExecuter();
      Integer id = dmlExecuter.getNextId();
      try{
         dmlExecuter.insertInto("Row", "id, typeKey, name", 
         id.toString() + ", " + TypeKeyManager.getTheInstance().getTypeKey("CinemaApp", "Row").toString() + ", " + "'" + name + "'");
      }catch(SQLException|NoConnectionException e){throw new PersistenceException(e.getMessage());}
      Row me = new Row(id, category, name, room, false);
      CinemaApp.getInstance().addRowProxy(new RowProxy(me));
      return me;
   }
   //60 ===== Editable : Your Constructors ===========
   
   //70 ===== GENERATED:      Feature Access =========
   public Row getTheObject(){
      return this;
   }
   public Integer getId(){
      return this.id;
   }
   protected void setId(Integer id){
      this.id = id;
   }
   public boolean equals(Object o) {
      if(!(o instanceof IRow)) return false;
      return ((IRow)o).getId().equals(this.getId());
   }
   public int hashCode() {return this.getId().hashCode();}
   public List<Seat> getSeats() throws PersistenceException{
      List<Seat> result = new ArrayList<>();
      for (ISeat i : rowSeatSupervisor.getInstance().getSeats(this)) result.add(i.getTheObject());
      return result;
   }
   public void addToSeats(Seat arg) throws ConstraintViolation, PersistenceException{
      rowSeatSupervisor.getInstance().add(this, arg);
   }
   public boolean removeFromSeats(Seat arg) throws ConstraintViolation, PersistenceException{
      return rowSeatSupervisor.getInstance().remove(this, arg);
   }
   public Category getCategory() throws PersistenceException{
      return rowCategorySupervisor.getInstance().getCategory(this).getTheObject();
   }
   public void setCategory(Category newCategory)throws PersistenceException{
      rowCategorySupervisor.getInstance().change(this, this.getCategory(), newCategory);
   }
   public String getName() {
      return this.name;
   }
   public void setName(String newName) throws PersistenceException{
      this.name = newName;
      try{PersistenceExecuterFactory.getConfiguredFactory().getDBDMLExecuter().update("Row", "name", "'" + newName + "'", this.getId());
      }catch(SQLException|NoConnectionException e){throw new PersistenceException(e.getMessage());}
   }
   public Room getRoom() throws PersistenceException{
      return rowRoomSupervisor.getInstance().getRoom(this).getTheObject();
   }
   //80 ===== Editable : Your Operations =============
/**
 * creates a quantity of Seats for a created row
 */
   public void createSeatsPerRow(Integer quantityOfSeats)throws ModelException{
	
		      for(int counter = 1; counter > quantityOfSeats; counter ++) {
					
				  final Seat seat = Seat.createFresh(counter, this);
				  this.addToSeats(seat);
		
		   }
   }
//90 ===== GENERATED: End of Your Operations ======
}
