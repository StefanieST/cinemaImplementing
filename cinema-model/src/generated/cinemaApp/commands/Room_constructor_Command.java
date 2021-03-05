/**--- Generated at Fri Mar 05 13:35:19 CET 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaApp.commands;
import generated.cinemaApp.*;
import commands.*;
public class Room_constructor_Command extends ServiceCommand<Room>{
   private static final long serialVersionUID = -760255137L;
   private String  name;
   private Boolean  isOpen;
   public Room_constructor_Command(String  name, Boolean  isOpen){
      super();
      this.name = name;
      this.isOpen = isOpen;
   }
   public void execute(){
      try{this.result = Room.createFresh(name, isOpen);
      }catch(Exception e){this.e = e;
      }finally{CinemaApp.getInstance().notifyObservers(this);}
   }
}
