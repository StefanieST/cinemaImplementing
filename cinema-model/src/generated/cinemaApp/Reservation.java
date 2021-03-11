/**--- Generated at Tue Mar 09 22:50:56 CET 2021 
 * --- Change only in Editable Sections!  
 * --- Do not touch section numbering!   
 */
package generated.cinemaApp;
//10 ===== GENERATED:      Import Section =========
import java.sql.SQLException;
import db.connection.NoConnectionException;
import db.connection.TypeKeyManager;
import db.executer.PersistenceExecuterFactory;
import generated.cinemaApp.proxies.ReservationProxy;
import observation.Observable;
import generated.cinemaApp.proxies.IReservation;
import generated.cinemaApp.relationControl.*;
import generated.cinemaApp.proxies.*;
import db.executer.PersistenceException;
import java.util.Optional;
import java.util.Set;
import java.util.HashSet;
import generated.cinemaApp.proxies.IShowing;
import exceptions.ConstraintViolation;
//20 ===== Editable : Your Import Section =========

//25 ===== GENERATED:      Header Section =========
public class Reservation extends Observable implements java.io.Serializable, IReservation
{
   //30 ===== GENERATED:      Attribute Section ======
   private Integer id;
   //40 ===== Editable : Your Attribute Section ======
   
   //50 ===== GENERATED:      Constructor ============
   private Reservation(Integer id, Person person, Seat seat, boolean objectOnly)
   throws PersistenceException{
      super();
      this.setId(id);
      personReservationSupervisor.getInstance().set(this, person);
      reservationSeatSupervisor.getInstance().set(this, seat);
      if(objectOnly) return;
   }
   /** Caution: A Call to this Method Requires to add any newly instantiated Object to its Cache! */
   public static Reservation createAlreadyPersistent(ReservationProxy proxy, Person person, Seat seat)throws PersistenceException{
      if(proxy.isObjectPresent()) return proxy.getTheObject();
      return new Reservation(proxy.getId(), person, seat, true);
   }
   public static Reservation createFresh(Person person, Seat seat)throws PersistenceException{
      db.executer.DBDMLExecuter dmlExecuter = PersistenceExecuterFactory.getConfiguredFactory().getDBDMLExecuter();
      Integer id = dmlExecuter.getNextId();
      try{
         dmlExecuter.insertInto("Reservation", "id, typeKey", 
         id.toString() + ", " + TypeKeyManager.getTheInstance().getTypeKey("CinemaApp", "Reservation").toString());
      }catch(SQLException|NoConnectionException e){throw new PersistenceException(e.getMessage());}
      Reservation me = new Reservation(id, person, seat, false);
      CinemaApp.getInstance().addReservationProxy(new ReservationProxy(me));
      return me;
   }
   //60 ===== Editable : Your Constructors ===========
   
   //70 ===== GENERATED:      Feature Access =========
   public Reservation getTheObject(){
      return this;
   }
   public Integer getId(){
      return this.id;
   }
   protected void setId(Integer id){
      this.id = id;
   }
   public boolean equals(Object o) {
      if(!(o instanceof IReservation)) return false;
      return ((IReservation)o).getId().equals(this.getId());
   }
   public int hashCode() {return this.getId().hashCode();}
   public Person getPerson() throws PersistenceException{
      return personReservationSupervisor.getInstance().getPerson(this).getTheObject();
   }
   public void setPerson(Person newPerson)throws PersistenceException{
      personReservationSupervisor.getInstance().change(this, this.getPerson(), newPerson);
   }
   public Optional<Booking> getBooking() throws PersistenceException{
      Optional<IBooking> opt = reservationBookingSupervisor.getInstance().getBooking(this);
      return opt.isPresent() ? Optional.of(reservationBookingSupervisor.getInstance().getBooking(this).get().getTheObject()) : Optional.empty();
   }
   public void setBooking(Booking newBooking)throws PersistenceException{
      if(this.getBooking().isPresent()) reservationBookingSupervisor.getInstance().change(this, this.getBooking().get(), newBooking); else reservationBookingSupervisor.getInstance().set(this, newBooking);
   }
   public Seat getSeat() throws PersistenceException{
      return reservationSeatSupervisor.getInstance().getSeat(this).getTheObject();
   }
   public void setSeat(Seat newSeat)throws PersistenceException{
      reservationSeatSupervisor.getInstance().change(this, this.getSeat(), newSeat);
   }
   public Set<Showing> getShowing() throws PersistenceException{
      Set<Showing> result = new HashSet<>();
      for (IShowing i : reservationShowingSupervisor.getInstance().getShowing(this)) result.add(i.getTheObject());
      return result;
   }
   //80 ===== Editable : Your Operations =============
//90 ===== GENERATED: End of Your Operations ======
}
