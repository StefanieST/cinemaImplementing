/**--- Generated at Fri Mar 05 13:35:19 CET 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaApp.commands;
import generated.cinemaApp.*;
import commands.*;
public class Room_openRoom_Command extends ObjectCommand<Room, Void>{
   private static final long serialVersionUID = -890664594L;
   private Room room;
   public Room_openRoom_Command(Room receiver, Room room){
      super(receiver);
      this.room = room;
   }
   public void execute(){
      try{this.receiver.openRoom(room);
      }catch(Exception e){this.e = e;
      }finally{this.receiver.notifyObservers(this);}
   }
}