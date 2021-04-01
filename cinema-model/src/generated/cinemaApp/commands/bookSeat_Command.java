/**--- Generated at Wed Mar 31 23:30:53 CEST 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaApp.commands;
import generated.cinemaApp.*;
import commands.*;
public class bookSeat_Command extends ServiceCommand<Booking>{
   private static final long serialVersionUID = 772194858L;
   private Reservation reservation;
   public bookSeat_Command(Reservation reservation){
      super();
      this.reservation = reservation;
   }
   public void execute(){
      try{this.result = CinemaApp.getInstance().bookSeat(reservation);
      }catch(Exception e){this.e = e;
      }finally{CinemaApp.getInstance().notifyObservers(this);}
   }
}
