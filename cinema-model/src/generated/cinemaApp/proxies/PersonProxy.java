/**--- Generated at Sat Mar 27 14:30:31 CET 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaApp.proxies;
import db.executer.PersistenceException;
import java.util.Optional;
import db.executer.*;
import generated.cinemaApp.Person;
import java.sql.ResultSet;
import generated.cinemaApp.Reservation;
import java.util.Set;
public class PersonProxy implements IPerson{
   private Integer id;
   private Optional<Person> theObject;
   private DBDMLExecuter dmlExecuter = PersistenceExecuterFactory.getConfiguredFactory().getDBDMLExecuter();
   public PersonProxy(Integer id){
      this.id = id;
      this.theObject = Optional.empty();
   }
   public PersonProxy(Person theObject) throws PersistenceException{
      this(theObject.getId());
      this.theObject = Optional.of(theObject);
   }
   public boolean isObjectPresent() {
      return this.theObject.isPresent();
   }
   public Person getTheObject()
   {
      try{if(!this.isObjectPresent()) this.theObject = Optional.of(this.load());}catch(PersistenceException pe){assert false : "Fatal Error Occured when loading an existing object from DB: " + "Person";}
      return this.theObject.get();
   }
   public Integer getId(){
      return this.id;
   }
   public boolean equals(Object o) {
      if(!(o instanceof IPerson)) return false;
      return ((IPerson)o).getId().equals(this.getId());
   }
   public int hashCode() {return this.getId().hashCode();}
   private Person load() throws PersistenceException {
      ResultSet rs = null;
      try {
         rs = DBExecuterFactory.getConfiguredFactory().getDBDMLExecuter().selectIdSpecifiedCursorAleadyAtFirstRow("Person", this.id);
         String name = rs.getString("name");
         return Person.createAlreadyPersistent(this, name);
      } catch (Exception e) {throw new PersistenceException(e.getMessage());}
   }
   public String getName() {
      return this.getTheObject().getName();
   }
   public void setName(String newName) throws PersistenceException{
      this.getTheObject().setName(newName);
   }
   public Set<Reservation> getReserveration() throws PersistenceException{
      return this.getTheObject().getReserveration();
   }
}
