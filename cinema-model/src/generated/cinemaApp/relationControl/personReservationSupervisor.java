/**--- Generated at Sat Mar 27 18:25:07 CET 2021 
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
public class personReservationSupervisor
{
   //30 ===== GENERATED:      Attribute Section ======
   private static personReservationSupervisor theInstance = new personReservationSupervisor();
   private Relation<IReservation,IPerson> elements;
   //40 ===== Editable : Your Attribute Section ======
   
   //50 ===== GENERATED:      Constructor ============
   private personReservationSupervisor(){
      this.elements = new Relation<>("personReservation");
   }
   //60 ===== Editable : Your Constructors ===========
   
   //70 ===== GENERATED:      Feature Access =========
   public static personReservationSupervisor getInstance(){return theInstance;}
   public IPerson getPerson(IReservation owner){
      return this.elements.getRelatedTargets(owner).isEmpty() ? null : this.elements.getRelatedTargets(owner).get(0);
   }
   public void set(IReservation owner, IPerson target) throws PersistenceException{
      IPerson targetOld = this.getPerson(owner); IPerson targetNew = target;
      this.elements.change(owner, targetOld, targetNew);
   }
   public void setAlreadyPersistent(IReservation owner, IPerson target) {
      IPerson targetOld = null; IPerson targetNew = target;
      this.elements.setAlreadyPersistent(owner, targetNew);
   }
   public void change(IReservation owner, IPerson targetOld, IPerson targetNew) throws PersistenceException{
      this.elements.change(owner, targetOld, targetNew);
   }
   public Set<IReservation> getReserveration(IPerson target){
      return this.elements.getRelatedSources(target).stream().collect(Collectors.toSet());
   }
   //80 ===== Editable : Your Operations =============
//90 ===== GENERATED: End of Your Operations ======
}
