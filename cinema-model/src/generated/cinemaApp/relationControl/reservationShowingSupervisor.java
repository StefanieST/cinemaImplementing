/**--- Generated at Sun Mar 07 14:53:48 CET 2021 
 * --- Change only in Editable Sections!  
 * --- Do not touch section numbering!   
 */
package generated.cinemaApp.relationControl;
//10 ===== GENERATED:      Import Section =========
import relationManagement.Relation;
import db.executer.PersistenceException;
import generated.cinemaApp.proxies.*;
import exceptions.ConstraintViolation;
import java.util.Set;
import java.util.stream.Collectors;
//20 ===== Editable : Your Import Section =========

//25 ===== GENERATED:      Header Section =========
public class reservationShowingSupervisor
{
   //30 ===== GENERATED:      Attribute Section ======
   private static reservationShowingSupervisor theInstance = new reservationShowingSupervisor();
   private Relation<IShowing,IReservation> elements;
   //40 ===== Editable : Your Attribute Section ======
   
   //50 ===== GENERATED:      Constructor ============
   private reservationShowingSupervisor(){
      this.elements = new Relation<>("reservationShowing");
   }
   //60 ===== Editable : Your Constructors ===========
   
   //70 ===== GENERATED:      Feature Access =========
   public static reservationShowingSupervisor getInstance(){return theInstance;}
   public Set<IReservation> getReservation(IShowing owner){
      return this.elements.getRelatedTargets(owner).stream().collect(Collectors.toSet());
   }
   public void add(IShowing owner, IReservation target) throws PersistenceException{
      this.elements.addElement(owner,target);
   }
   public void addAlreadyPersistent(IShowing owner, IReservation target) throws PersistenceException{
      this.elements.addElementAlreadyPersistent(owner,target);
   }
   public boolean remove(IShowing owner, IReservation target) throws PersistenceException{
      boolean loop = this.removeOnce(owner, target);
      boolean result = loop;
      while(loop) loop = this.removeOnce(owner, target);
      return result;
   }
   private boolean removeOnce(IShowing owner, IReservation target) throws PersistenceException{
      return this.elements.removeElement(owner,target);
   }
   public Set<IShowing> getShowing(IReservation target){
      return this.elements.getRelatedSources(target).stream().collect(Collectors.toSet());
   }
   //80 ===== Editable : Your Operations =============
//90 ===== GENERATED: End of Your Operations ======
}
