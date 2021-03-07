/**--- Generated at Sun Mar 07 14:53:48 CET 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaApp.commands;
import generated.cinemaApp.*;
import commands.*;
public class Reservation_constructor_Command extends ServiceCommand<Reservation>{
   private static final long serialVersionUID = -1994821154L;
   private Person person;
   private Seat seat;
   public Reservation_constructor_Command(Person person, Seat seat){
      super();
      this.person = person;
      this.seat = seat;
   }
   public void execute(){
      try{this.result = Reservation.createFresh(person, seat);
      }catch(Exception e){this.e = e;
      }finally{CinemaApp.getInstance().notifyObservers(this);}
   }
}
