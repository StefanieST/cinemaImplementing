/**--- Generated at Sun Mar 07 14:53:48 CET 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaApp.commands;
import generated.cinemaApp.*;
import commands.*;
public class Room_openRoom_Command extends ObjectCommand<Room, Void>{
   private static final long serialVersionUID = 990753734L;
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
