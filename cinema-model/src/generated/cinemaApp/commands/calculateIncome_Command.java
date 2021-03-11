/**--- Generated at Tue Mar 09 22:50:56 CET 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaApp.commands;
import generated.cinemaApp.*;
import commands.*;
public class calculateIncome_Command extends ServiceCommand<Integer>{
   private static final long serialVersionUID = 1641726063L;
   private Showing showing;
   public calculateIncome_Command(Showing showing){
      super();
      this.showing = showing;
   }
   public void execute(){
      try{this.result = CinemaApp.getInstance().calculateIncome(showing);
      }catch(Exception e){this.e = e;
      }finally{CinemaApp.getInstance().notifyObservers(this);}
   }
}
