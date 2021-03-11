/**--- Generated at Tue Mar 09 22:50:57 CET 2021 
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
public class rowCategorySupervisor
{
   //30 ===== GENERATED:      Attribute Section ======
   private static rowCategorySupervisor theInstance = new rowCategorySupervisor();
   private Relation<IRow,ICategory> elements;
   //40 ===== Editable : Your Attribute Section ======
   
   //50 ===== GENERATED:      Constructor ============
   private rowCategorySupervisor(){
      this.elements = new Relation<>("rowCategory");
   }
   //60 ===== Editable : Your Constructors ===========
   
   //70 ===== GENERATED:      Feature Access =========
   public static rowCategorySupervisor getInstance(){return theInstance;}
   public ICategory getCategory(IRow owner){
      return this.elements.getRelatedTargets(owner).isEmpty() ? null : this.elements.getRelatedTargets(owner).get(0);
   }
   public void set(IRow owner, ICategory target) throws PersistenceException{
      ICategory targetOld = this.getCategory(owner); ICategory targetNew = target;
      this.elements.change(owner, targetOld, targetNew);
   }
   public void setAlreadyPersistent(IRow owner, ICategory target) {
      ICategory targetOld = null; ICategory targetNew = target;
      this.elements.setAlreadyPersistent(owner, targetNew);
   }
   public void change(IRow owner, ICategory targetOld, ICategory targetNew) throws PersistenceException{
      this.elements.change(owner, targetOld, targetNew);
   }
   //80 ===== Editable : Your Operations =============
//90 ===== GENERATED: End of Your Operations ======
}
