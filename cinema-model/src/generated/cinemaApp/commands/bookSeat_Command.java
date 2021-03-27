/**--- Generated at Tue Mar 09 22:50:56 CET 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaApp.commands;
import generated.cinemaApp.*;
import commands.*;
public class bookSeat_Command extends ServiceCommand<Booking>{
   private static final long serialVersionUID = 1887568590L;
   private Person person;
   private Showing showing;
   public bookSeat_Command(Person person, Showing showing){
      super();
      this.person = person;
      this.showing = showing;
   }
   public void execute(){
      try{this.result = CinemaApp.getInstance().bookSeat(person, showing);
      }catch(Exception e){this.e = e;
      }finally{CinemaApp.getInstance().notifyObservers(this);}
   }
}
