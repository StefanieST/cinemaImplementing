/**--- Generated at Thu Apr 08 13:20:09 CEST 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaApp.commands;
import generated.cinemaApp.*;
import commands.*;
public class Row_constructor_Command extends ServiceCommand<Row>{
   private static final long serialVersionUID = -1995669394L;
   private Category category;
   private String  name;
   private Room  room;
   public Row_constructor_Command(Category category, String  name, Room  room){
      super();
      this.category = category;
      this.name = name;
      this.room = room;
   }
   public void execute(){
      try{this.result = Row.createFresh(category, name, room);
      }catch(Exception e){this.e = e;
      }finally{CinemaApp.getInstance().notifyObservers(this);}
   }
}
