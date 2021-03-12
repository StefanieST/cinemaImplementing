/**--- Generated at Thu Mar 11 23:51:08 CET 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaApp.commands;
import generated.cinemaApp.*;
import commands.*;
public class Booking_constructor_Command extends ServiceCommand<Booking>{
   private static final long serialVersionUID = 584763638L;
   public Booking_constructor_Command(){
      super();
   }
   public void execute(){
      try{this.result = Booking.createFresh();
      }catch(Exception e){this.e = e;
      }finally{CinemaApp.getInstance().notifyObservers(this);}
   }
}
