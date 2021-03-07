/**--- Generated at Sun Mar 07 18:18:53 CET 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaApp.commands;
import generated.cinemaApp.*;
import commands.*;
public class Room_setUpRoom_Command extends ObjectCommand<Room, Void>{
   private static final long serialVersionUID = 1745559485L;
   private Integer quantityRows;
   private Integer quantitySeats;
   public Room_setUpRoom_Command(Room receiver, Integer quantityRows, Integer quantitySeats){
      super(receiver);
      this.quantityRows = quantityRows;
      this.quantitySeats = quantitySeats;
   }
   public void execute(){
      try{this.receiver.setUpRoom(quantityRows, quantitySeats);
      }catch(Exception e){this.e = e;
      }finally{this.receiver.notifyObservers(this);}
   }
}
