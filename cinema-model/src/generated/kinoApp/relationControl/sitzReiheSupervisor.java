/**--- Generated at Sun Mar 07 17:38:01 CET 2021 
 * --- Change only in Editable Sections!  
 * --- Do not touch section numbering!   
 */
package generated.kinoApp.relationControl;
//10 ===== GENERATED:      Import Section =========
import relationManagement.Relation;
import db.executer.PersistenceException;
import generated.kinoApp.proxies.*;
//20 ===== Editable : Your Import Section =========

//25 ===== GENERATED:      Header Section =========
public class sitzReiheSupervisor
{
   //30 ===== GENERATED:      Attribute Section ======
   private static sitzReiheSupervisor theInstance = new sitzReiheSupervisor();
   private Relation<ISitz,IReihe> elements;
   //40 ===== Editable : Your Attribute Section ======
   
   //50 ===== GENERATED:      Constructor ============
   private sitzReiheSupervisor(){
      this.elements = new Relation<>("sitzReihe");
   }
   //60 ===== Editable : Your Constructors ===========
   
   //70 ===== GENERATED:      Feature Access =========
   public static sitzReiheSupervisor getInstance(){return theInstance;}
   public IReihe getReihe(ISitz owner){
      return this.elements.getRelatedTargets(owner).isEmpty() ? null : this.elements.getRelatedTargets(owner).get(0);
   }
   public void set(ISitz owner, IReihe target) throws PersistenceException{
      IReihe targetOld = this.getReihe(owner); IReihe targetNew = target;
      this.elements.change(owner, targetOld, targetNew);
   }
   public void setAlreadyPersistent(ISitz owner, IReihe target) {
      IReihe targetOld = null; IReihe targetNew = target;
      this.elements.setAlreadyPersistent(owner, targetNew);
   }
   public void change(ISitz owner, IReihe targetOld, IReihe targetNew) throws PersistenceException{
      this.elements.change(owner, targetOld, targetNew);
   }
   //80 ===== Editable : Your Operations =============
//90 ===== GENERATED: End of Your Operations ======
}
