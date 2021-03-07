/**--- Generated at Sun Mar 07 14:53:48 CET 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaApp.commands;
import generated.cinemaApp.*;
import commands.*;
public class Room_generateInitialRoom_Command extends ObjectCommand<Room, Void>{
   private static final long serialVersionUID = 2120660475L;
   public Room_generateInitialRoom_Command(Room receiver){
      super(receiver);
   }
   public void execute(){
      try{this.receiver.generateInitialRoom();
      }catch(Exception e){this.e = e;
      }finally{this.receiver.notifyObservers(this);}
   }
}
