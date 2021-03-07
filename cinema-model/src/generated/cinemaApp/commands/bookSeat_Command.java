/**--- Generated at Sun Mar 07 14:53:48 CET 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaApp.commands;
import generated.cinemaApp.*;
import commands.*;
public class bookSeat_Command extends ServiceCommand<Booking>{
   private static final long serialVersionUID = 634309414L;
   private Person person;
   public bookSeat_Command(Person person){
      super();
      this.person = person;
   }
   public void execute(){
      try{this.result = CinemaApp.getInstance().bookSeat(person);
      }catch(Exception e){this.e = e;
      }finally{CinemaApp.getInstance().notifyObservers(this);}
   }
}
