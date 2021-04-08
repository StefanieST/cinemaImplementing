	/**--- Generated at Wed Mar 03 11:50:31 CET 2021 
	 * --- No Change Allowed!  
	 */
	package generated.cinemaApp.commands;
	import generated.cinemaApp.*;
	import commands.*;
	import java.util.Collection;
	public class getAllShowings_Command extends ServiceCommand<Collection<Integer>>{
	   private static final long serialVersionUID = -1654820935L;
	   public getAllShowings_Command(){
	      super();
	   }
	   public void execute(){
	      try{this.result = CinemaApp.getInstance().getAllShowings();;
	      }catch(Exception e){this.e = e;
	      }finally{CinemaApp.getInstance().notifyObservers(this);}
	   }
	}

