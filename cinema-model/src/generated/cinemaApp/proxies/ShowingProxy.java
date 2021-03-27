/**--- Generated at Sat Mar 27 18:25:07 CET 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaApp.proxies;
import db.executer.PersistenceException;
import java.util.Optional;
import db.executer.*;
import generated.cinemaApp.Showing;
import java.sql.ResultSet;
import generated.cinemaApp.Reservation;
import java.util.Set;
import exceptions.ConstraintViolation;
import generated.cinemaApp.Film;
import generated.cinemaApp.relationControl.showingFilmSupervisor;
import generated.cinemaApp.Room;
import generated.cinemaApp.relationControl.showingRoomSupervisor;
public class ShowingProxy implements IShowing{
   private Integer id;
   private Optional<Showing> theObject;
   private DBDMLExecuter dmlExecuter = PersistenceExecuterFactory.getConfiguredFactory().getDBDMLExecuter();
   public ShowingProxy(Integer id){
      this.id = id;
      this.theObject = Optional.empty();
   }
   public ShowingProxy(Showing theObject) throws PersistenceException{
      this(theObject.getId());
      this.theObject = Optional.of(theObject);
   }
   public boolean isObjectPresent() {
      return this.theObject.isPresent();
   }
   public Showing getTheObject()
   {
      try{if(!this.isObjectPresent()) this.theObject = Optional.of(this.load());}catch(PersistenceException pe){assert false : "Fatal Error Occured when loading an existing object from DB: " + "Showing";}
      return this.theObject.get();
   }
   public Integer getId(){
      return this.id;
   }
   public boolean equals(Object o) {
      if(!(o instanceof IShowing)) return false;
      return ((IShowing)o).getId().equals(this.getId());
   }
   public int hashCode() {return this.getId().hashCode();}
   private Showing load() throws PersistenceException {
      ResultSet rs = null;
      try {
         rs = DBExecuterFactory.getConfiguredFactory().getDBDMLExecuter().selectIdSpecifiedCursorAleadyAtFirstRow("Showing", this.id);
         Film film = showingFilmSupervisor.getInstance().getFilm(this).getTheObject();
         Room room = showingRoomSupervisor.getInstance().getRoom(this).getTheObject();
         return Showing.createAlreadyPersistent(this, film, room);
      } catch (Exception e) {throw new PersistenceException(e.getMessage());}
   }
   public Set<Reservation> getReservation() throws PersistenceException{
      return this.getTheObject().getReservation();
   }
   public void addToReservation(Reservation arg) throws ConstraintViolation, PersistenceException{
      this.getTheObject().addToReservation(arg);
   }
   public boolean removeFromReservation(Reservation arg) throws ConstraintViolation, PersistenceException{
      return this.getTheObject().removeFromReservation(arg);
   }
   public Film getFilm() throws PersistenceException{
      return this.getTheObject().getFilm();
   }
   public void setFilm(Film newFilm)throws PersistenceException{
      this.getTheObject().setFilm(newFilm);
   }
   public Room getRoom() throws PersistenceException{
      return this.getTheObject().getRoom();
   }
   public void setRoom(Room newRoom)throws PersistenceException{
      this.getTheObject().setRoom(newRoom);
   }
}
