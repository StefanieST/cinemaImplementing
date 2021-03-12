/**--- Generated at Thu Mar 11 23:51:08 CET 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaApp.proxies;
import db.executer.PersistenceException;
import java.util.Optional;
import db.executer.*;
import generated.cinemaApp.Room;
import java.sql.ResultSet;
import generated.cinemaApp.Row;
import java.util.List;
import exceptions.ConstraintViolation;
public class RoomProxy implements IRoom{
   private Integer id;
   private Optional<Room> theObject;
   private DBDMLExecuter dmlExecuter = PersistenceExecuterFactory.getConfiguredFactory().getDBDMLExecuter();
   public RoomProxy(Integer id){
      this.id = id;
      this.theObject = Optional.empty();
   }
   public RoomProxy(Room theObject) throws PersistenceException{
      this(theObject.getId());
      this.theObject = Optional.of(theObject);
   }
   public boolean isObjectPresent() {
      return this.theObject.isPresent();
   }
   public Room getTheObject()
   {
      try{if(!this.isObjectPresent()) this.theObject = Optional.of(this.load());}catch(PersistenceException pe){assert false : "Fatal Error Occured when loading an existing object from DB: " + "Room";}
      return this.theObject.get();
   }
   public Integer getId(){
      return this.id;
   }
   public boolean equals(Object o) {
      if(!(o instanceof IRoom)) return false;
      return ((IRoom)o).getId().equals(this.getId());
   }
   public int hashCode() {return this.getId().hashCode();}
   private Room load() throws PersistenceException {
      ResultSet rs = null;
      try {
         rs = DBExecuterFactory.getConfiguredFactory().getDBDMLExecuter().selectIdSpecifiedCursorAleadyAtFirstRow("Room", this.id);
         String name = rs.getString("name");
         return Room.createAlreadyPersistent(this, name);
      } catch (Exception e) {throw new PersistenceException(e.getMessage());}
   }
   public List<Row> getRows() throws PersistenceException{
      return this.getTheObject().getRows();
   }
   public void addToRows(Row arg) throws ConstraintViolation, PersistenceException{
      this.getTheObject().addToRows(arg);
   }
   public boolean removeFromRows(Row arg) throws ConstraintViolation, PersistenceException{
      return this.getTheObject().removeFromRows(arg);
   }
   public String getName() {
      return this.getTheObject().getName();
   }
   public void setName(String newName) throws PersistenceException{
      this.getTheObject().setName(newName);
   }
}
