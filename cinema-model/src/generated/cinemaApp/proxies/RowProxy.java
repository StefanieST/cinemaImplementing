/**--- Generated at Sat Mar 27 14:21:54 CET 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaApp.proxies;
import db.executer.PersistenceException;
import java.util.Optional;
import db.executer.*;
import generated.cinemaApp.Row;
import java.sql.ResultSet;
import generated.cinemaApp.Seat;
import java.util.List;
import exceptions.ConstraintViolation;
import generated.cinemaApp.Category;
import generated.cinemaApp.relationControl.rowCategorySupervisor;
import generated.cinemaApp.Room;
import generated.cinemaApp.relationControl.rowRoomSupervisor;
public class RowProxy implements IRow{
   private Integer id;
   private Optional<Row> theObject;
   private DBDMLExecuter dmlExecuter = PersistenceExecuterFactory.getConfiguredFactory().getDBDMLExecuter();
   public RowProxy(Integer id){
      this.id = id;
      this.theObject = Optional.empty();
   }
   public RowProxy(Row theObject) throws PersistenceException{
      this(theObject.getId());
      this.theObject = Optional.of(theObject);
   }
   public boolean isObjectPresent() {
      return this.theObject.isPresent();
   }
   public Row getTheObject()
   {
      try{if(!this.isObjectPresent()) this.theObject = Optional.of(this.load());}catch(PersistenceException pe){assert false : "Fatal Error Occured when loading an existing object from DB: " + "Row";}
      return this.theObject.get();
   }
   public Integer getId(){
      return this.id;
   }
   public boolean equals(Object o) {
      if(!(o instanceof IRow)) return false;
      return ((IRow)o).getId().equals(this.getId());
   }
   public int hashCode() {return this.getId().hashCode();}
   private Row load() throws PersistenceException {
      ResultSet rs = null;
      try {
         rs = DBExecuterFactory.getConfiguredFactory().getDBDMLExecuter().selectIdSpecifiedCursorAleadyAtFirstRow("Row", this.id);
         Category category = rowCategorySupervisor.getInstance().getCategory(this).getTheObject();
         String name = rs.getString("name");
         Room room = rowRoomSupervisor.getInstance().getRoom(this).getTheObject();
         return Row.createAlreadyPersistent(this, category, name, room);
      } catch (Exception e) {throw new PersistenceException(e.getMessage());}
   }
   public List<Seat> getSeats() throws PersistenceException{
      return this.getTheObject().getSeats();
   }
   public void addToSeats(Seat arg) throws ConstraintViolation, PersistenceException{
      this.getTheObject().addToSeats(arg);
   }
   public boolean removeFromSeats(Seat arg) throws ConstraintViolation, PersistenceException{
      return this.getTheObject().removeFromSeats(arg);
   }
   public Category getCategory() throws PersistenceException{
      return this.getTheObject().getCategory();
   }
   public void setCategory(Category newCategory)throws PersistenceException{
      this.getTheObject().setCategory(newCategory);
   }
   public String getName() {
      return this.getTheObject().getName();
   }
   public void setName(String newName) throws PersistenceException{
      this.getTheObject().setName(newName);
   }
   public Room getRoom() throws PersistenceException{
      return this.getTheObject().getRoom();
   }
}
