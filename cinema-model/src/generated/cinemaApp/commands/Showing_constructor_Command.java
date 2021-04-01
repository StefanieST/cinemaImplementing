/**--- Generated at Wed Mar 31 23:30:54 CEST 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaApp.commands;
import generated.cinemaApp.*;
import commands.*;
public class Showing_constructor_Command extends ServiceCommand<Showing>{
   private static final long serialVersionUID = 2037342753L;
   private Film film;
   private Room room;
   public Showing_constructor_Command(Film film, Room room){
      super();
      this.film = film;
      this.room = room;
   }
   public void execute(){
      try{this.result = Showing.createFresh(film, room);
      }catch(Exception e){this.e = e;
      }finally{CinemaApp.getInstance().notifyObservers(this);}
   }
}
