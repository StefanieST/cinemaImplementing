/**--- Generated at Fri Mar 05 13:35:18 CET 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaApp.commands;
import generated.cinemaApp.*;
import commands.*;
public class bookSeat_Command extends ServiceCommand<Booking>{
   private static final long serialVersionUID = -1492860500L;
   private Person person;
   private Reservation reservation;
   public bookSeat_Command(Person person, Reservation reservation){
      super();
      this.person = person;
      this.reservation = reservation;
   }
   public void execute(){
      try{this.result = CinemaApp.getInstance().bookSeat(person, reservation);
      }catch(Exception e){this.e = e;
      }finally{CinemaApp.getInstance().notifyObservers(this);}
   }
}
