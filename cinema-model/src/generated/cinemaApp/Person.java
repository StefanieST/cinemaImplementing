/**--- Generated at Sat Mar 27 14:30:31 CET 2021 
 * --- Change only in Editable Sections!  
 * --- Do not touch section numbering!   
 */
package generated.cinemaApp;
//10 ===== GENERATED:      Import Section =========
import java.sql.SQLException;
import db.connection.NoConnectionException;
import db.connection.TypeKeyManager;
import db.executer.PersistenceExecuterFactory;
import generated.cinemaApp.proxies.PersonProxy;
import observation.Observable;
import generated.cinemaApp.proxies.IPerson;
import db.executer.PersistenceException;
import generated.cinemaApp.relationControl.*;
import java.util.Set;
import java.util.HashSet;
import generated.cinemaApp.proxies.IReservation;
import exceptions.ConstraintViolation;
//20 ===== Editable : Your Import Section =========

//25 ===== GENERATED:      Header Section =========
public class Person extends Observable implements java.io.Serializable, IPerson
{
   //30 ===== GENERATED:      Attribute Section ======
   private Integer id;
   private String name;
   //40 ===== Editable : Your Attribute Section ======
   
   //50 ===== GENERATED:      Constructor ============
   private Person(Integer id, String name, boolean objectOnly)
   {
      super();
      this.setId(id);
      this.name = name;
      if(objectOnly) return;
   }
   /** Caution: A Call to this Method Requires to add any newly instantiated Object to its Cache! */
   public static Person createAlreadyPersistent(PersonProxy proxy, String name){
      if(proxy.isObjectPresent()) return proxy.getTheObject();
      return new Person(proxy.getId(), name, true);
   }
   public static Person createFresh(String name)throws PersistenceException{
      db.executer.DBDMLExecuter dmlExecuter = PersistenceExecuterFactory.getConfiguredFactory().getDBDMLExecuter();
      Integer id = dmlExecuter.getNextId();
      try{
         dmlExecuter.insertInto("Person", "id, typeKey, name", 
         id.toString() + ", " + TypeKeyManager.getTheInstance().getTypeKey("CinemaApp", "Person").toString() + ", " + "'" + name + "'");
      }catch(SQLException|NoConnectionException e){throw new PersistenceException(e.getMessage());}
      Person me = new Person(id, name, false);
      CinemaApp.getInstance().addPersonProxy(new PersonProxy(me));
      return me;
   }
   //60 ===== Editable : Your Constructors ===========
   
   //70 ===== GENERATED:      Feature Access =========
   public Person getTheObject(){
      return this;
   }
   public Integer getId(){
      return this.id;
   }
   protected void setId(Integer id){
      this.id = id;
   }
   public boolean equals(Object o) {
      if(!(o instanceof IPerson)) return false;
      return ((IPerson)o).getId().equals(this.getId());
   }
   public int hashCode() {return this.getId().hashCode();}
   public String getName() {
      return this.name;
   }
   public void setName(String newName) throws PersistenceException{
      this.name = newName;
      try{PersistenceExecuterFactory.getConfiguredFactory().getDBDMLExecuter().update("Person", "name", "'" + newName + "'", this.getId());
      }catch(SQLException|NoConnectionException e){throw new PersistenceException(e.getMessage());}
   }
   public Set<Reservation> getReserveration() throws PersistenceException{
      Set<Reservation> result = new HashSet<>();
      for (IReservation i : personReservationSupervisor.getInstance().getReserveration(this)) result.add(i.getTheObject());
      return result;
   }
   //80 ===== Editable : Your Operations =============
//90 ===== GENERATED: End of Your Operations ======
}
