/**--- Generated at Tue Mar 09 22:50:56 CET 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaApp.commands;
import generated.cinemaApp.*;
import commands.*;
public class reserveSeat_Command extends ServiceCommand<Reservation>{
   private static final long serialVersionUID = 1652121312L;
   private Person person;
   private Showing showing;
   private Row row;
   public reserveSeat_Command(Person person, Showing showing, Row row){
      super();
      this.person = person;
      this.showing = showing;
      this.row = row;
   }
   public void execute(){
      try{this.result = CinemaApp.getInstance().reserveSeat(person, showing, row);
      }catch(Exception e){this.e = e;
      }finally{CinemaApp.getInstance().notifyObservers(this);}
   }
}
