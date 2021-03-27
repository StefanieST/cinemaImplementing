/**--- Generated at Sat Mar 27 14:21:55 CET 2021 
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
public class showingFilmSupervisor
{
   //30 ===== GENERATED:      Attribute Section ======
   private static showingFilmSupervisor theInstance = new showingFilmSupervisor();
   private Relation<IShowing,IFilm> elements;
   //40 ===== Editable : Your Attribute Section ======
   
   //50 ===== GENERATED:      Constructor ============
   private showingFilmSupervisor(){
      this.elements = new Relation<>("showingFilm");
   }
   //60 ===== Editable : Your Constructors ===========
   
   //70 ===== GENERATED:      Feature Access =========
   public static showingFilmSupervisor getInstance(){return theInstance;}
   public IFilm getFilm(IShowing owner){
      return this.elements.getRelatedTargets(owner).isEmpty() ? null : this.elements.getRelatedTargets(owner).get(0);
   }
   public void set(IShowing owner, IFilm target) throws PersistenceException{
      IFilm targetOld = this.getFilm(owner); IFilm targetNew = target;
      this.elements.change(owner, targetOld, targetNew);
   }
   public void setAlreadyPersistent(IShowing owner, IFilm target) {
      IFilm targetOld = null; IFilm targetNew = target;
      this.elements.setAlreadyPersistent(owner, targetNew);
   }
   public void change(IShowing owner, IFilm targetOld, IFilm targetNew) throws PersistenceException{
      this.elements.change(owner, targetOld, targetNew);
   }
   //80 ===== Editable : Your Operations =============
//90 ===== GENERATED: End of Your Operations ======
}
