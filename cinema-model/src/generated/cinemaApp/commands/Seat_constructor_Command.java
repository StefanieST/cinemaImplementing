/**--- Generated at Sat Mar 27 18:25:07 CET 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaApp.commands;
import generated.cinemaApp.*;
import commands.*;
public class Seat_constructor_Command extends ServiceCommand<Seat>{
   private static final long serialVersionUID = 556011115L;
   private Integer  number;
   private Row  row;
   public Seat_constructor_Command(Integer  number, Row  row){
      super();
      this.number = number;
      this.row = row;
   }
   public void execute(){
      try{this.result = Seat.createFresh(number, row);
      }catch(Exception e){this.e = e;
      }finally{CinemaApp.getInstance().notifyObservers(this);}
   }
}
