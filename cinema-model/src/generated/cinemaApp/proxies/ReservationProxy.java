/**--- Generated at Sun Mar 07 14:53:48 CET 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaApp.proxies;
import db.executer.PersistenceException;
import java.util.Optional;
import db.executer.*;
import generated.cinemaApp.Reservation;
import java.sql.ResultSet;
import generated.cinemaApp.Person;
import generated.cinemaApp.relationControl.personReservationSupervisor;
import generated.cinemaApp.Booking;
import generated.cinemaApp.Seat;
import generated.cinemaApp.relationControl.reservationSeatSupervisor;
import generated.cinemaApp.Showing;
import java.util.Set;
public class ReservationProxy implements IReservation{
   private Integer id;
   private Optional<Reservation> theObject;
   private DBDMLExecuter dmlExecuter = PersistenceExecuterFactory.getConfiguredFactory().getDBDMLExecuter();
   public ReservationProxy(Integer id){
      this.id = id;
      this.theObject = Optional.empty();
   }
   public ReservationProxy(Reservation theObject) throws PersistenceException{
      this(theObject.getId());
      this.theObject = Optional.of(theObject);
   }
   public boolean isObjectPresent() {
      return this.theObject.isPresent();
   }
   public Reservation getTheObject()
   {
      try{if(!this.isObjectPresent()) this.theObject = Optional.of(this.load());}catch(PersistenceException pe){assert false : "Fatal Error Occured when loading an existing object from DB: " + "Reservation";}
      return this.theObject.get();
   }
   public Integer getId(){
      return this.id;
   }
   public boolean equals(Object o) {
      if(!(o instanceof IReservation)) return false;
      return ((IReservation)o).getId().equals(this.getId());
   }
   public int hashCode() {return this.getId().hashCode();}
   private Reservation load() throws PersistenceException {
      ResultSet rs = null;
      try {
         rs = DBExecuterFactory.getConfiguredFactory().getDBDMLExecuter().selectIdSpecifiedCursorAleadyAtFirstRow("Reservation", this.id);
         Person person = personReservationSupervisor.getInstance().getPerson(this).getTheObject();
         Seat seat = reservationSeatSupervisor.getInstance().getSeat(this).getTheObject();
         return Reservation.createAlreadyPersistent(this, person, seat);
      } catch (Exception e) {throw new PersistenceException(e.getMessage());}
   }
   public Person getPerson() throws PersistenceException{
      return this.getTheObject().getPerson();
   }
   public void setPerson(Person newPerson)throws PersistenceException{
      this.getTheObject().setPerson(newPerson);
   }
   public Optional<Booking> getBooking() throws PersistenceException{
      return this.getTheObject().getBooking();
   }
   public void setBooking(Booking newBooking)throws PersistenceException{
      this.getTheObject().setBooking(newBooking);
   }
   public Seat getSeat() throws PersistenceException{
      return this.getTheObject().getSeat();
   }
   public void setSeat(Seat newSeat)throws PersistenceException{
      this.getTheObject().setSeat(newSeat);
   }
   public Set<Showing> getShowing() throws PersistenceException{
      return this.getTheObject().getShowing();
   }
}
