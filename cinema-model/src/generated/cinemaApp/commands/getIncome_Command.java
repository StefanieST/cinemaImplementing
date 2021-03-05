/**--- Generated at Fri Mar 05 13:35:18 CET 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaApp.commands;
import generated.cinemaApp.*;
import commands.*;
public class getIncome_Command extends ServiceCommand<Integer>{
   private static final long serialVersionUID = 821715677L;
   private Showing showing;
   public getIncome_Command(Showing showing){
      super();
      this.showing = showing;
   }
   public void execute(){
      try{this.result = CinemaApp.getInstance().getIncome(showing);
      }catch(Exception e){this.e = e;
      }finally{CinemaApp.getInstance().notifyObservers(this);}
   }
}
