/**--- Generated at Sat Mar 27 18:25:07 CET 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaApp.commands;
import generated.cinemaApp.*;
import commands.*;
public class Room_constructor_Command extends ServiceCommand<Room>{
   private static final long serialVersionUID = 560685412L;
   private String  name;
   public Room_constructor_Command(String  name){
      super();
      this.name = name;
   }
   public void execute(){
      try{this.result = Room.createFresh(name);
      }catch(Exception e){this.e = e;
      }finally{CinemaApp.getInstance().notifyObservers(this);}
   }
}
