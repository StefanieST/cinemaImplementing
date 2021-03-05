/**--- Generated at Fri Mar 05 13:35:18 CET 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaApp.commands;
import generated.cinemaApp.*;
import commands.*;
public class reserveSeat_Command extends ServiceCommand<Reservation>{
   private static final long serialVersionUID = 150865794L;
   private Person person;
   private Showing showing;
   private Seat seat;
   public reserveSeat_Command(Person person, Showing showing, Seat seat){
      super();
      this.person = person;
      this.showing = showing;
      this.seat = seat;
   }
   public void execute(){
      try{this.result = CinemaApp.getInstance().reserveSeat(person, showing, seat);
      }catch(Exception e){this.e = e;
      }finally{CinemaApp.getInstance().notifyObservers(this);}
   }
}
