/**--- Generated at Wed Mar 31 23:30:54 CEST 2021 
 * --- Change only in Editable Sections!  
 * --- Do not touch section numbering!   
 */
package generated.cinemaApp.relationControl;
//10 ===== GENERATED:      Import Section =========
import relationManagement.Relation;
import db.executer.PersistenceException;
import generated.cinemaApp.proxies.*;
//20 ===== Editable : Your Import Section =========

//25 ===== GENERATED:      Header Section =========
public class showingRoomSupervisor
{
   //30 ===== GENERATED:      Attribute Section ======
   private static showingRoomSupervisor theInstance = new showingRoomSupervisor();
   private Relation<IShowing,IRoom> elements;
   //40 ===== Editable : Your Attribute Section ======
   
   //50 ===== GENERATED:      Constructor ============
   private showingRoomSupervisor(){
      this.elements = new Relation<>("showingRoom");
   }
   //60 ===== Editable : Your Constructors ===========
   
   //70 ===== GENERATED:      Feature Access =========
   public static showingRoomSupervisor getInstance(){return theInstance;}
   public IRoom getRoom(IShowing owner){
      return this.elements.getRelatedTargets(owner).isEmpty() ? null : this.elements.getRelatedTargets(owner).get(0);
   }
   public void set(IShowing owner, IRoom target) throws PersistenceException{
      IRoom targetOld = this.getRoom(owner); IRoom targetNew = target;
      this.elements.change(owner, targetOld, targetNew);
   }
   public void setAlreadyPersistent(IShowing owner, IRoom target) {
      IRoom targetOld = null; IRoom targetNew = target;
      this.elements.setAlreadyPersistent(owner, targetNew);
   }
   public void change(IShowing owner, IRoom targetOld, IRoom targetNew) throws PersistenceException{
      this.elements.change(owner, targetOld, targetNew);
   }
   //80 ===== Editable : Your Operations =============
//90 ===== GENERATED: End of Your Operations ======
}
