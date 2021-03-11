/**--- Generated at Sun Mar 07 17:38:00 CET 2021 
 * --- No Change Allowed!  
 */
package generated.kinoApp.proxies;
import db.executer.PersistenceException;
import java.util.Optional;
import db.executer.*;
import generated.kinoApp.Saal;
import java.sql.ResultSet;
import generated.kinoApp.Reihe;
import java.util.Set;
import exceptions.ConstraintViolation;
import generated.kinoApp.Sitz;
import generated.kinoApp.NotAvailable;
public class SaalProxy implements ISaal{
   private Integer id;
   private Optional<Saal> theObject;
   private DBDMLExecuter dmlExecuter = PersistenceExecuterFactory.getConfiguredFactory().getDBDMLExecuter();
   public SaalProxy(Integer id){
      this.id = id;
      this.theObject = Optional.empty();
   }
   public SaalProxy(Saal theObject) throws PersistenceException{
      this(theObject.getId());
      this.theObject = Optional.of(theObject);
   }
   public boolean isObjectPresent() {
      return this.theObject.isPresent();
   }
   public Saal getTheObject()
   {
      try{if(!this.isObjectPresent()) this.theObject = Optional.of(this.load());}catch(PersistenceException pe){assert false : "Fatal Error Occured when loading an existing object from DB: " + "Saal";}
      return this.theObject.get();
   }
   public Integer getId(){
      return this.id;
   }
   public boolean equals(Object o) {
      if(!(o instanceof ISaal)) return false;
      return ((ISaal)o).getId().equals(this.getId());
   }
   public int hashCode() {return this.getId().hashCode();}
   private Saal load() throws PersistenceException {
      ResultSet rs = null;
      try {
         rs = DBExecuterFactory.getConfiguredFactory().getDBDMLExecuter().selectIdSpecifiedCursorAleadyAtFirstRow("Saal", this.id);
         String updata = rs.getString("updata");
         return Saal.createAlreadyPersistent(this, updata);
      } catch (Exception e) {throw new PersistenceException(e.getMessage());}
   }
   public Set<Reihe> getReihen() throws PersistenceException{
      return this.getTheObject().getReihen();
   }
   public void addToReihen(Reihe arg) throws ConstraintViolation, PersistenceException{
      this.getTheObject().addToReihen(arg);
   }
   public boolean removeFromReihen(Reihe arg) throws ConstraintViolation, PersistenceException{
      return this.getTheObject().removeFromReihen(arg);
   }
   public String getUpdata() {
      return this.getTheObject().getUpdata();
   }
   public void setUpdata(String newUpdata) throws PersistenceException{
      this.getTheObject().setUpdata(newUpdata);
   }
   public void reserviere(Sitz sitz)throws NotAvailable{
      this.getTheObject().reserviere(sitz);
   }
}
