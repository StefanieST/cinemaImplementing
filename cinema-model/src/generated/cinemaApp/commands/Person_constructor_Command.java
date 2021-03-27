/**--- Generated at Sat Mar 27 14:30:31 CET 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaApp.commands;
import generated.cinemaApp.*;
import commands.*;
public class Person_constructor_Command extends ServiceCommand<Person>{
   private static final long serialVersionUID = -831682837L;
   private String  name;
   public Person_constructor_Command(String  name){
      super();
      this.name = name;
   }
   public void execute(){
      try{this.result = Person.createFresh(name);
      }catch(Exception e){this.e = e;
      }finally{CinemaApp.getInstance().notifyObservers(this);}
   }
}
