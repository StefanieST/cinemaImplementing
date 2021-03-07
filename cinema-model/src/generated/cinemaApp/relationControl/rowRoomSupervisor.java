/**--- Generated at Sun Mar 07 18:18:53 CET 2021 
 * --- Change only in Editable Sections!  
 * --- Do not touch section numbering!   
 */
package generated.cinemaApp.relationControl;
//10 ===== GENERATED:      Import Section =========
import relationManagement.Relation;
import db.executer.PersistenceException;
import generated.cinemaApp.proxies.*;
import exceptions.ConstraintViolation;
import java.util.List;
//20 ===== Editable : Your Import Section =========

//25 ===== GENERATED:      Header Section =========
public class rowRoomSupervisor
{
   //30 ===== GENERATED:      Attribute Section ======
   private static rowRoomSupervisor theInstance = new rowRoomSupervisor();
   private Relation<IRoom,IRow> elements;
   //40 ===== Editable : Your Attribute Section ======
   
   //50 ===== GENERATED:      Constructor ============
   private rowRoomSupervisor(){
      this.elements = new Relation<>("rowRoom");
   }
   //60 ===== Editable : Your Constructors ===========
   
   //70 ===== GENERATED:      Feature Access =========
   public static rowRoomSupervisor getInstance(){return theInstance;}
   public List<IRow> getRows(IRoom owner){
      return this.elements.getRelatedTargets(owner);
   }
   public void add(IRoom owner, IRow target) throws ConstraintViolation, PersistenceException{
      this.elements.willViolateInjectivity(owner, target);
      this.elements.addElement(owner,target);
   }
   public void addAlreadyPersistent(IRoom owner, IRow target) throws ConstraintViolation, PersistenceException{
      this.elements.willViolateInjectivity(owner, target);
      this.elements.addElementAlreadyPersistent(owner,target);
   }
   public boolean remove(IRoom owner, IRow target) throws ConstraintViolation, PersistenceException{
      this.elements.willViolateSurjectivity(owner, target);
      return this.elements.removeElement(owner,target);
   }
   public IRoom getRoom(IRow target){
      return this.elements.getRelatedSources(target).get(0);
   }
   //80 ===== Editable : Your Operations =============
//90 ===== GENERATED: End of Your Operations ======
}
