/**--- Generated at Sun Mar 07 17:38:01 CET 2021 
 * --- No Change Allowed!  
 */
package generated.kinoApp.commands;
import generated.kinoApp.*;
import commands.*;
public class Person_constructor_Command extends ServiceCommand<Person>{
   private static final long serialVersionUID = -869158821L;
   public Person_constructor_Command(){
      super();
   }
   public void execute(){
      try{this.result = Person.createFresh();
      }catch(Exception e){this.e = e;
      }finally{KinoApp.getInstance().notifyObservers(this);}
   }
}
