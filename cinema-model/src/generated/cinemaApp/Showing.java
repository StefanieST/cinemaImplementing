/**--- Generated at Sat Mar 27 18:25:07 CET 2021 
 * --- Change only in Editable Sections!  
 * --- Do not touch section numbering!   
 */
package generated.cinemaApp;
//10 ===== GENERATED:      Import Section =========
import java.sql.SQLException;
import db.connection.NoConnectionException;
import db.connection.TypeKeyManager;
import db.executer.PersistenceExecuterFactory;
import generated.cinemaApp.proxies.ShowingProxy;
import observation.Observable;
import generated.cinemaApp.proxies.IShowing;
import generated.cinemaApp.relationControl.*;
import generated.cinemaApp.proxies.*;
import db.executer.PersistenceException;
import java.util.Set;
import java.util.HashSet;
import exceptions.ConstraintViolation;
//20 ===== Editable : Your Import Section =========

//25 ===== GENERATED:      Header Section =========
public class Showing extends Observable implements java.io.Serializable, IShowing
{
   //30 ===== GENERATED:      Attribute Section ======
   private Integer id;
   //40 ===== Editable : Your Attribute Section ======
   
   //50 ===== GENERATED:      Constructor ============
   private Showing(Integer id, Film film, Room room, boolean objectOnly)
   throws PersistenceException{
      super();
      this.setId(id);
      showingFilmSupervisor.getInstance().set(this, film);
      showingRoomSupervisor.getInstance().set(this, room);
      if(objectOnly) return;
   }
   /** Caution: A Call to this Method Requires to add any newly instantiated Object to its Cache! */
   public static Showing createAlreadyPersistent(ShowingProxy proxy, Film film, Room room)throws PersistenceException{
      if(proxy.isObjectPresent()) return proxy.getTheObject();
      return new Showing(proxy.getId(), film, room, true);
   }
   public static Showing createFresh(Film film, Room room)throws PersistenceException{
      db.executer.DBDMLExecuter dmlExecuter = PersistenceExecuterFactory.getConfiguredFactory().getDBDMLExecuter();
      Integer id = dmlExecuter.getNextId();
      try{
         dmlExecuter.insertInto("Showing", "id, typeKey", 
         id.toString() + ", " + TypeKeyManager.getTheInstance().getTypeKey("CinemaApp", "Showing").toString());
      }catch(SQLException|NoConnectionException e){throw new PersistenceException(e.getMessage());}
      Showing me = new Showing(id, film, room, false);
      CinemaApp.getInstance().addShowingProxy(new ShowingProxy(me));
      return me;
   }
   //60 ===== Editable : Your Constructors ===========
   
   //70 ===== GENERATED:      Feature Access =========
   public Showing getTheObject(){
      return this;
   }
   public Integer getId(){
      return this.id;
   }
   protected void setId(Integer id){
      this.id = id;
   }
   public boolean equals(Object o) {
      if(!(o instanceof IShowing)) return false;
      return ((IShowing)o).getId().equals(this.getId());
   }
   public int hashCode() {return this.getId().hashCode();}
   public Set<Reservation> getReservation() throws PersistenceException{
      Set<Reservation> result = new HashSet<>();
      for (IReservation i : reservationShowingSupervisor.getInstance().getReservation(this)) result.add(i.getTheObject());
      return result;
   }
   public void addToReservation(Reservation arg) throws ConstraintViolation, PersistenceException{
      reservationShowingSupervisor.getInstance().add(this, arg);
   }
   public boolean removeFromReservation(Reservation arg) throws ConstraintViolation, PersistenceException{
      return reservationShowingSupervisor.getInstance().remove(this, arg);
   }
   public Film getFilm() throws PersistenceException{
      return showingFilmSupervisor.getInstance().getFilm(this).getTheObject();
   }
   public void setFilm(Film newFilm)throws PersistenceException{
      showingFilmSupervisor.getInstance().change(this, this.getFilm(), newFilm);
   }
   public Room getRoom() throws PersistenceException{
      return showingRoomSupervisor.getInstance().getRoom(this).getTheObject();
   }
   public void setRoom(Room newRoom)throws PersistenceException{
      showingRoomSupervisor.getInstance().change(this, this.getRoom(), newRoom);
   }
   //80 ===== Editable : Your Operations =============
//90 ===== GENERATED: End of Your Operations ======
}
