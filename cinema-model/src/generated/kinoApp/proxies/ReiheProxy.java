/**--- Generated at Sun Mar 07 17:38:00 CET 2021 
 * --- No Change Allowed!  
 */
package generated.kinoApp.proxies;
import db.executer.PersistenceException;
import java.util.Optional;
import db.executer.*;
import generated.kinoApp.Reihe;
import java.sql.ResultSet;
import generated.kinoApp.Saal;
import generated.kinoApp.relationControl.ReiheImSaalSupervisor;
public class ReiheProxy implements IReihe{
   private Integer id;
   private Optional<Reihe> theObject;
   private DBDMLExecuter dmlExecuter = PersistenceExecuterFactory.getConfiguredFactory().getDBDMLExecuter();
   public ReiheProxy(Integer id){
      this.id = id;
      this.theObject = Optional.empty();
   }
   public ReiheProxy(Reihe theObject) throws PersistenceException{
      this(theObject.getId());
      this.theObject = Optional.of(theObject);
   }
   public boolean isObjectPresent() {
      return this.theObject.isPresent();
   }
   public Reihe getTheObject()
   {
      try{if(!this.isObjectPresent()) this.theObject = Optional.of(this.load());}catch(PersistenceException pe){assert false : "Fatal Error Occured when loading an existing object from DB: " + "Reihe";}
      return this.theObject.get();
   }
   public Integer getId(){
      return this.id;
   }
   public boolean equals(Object o) {
      if(!(o instanceof IReihe)) return false;
      return ((IReihe)o).getId().equals(this.getId());
   }
   public int hashCode() {return this.getId().hashCode();}
   private Reihe load() throws PersistenceException {
      ResultSet rs = null;
      try {
         rs = DBExecuterFactory.getConfiguredFactory().getDBDMLExecuter().selectIdSpecifiedCursorAleadyAtFirstRow("Reihe", this.id);
         Integer nummer = rs.getInt("nummer");
         Saal container = ReiheImSaalSupervisor.getInstance().getContainer(this).getTheObject();
         return Reihe.createAlreadyPersistent(this, nummer, container);
      } catch (Exception e) {throw new PersistenceException(e.getMessage());}
   }
   public Integer getNummer() {
      return this.getTheObject().getNummer();
   }
   public void setNummer(Integer newNummer) throws PersistenceException{
      this.getTheObject().setNummer(newNummer);
   }
   public Saal getContainer() throws PersistenceException{
      return this.getTheObject().getContainer();
   }
}
