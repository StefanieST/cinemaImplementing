/**--- Generated at Thu Mar 11 23:51:08 CET 2021 
 * --- Change only in Editable Sections!  
 * --- Do not touch section numbering!   
 */
package generated.cinemaApp;
//10 ===== GENERATED: Import Section ==============
import db.executer.PersistenceException;
import generated.cinemaApp.relationControl.*;
import utilities.InitialProxyLoader;
import utilities.InitialRelationLoader;
import utilities.InitialRelationLoader.IntegerPair;
import exceptions.ConstraintViolation;
import generated.cinemaApp.proxies.*;
import observation.Observable;
import db.executer.PersistenceExecuterFactory;
import db.executer.DBDMLExecuter;
import db.connection.TypeKeyManager;
import db.connection.DBConnectionManager;
import db.connection.DBConnectionData;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
//20 ===== Editable : Your import section =========
//30 ===== GENERATED: Main Section ================
public class CinemaApp extends Observable{
   DBDMLExecuter dmlExecuter = PersistenceExecuterFactory.getConfiguredFactory().getDBDMLExecuter();
   private Map<Integer,BookingProxy> bookingCache;
   private Map<Integer,ReservationProxy> reservationCache;
   private Map<Integer,PersonProxy> personCache;
   private Map<Integer,ShowingProxy> showingCache;
   private Map<Integer,FilmProxy> filmCache;
   private Map<Integer,RoomProxy> roomCache;
   private Map<Integer,RowProxy> rowCache;
   private Map<Integer,SeatProxy> seatCache;
   private static CinemaApp theInstance = new CinemaApp();
   private CinemaApp(){
      try{DBConnectionManager.getTheInstance().openDBConnection(new DBConnectionData("jdbc:mysql://localhost:3306", "CinemaApp", "root" , ""));
         TypeKeyManager.getTheInstance().initializeFor("CinemaApp");
         this.loadProxies();
         this.loadRelations();
      }catch(Exception e){assert false : "Failed to establish initial database connection. Program aborted: " + e.getMessage();}
   }
   public static CinemaApp getInstance(){return theInstance;}
   
// The methods loadProxies/Relations will be replaced by more intelligent lazy-load-strategies!
   private void loadProxies() throws PersistenceException{
      this.bookingCache = new InitialProxyLoader<BookingProxy>("generated", "CinemaApp", "cinemaApp", "Booking", "Booking").perform();
      this.reservationCache = new InitialProxyLoader<ReservationProxy>("generated", "CinemaApp", "cinemaApp", "Reservation", "Reservation").perform();
      this.personCache = new InitialProxyLoader<PersonProxy>("generated", "CinemaApp", "cinemaApp", "Person", "Person").perform();
      this.showingCache = new InitialProxyLoader<ShowingProxy>("generated", "CinemaApp", "cinemaApp", "Showing", "Showing").perform();
      this.filmCache = new InitialProxyLoader<FilmProxy>("generated", "CinemaApp", "cinemaApp", "Film", "Film").perform();
      this.roomCache = new InitialProxyLoader<RoomProxy>("generated", "CinemaApp", "cinemaApp", "Room", "Room").perform();
      this.rowCache = new InitialProxyLoader<RowProxy>("generated", "CinemaApp", "cinemaApp", "Row", "Row").perform();
      this.seatCache = new InitialProxyLoader<SeatProxy>("generated", "CinemaApp", "cinemaApp", "Seat", "Seat").perform();
   }
   private void loadRelations() throws PersistenceException{
      for(IntegerPair pair : new InitialRelationLoader("personReservation").perform().values()){
         String className1 = this.dmlExecuter.getNameOfConcreteType(pair.getP1(), "Reservation", "CinemaApp");
         String className2 = this.dmlExecuter.getNameOfConcreteType(pair.getP2(), "Person", "CinemaApp");
         try{this.addpersonReservationElement(pair.getP1(), className1, pair.getP2(), className2);}catch(ConstraintViolation cv){throw new PersistenceException(cv.getMessage());}
      }
      for(IntegerPair pair : new InitialRelationLoader("reservationBooking").perform().values()){
         String className1 = this.dmlExecuter.getNameOfConcreteType(pair.getP1(), "Reservation", "CinemaApp");
         String className2 = this.dmlExecuter.getNameOfConcreteType(pair.getP2(), "Booking", "CinemaApp");
         try{this.addreservationBookingElement(pair.getP1(), className1, pair.getP2(), className2);}catch(ConstraintViolation cv){throw new PersistenceException(cv.getMessage());}
      }
      for(IntegerPair pair : new InitialRelationLoader("reservationShowing").perform().values()){
         String className1 = this.dmlExecuter.getNameOfConcreteType(pair.getP1(), "Showing", "CinemaApp");
         String className2 = this.dmlExecuter.getNameOfConcreteType(pair.getP2(), "Reservation", "CinemaApp");
         try{this.addreservationShowingElement(pair.getP1(), className1, pair.getP2(), className2);}catch(ConstraintViolation cv){throw new PersistenceException(cv.getMessage());}
      }
      for(IntegerPair pair : new InitialRelationLoader("reservationSeat").perform().values()){
         String className1 = this.dmlExecuter.getNameOfConcreteType(pair.getP1(), "Reservation", "CinemaApp");
         String className2 = this.dmlExecuter.getNameOfConcreteType(pair.getP2(), "Seat", "CinemaApp");
         try{this.addreservationSeatElement(pair.getP1(), className1, pair.getP2(), className2);}catch(ConstraintViolation cv){throw new PersistenceException(cv.getMessage());}
      }
      for(IntegerPair pair : new InitialRelationLoader("showingFilm").perform().values()){
         String className1 = this.dmlExecuter.getNameOfConcreteType(pair.getP1(), "Showing", "CinemaApp");
         String className2 = this.dmlExecuter.getNameOfConcreteType(pair.getP2(), "Film", "CinemaApp");
         try{this.addshowingFilmElement(pair.getP1(), className1, pair.getP2(), className2);}catch(ConstraintViolation cv){throw new PersistenceException(cv.getMessage());}
      }
      for(IntegerPair pair : new InitialRelationLoader("showingRoom").perform().values()){
         String className1 = this.dmlExecuter.getNameOfConcreteType(pair.getP1(), "Showing", "CinemaApp");
         String className2 = this.dmlExecuter.getNameOfConcreteType(pair.getP2(), "Room", "CinemaApp");
         try{this.addshowingRoomElement(pair.getP1(), className1, pair.getP2(), className2);}catch(ConstraintViolation cv){throw new PersistenceException(cv.getMessage());}
      }
      for(IntegerPair pair : new InitialRelationLoader("rowRoom").perform().values()){
         String className1 = this.dmlExecuter.getNameOfConcreteType(pair.getP1(), "Room", "CinemaApp");
         String className2 = this.dmlExecuter.getNameOfConcreteType(pair.getP2(), "Row", "CinemaApp");
         try{this.addrowRoomElement(pair.getP1(), className1, pair.getP2(), className2);}catch(ConstraintViolation cv){throw new PersistenceException(cv.getMessage());}
      }
      for(IntegerPair pair : new InitialRelationLoader("rowSeat").perform().values()){
         String className1 = this.dmlExecuter.getNameOfConcreteType(pair.getP1(), "Row", "CinemaApp");
         String className2 = this.dmlExecuter.getNameOfConcreteType(pair.getP2(), "Seat", "CinemaApp");
         try{this.addrowSeatElement(pair.getP1(), className1, pair.getP2(), className2);}catch(ConstraintViolation cv){throw new PersistenceException(cv.getMessage());}
      }
      for(IntegerPair pair : new InitialRelationLoader("rowCategory").perform().values()){
         String className1 = this.dmlExecuter.getNameOfConcreteType(pair.getP1(), "Row", "CinemaApp");
         String className2 = this.dmlExecuter.getNameOfConcreteType(pair.getP2(), "Category", "CinemaApp");
         try{this.addrowCategoryElement(pair.getP1(), className1, pair.getP2(), className2);}catch(ConstraintViolation cv){throw new PersistenceException(cv.getMessage());}
      }
   }
   private void addpersonReservationElement(Integer id1, String className1, Integer id2, String className2) throws ConstraintViolation, PersistenceException{
      IReservation proxy1 = null; IPerson proxy2 = null; 
      if(className1.equals("Reservation"))  proxy1 = this.reservationCache.get(id1);
      if(className2.equals("Person"))  proxy2 = this.personCache.get(id2);
      personReservationSupervisor.getInstance().setAlreadyPersistent(proxy1, proxy2);
   }
   private void addreservationBookingElement(Integer id1, String className1, Integer id2, String className2) throws ConstraintViolation, PersistenceException{
      IReservation proxy1 = null; IBooking proxy2 = null; 
      if(className2.equals("Booking"))  proxy2 = this.bookingCache.get(id2);
      if(className1.equals("Reservation"))  proxy1 = this.reservationCache.get(id1);
      reservationBookingSupervisor.getInstance().setAlreadyPersistent(proxy1, proxy2);
   }
   private void addreservationShowingElement(Integer id1, String className1, Integer id2, String className2) throws ConstraintViolation, PersistenceException{
      IShowing proxy1 = null; IReservation proxy2 = null; 
      if(className2.equals("Reservation"))  proxy2 = this.reservationCache.get(id2);
      if(className1.equals("Showing"))  proxy1 = this.showingCache.get(id1);
      reservationShowingSupervisor.getInstance().addAlreadyPersistent(proxy1, proxy2);
   }
   private void addreservationSeatElement(Integer id1, String className1, Integer id2, String className2) throws ConstraintViolation, PersistenceException{
      IReservation proxy1 = null; ISeat proxy2 = null; 
      if(className1.equals("Reservation"))  proxy1 = this.reservationCache.get(id1);
      if(className2.equals("Seat"))  proxy2 = this.seatCache.get(id2);
      reservationSeatSupervisor.getInstance().setAlreadyPersistent(proxy1, proxy2);
   }
   private void addshowingFilmElement(Integer id1, String className1, Integer id2, String className2) throws ConstraintViolation, PersistenceException{
      IShowing proxy1 = null; IFilm proxy2 = null; 
      if(className1.equals("Showing"))  proxy1 = this.showingCache.get(id1);
      if(className2.equals("Film"))  proxy2 = this.filmCache.get(id2);
      showingFilmSupervisor.getInstance().setAlreadyPersistent(proxy1, proxy2);
   }
   private void addshowingRoomElement(Integer id1, String className1, Integer id2, String className2) throws ConstraintViolation, PersistenceException{
      IShowing proxy1 = null; IRoom proxy2 = null; 
      if(className1.equals("Showing"))  proxy1 = this.showingCache.get(id1);
      if(className2.equals("Room"))  proxy2 = this.roomCache.get(id2);
      showingRoomSupervisor.getInstance().setAlreadyPersistent(proxy1, proxy2);
   }
   private void addrowRoomElement(Integer id1, String className1, Integer id2, String className2) throws ConstraintViolation, PersistenceException{
      IRoom proxy1 = null; IRow proxy2 = null; 
      if(className1.equals("Room"))  proxy1 = this.roomCache.get(id1);
      if(className2.equals("Row"))  proxy2 = this.rowCache.get(id2);
      rowRoomSupervisor.getInstance().addAlreadyPersistent(proxy1, proxy2);
   }
   private void addrowSeatElement(Integer id1, String className1, Integer id2, String className2) throws ConstraintViolation, PersistenceException{
      IRow proxy1 = null; ISeat proxy2 = null; 
      if(className1.equals("Row"))  proxy1 = this.rowCache.get(id1);
      if(className2.equals("Seat"))  proxy2 = this.seatCache.get(id2);
      rowSeatSupervisor.getInstance().addAlreadyPersistent(proxy1, proxy2);
   }
   private void addrowCategoryElement(Integer id1, String className1, Integer id2, String className2) throws ConstraintViolation, PersistenceException{
      IRow proxy1 = null; ICategory proxy2 = null; 
      if(className1.equals("Row"))  proxy1 = this.rowCache.get(id1);
      if(className2.equals("Stall"))  proxy2 = Stall.getInstance();
      if(className2.equals("Box"))  proxy2 = Box.getInstance();
      if(className2.equals("Balcony"))  proxy2 = Balcony.getInstance();
      rowCategorySupervisor.getInstance().setAlreadyPersistent(proxy1, proxy2);
   }
   public Booking getBooking(Integer id){
      return this.bookingCache.get(id).getTheObject();
   }
   public void addBookingProxy(BookingProxy p) throws PersistenceException{
      this.bookingCache.put(p.getId(), p);
   }
   public Map<Integer,BookingProxy> getBookingCache(){
      return this.bookingCache;
   }
   public Reservation getReservation(Integer id){
      return this.reservationCache.get(id).getTheObject();
   }
   public void addReservationProxy(ReservationProxy p) throws PersistenceException{
      this.reservationCache.put(p.getId(), p);
   }
   public Map<Integer,ReservationProxy> getReservationCache(){
      return this.reservationCache;
   }
   public Person getPerson(Integer id){
      return this.personCache.get(id).getTheObject();
   }
   public void addPersonProxy(PersonProxy p) throws PersistenceException{
      this.personCache.put(p.getId(), p);
   }
   public Map<Integer,PersonProxy> getPersonCache(){
      return this.personCache;
   }
   public Showing getShowing(Integer id){
      return this.showingCache.get(id).getTheObject();
   }
   public void addShowingProxy(ShowingProxy p) throws PersistenceException{
      this.showingCache.put(p.getId(), p);
   }
   public Map<Integer,ShowingProxy> getShowingCache(){
      return this.showingCache;
   }
   public Film getFilm(Integer id){
      return this.filmCache.get(id).getTheObject();
   }
   public void addFilmProxy(FilmProxy p) throws PersistenceException{
      this.filmCache.put(p.getId(), p);
   }
   public Map<Integer,FilmProxy> getFilmCache(){
      return this.filmCache;
   }
   public Room getRoom(Integer id){
      return this.roomCache.get(id).getTheObject();
   }
   public void addRoomProxy(RoomProxy p) throws PersistenceException{
      this.roomCache.put(p.getId(), p);
   }
   public Map<Integer,RoomProxy> getRoomCache(){
      return this.roomCache;
   }
   public Row getRow(Integer id){
      return this.rowCache.get(id).getTheObject();
   }
   public void addRowProxy(RowProxy p) throws PersistenceException{
      this.rowCache.put(p.getId(), p);
   }
   public Map<Integer,RowProxy> getRowCache(){
      return this.rowCache;
   }
   public Seat getSeat(Integer id){
      return this.seatCache.get(id).getTheObject();
   }
   public void addSeatProxy(SeatProxy p) throws PersistenceException{
      this.seatCache.put(p.getId(), p);
   }
   public Map<Integer,SeatProxy> getSeatCache(){
      return this.seatCache;
   }
   public void closeDBConnection() throws java.sql.SQLException{
      db.connection.DBConnectionManager.getTheInstance().close();
   }
   //80 ===== Editable : Your Operations =============
/**
 * person reserves one seat in a chosen showing
 */
   public Reservation reserveSeat(Person person, Showing showing, Row row)throws NotAvailable, ModelException{
	   Set<Reservation> reservations = showing.getReservation();
	   List<Seat> seats = row.getSeats();
	   for (Seat seat : seats) {
		   for (Reservation reservation : reservations) {
			 if(!seat.equals(reservation.getSeat())){
				 Reservation.createFresh(person, seat, showing);
			 }
		}
		  
		
	}
	   //if(showing.getReservation().)
	   //Reservation reservation = Reservation.createFresh(person, row., showing)
      return null;
   }
/**
 * return the income of a chosen showing
 */
   public Integer calculateIncome(Showing showing) throws ModelException{
	   Set<Reservation> reservations = showing.getReservation();
	   Integer result = 0; 
	   for (Reservation reservation : reservations) {
		if(reservation.getBooking().isPresent()) {
			result = result + reservation.getSeat().getRow().getCategory().getPrice().orElse(0);	
		} 
	}
	return result;
   }
/**
 * person books reservation which was made before
 */
   public Booking bookSeat(Person person){
      // TODO: Implement Operation bookSeat
      return null;
   }
//90 ===== GENERATED: End of Your Operations ======
}
