/**--- Generated at Fri Mar 05 13:35:19 CET 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaApp.commands;
import generated.cinemaApp.*;
import commands.*;
public class Room_generateInitialRoom_Command extends ObjectCommand<Room, Void>{
   private static final long serialVersionUID = -1140820588L;
   public Room_generateInitialRoom_Command(Room receiver){
      super(receiver);
   }
   public void execute(){
      try{this.receiver.generateInitialRoom();
      }catch(Exception e){this.e = e;
      }finally{this.receiver.notifyObservers(this);}
   }
}
