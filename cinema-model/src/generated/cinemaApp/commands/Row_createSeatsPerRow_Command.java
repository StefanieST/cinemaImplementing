/**--- Generated at Tue Mar 09 22:50:57 CET 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaApp.commands;
import generated.cinemaApp.*;
import commands.*;
public class Row_createSeatsPerRow_Command extends ObjectCommand<Row, Void>{
   private static final long serialVersionUID = 87045360L;
   private Integer quantityOfSeats;
   public Row_createSeatsPerRow_Command(Row receiver, Integer quantityOfSeats){
      super(receiver);
      this.quantityOfSeats = quantityOfSeats;
   }
   public void execute(){
      try{this.receiver.createSeatsPerRow(quantityOfSeats);
      }catch(Exception e){this.e = e;
      }finally{this.receiver.notifyObservers(this);}
   }
}
