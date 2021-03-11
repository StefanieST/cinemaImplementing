/**--- Generated at Sun Mar 07 17:38:01 CET 2021 
 * --- No Change Allowed!  
 */
package generated.kinoApp.commands;
import generated.kinoApp.*;
import commands.*;
public class Sitz_constructor_Command extends ServiceCommand<Sitz>{
   private static final long serialVersionUID = -253033141L;
   private Reihe reihe;
   private Integer  nummer;
   public Sitz_constructor_Command(Reihe reihe, Integer  nummer){
      super();
      this.reihe = reihe;
      this.nummer = nummer;
   }
   public void execute(){
      try{this.result = Sitz.createFresh(reihe, nummer);
      }catch(Exception e){this.e = e;
      }finally{KinoApp.getInstance().notifyObservers(this);}
   }
}
