/**--- Generated at Sun Mar 07 17:38:00 CET 2021 
 * --- No Change Allowed!  
 */
package generated.kinoApp.commands;
import generated.kinoApp.*;
import commands.*;
public class Reihe_constructor_Command extends ServiceCommand<Reihe>{
   private static final long serialVersionUID = -1817887127L;
   private Integer  nummer;
   private Saal  container;
   public Reihe_constructor_Command(Integer  nummer, Saal  container){
      super();
      this.nummer = nummer;
      this.container = container;
   }
   public void execute(){
      try{this.result = Reihe.createFresh(nummer, container);
      }catch(Exception e){this.e = e;
      }finally{KinoApp.getInstance().notifyObservers(this);}
   }
}
