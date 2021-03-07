/**--- Generated at Sun Mar 07 18:18:53 CET 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaApp.commands;
import generated.cinemaApp.*;
import commands.*;
public class Room_constructor_Command extends ServiceCommand<Room>{
   private static final long serialVersionUID = 1602209812L;
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
