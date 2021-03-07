/**--- Generated at Sun Mar 07 14:53:48 CET 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaApp.commands;
import generated.cinemaApp.*;
import commands.*;
public class Room_setUpRoom_Command extends ObjectCommand<Room, Void>{
   private static final long serialVersionUID = -1656119601L;
   public Room_setUpRoom_Command(Room receiver){
      super(receiver);
   }
   public void execute(){
      try{this.receiver.setUpRoom();
      }catch(Exception e){this.e = e;
      }finally{this.receiver.notifyObservers(this);}
   }
}
