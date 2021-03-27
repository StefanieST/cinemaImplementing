/**--- Generated at Sat Mar 27 14:30:31 CET 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaApp.commands;
import generated.cinemaApp.*;
import commands.*;
public class Booking_constructor_Command extends ServiceCommand<Booking>{
   private static final long serialVersionUID = 1447802901L;
   public Booking_constructor_Command(){
      super();
   }
   public void execute(){
      try{this.result = Booking.createFresh();
      }catch(Exception e){this.e = e;
      }finally{CinemaApp.getInstance().notifyObservers(this);}
   }
}
