/**--- Generated at Wed Mar 31 23:30:53 CEST 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaApp.commands;
import generated.cinemaApp.*;
import commands.*;
public class Reservation_constructor_Command extends ServiceCommand<Reservation>{
   private static final long serialVersionUID = -587899371L;
   private Person person;
   private Seat seat;
   private Showing  showing;
   public Reservation_constructor_Command(Person person, Seat seat, Showing  showing){
      super();
      this.person = person;
      this.seat = seat;
      this.showing = showing;
   }
   public void execute(){
      try{this.result = Reservation.createFresh(person, seat, showing);
      }catch(Exception e){this.e = e;
      }finally{CinemaApp.getInstance().notifyObservers(this);}
   }
}
