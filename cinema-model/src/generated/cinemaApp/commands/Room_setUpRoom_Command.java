/**--- Generated at Fri Mar 05 13:35:19 CET 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaApp.commands;
import generated.cinemaApp.*;
import commands.*;
public class Room_setUpRoom_Command extends ObjectCommand<Room, Void>{
   private static final long serialVersionUID = -438454775L;
   public Room_setUpRoom_Command(Room receiver){
      super(receiver);
   }
   public void execute(){
      try{this.receiver.setUpRoom();
      }catch(Exception e){this.e = e;
      }finally{this.receiver.notifyObservers(this);}
   }
}
