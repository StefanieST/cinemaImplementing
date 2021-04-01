/**--- Generated at Wed Mar 31 23:30:54 CEST 2021 
 * --- Change only in Editable Sections!  
 * --- Do not touch section numbering!   
 */
package generated.cinemaApp.relationControl;
//10 ===== GENERATED:      Import Section =========
import relationManagement.Relation;
import db.executer.PersistenceException;
import generated.cinemaApp.proxies.*;
import java.util.Optional;
//20 ===== Editable : Your Import Section =========

//25 ===== GENERATED:      Header Section =========
public class reservationBookingSupervisor
{
   //30 ===== GENERATED:      Attribute Section ======
   private static reservationBookingSupervisor theInstance = new reservationBookingSupervisor();
   private Relation<IReservation,IBooking> elements;
   //40 ===== Editable : Your Attribute Section ======
   
   //50 ===== GENERATED:      Constructor ============
   private reservationBookingSupervisor(){
      this.elements = new Relation<>("reservationBooking");
   }
   //60 ===== Editable : Your Constructors ===========
   
   //70 ===== GENERATED:      Feature Access =========
   public static reservationBookingSupervisor getInstance(){return theInstance;}
   public Optional<IBooking> getBooking(IReservation owner){
      return (this.elements.getRelatedTargets(owner).size() == 0) ? Optional.empty() : Optional.of(this.elements.getRelatedTargets(owner).get(0));
   }
   public void set(IReservation owner, IBooking target) throws PersistenceException{
      IBooking targetOld = this.getBooking(owner).isPresent() ? this.getBooking(owner).get() : null; IBooking targetNew = target;
      this.elements.change(owner, targetOld, targetNew);
   }
   public void setAlreadyPersistent(IReservation owner, IBooking target) {
      IBooking targetOld = null; IBooking targetNew = target;
      this.elements.setAlreadyPersistent(owner, targetNew);
   }
   public void change(IReservation owner, IBooking targetOld, IBooking targetNew) throws PersistenceException{
      this.elements.change(owner, targetOld, targetNew);
   }
   //80 ===== Editable : Your Operations =============
//90 ===== GENERATED: End of Your Operations ======
}
