/**--- Generated at Sun Mar 07 17:38:00 CET 2021 
 * --- No Change Allowed!  
 */
package generated.kinoApp.commands;
import generated.kinoApp.*;
import commands.*;
public class Saal_reserviere_Command extends ObjectCommand<Saal, Void>{
   private static final long serialVersionUID = -1602611662L;
   private Sitz sitz;
   public Saal_reserviere_Command(Saal receiver, Sitz sitz){
      super(receiver);
      this.sitz = sitz;
   }
   public void execute(){
      try{this.receiver.reserviere(sitz);
      }catch(Exception e){this.e = e;
      }finally{this.receiver.notifyObservers(this);}
   }
}
