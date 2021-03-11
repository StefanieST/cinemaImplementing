/**--- Generated at Sun Mar 07 17:38:00 CET 2021 
 * --- No Change Allowed!  
 */
package generated.kinoApp.commands;
import generated.kinoApp.*;
import commands.*;
public class Saal_constructor_Command extends ServiceCommand<Saal>{
   private static final long serialVersionUID = -1050564813L;
   private String  updata;
   public Saal_constructor_Command(String  updata){
      super();
      this.updata = updata;
   }
   public void execute(){
      try{this.result = Saal.createFresh(updata);
      }catch(Exception e){this.e = e;
      }finally{KinoApp.getInstance().notifyObservers(this);}
   }
}
