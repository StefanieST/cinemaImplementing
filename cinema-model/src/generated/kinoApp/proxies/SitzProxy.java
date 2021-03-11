/**--- Generated at Sun Mar 07 17:38:01 CET 2021 
 * --- No Change Allowed!  
 */
package generated.kinoApp.proxies;
import db.executer.PersistenceException;
import java.util.Optional;
import db.executer.*;
import generated.kinoApp.Sitz;
import java.sql.ResultSet;
import generated.kinoApp.Reihe;
import generated.kinoApp.relationControl.sitzReiheSupervisor;
public class SitzProxy implements ISitz{
   private Integer id;
   private Optional<Sitz> theObject;
   private DBDMLExecuter dmlExecuter = PersistenceExecuterFactory.getConfiguredFactory().getDBDMLExecuter();
   public SitzProxy(Integer id){
      this.id = id;
      this.theObject = Optional.empty();
   }
   public SitzProxy(Sitz theObject) throws PersistenceException{
      this(theObject.getId());
      this.theObject = Optional.of(theObject);
   }
   public boolean isObjectPresent() {
      return this.theObject.isPresent();
   }
   public Sitz getTheObject()
   {
      try{if(!this.isObjectPresent()) this.theObject = Optional.of(this.load());}catch(PersistenceException pe){assert false : "Fatal Error Occured when loading an existing object from DB: " + "Sitz";}
      return this.theObject.get();
   }
   public Integer getId(){
      return this.id;
   }
   public boolean equals(Object o) {
      if(!(o instanceof ISitz)) return false;
      return ((ISitz)o).getId().equals(this.getId());
   }
   public int hashCode() {return this.getId().hashCode();}
   private Sitz load() throws PersistenceException {
      ResultSet rs = null;
      try {
         rs = DBExecuterFactory.getConfiguredFactory().getDBDMLExecuter().selectIdSpecifiedCursorAleadyAtFirstRow("Sitz", this.id);
         Reihe reihe = sitzReiheSupervisor.getInstance().getReihe(this).getTheObject();
         Integer nummer = rs.getInt("nummer");
         return Sitz.createAlreadyPersistent(this, reihe, nummer);
      } catch (Exception e) {throw new PersistenceException(e.getMessage());}
   }
   public Reihe getReihe() throws PersistenceException{
      return this.getTheObject().getReihe();
   }
   public void setReihe(Reihe newReihe)throws PersistenceException{
      this.getTheObject().setReihe(newReihe);
   }
   public Integer getNummer() {
      return this.getTheObject().getNummer();
   }
   public void setNummer(Integer newNummer) throws PersistenceException{
      this.getTheObject().setNummer(newNummer);
   }
}
