/**--- Generated at Fri Mar 05 13:35:18 CET 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaApp.commands;
import generated.cinemaApp.*;
import commands.*;
public class Reservation_constructor_Command extends ServiceCommand<Reservation>{
   private static final long serialVersionUID = -638310737L;
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