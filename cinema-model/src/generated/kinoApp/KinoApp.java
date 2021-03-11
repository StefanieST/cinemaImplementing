/**--- Generated at Sun Mar 07 17:38:00 CET 2021 
 * --- Change only in Editable Sections!  
 * --- Do not touch section numbering!   
 */
package generated.kinoApp;
//10 ===== GENERATED: Import Section ==============
import db.executer.PersistenceException;
import generated.kinoApp.relationControl.*;
import utilities.InitialProxyLoader;
import utilities.InitialRelationLoader;
import utilities.InitialRelationLoader.IntegerPair;
import exceptions.ConstraintViolation;
import generated.kinoApp.proxies.*;
import observation.Observable;
import db.executer.PersistenceExecuterFactory;
import db.executer.DBDMLExecuter;
import db.connection.TypeKeyManager;
import db.connection.DBConnectionManager;
import db.connection.DBConnectionData;
import java.util.Map;
//20 ===== Editable : Your import section =========
//30 ===== GENERATED: Main Section ================
public class KinoApp extends Observable{
   DBDMLExecuter dmlExecuter = PersistenceExecuterFactory.getConfiguredFactory().getDBDMLExecuter();
   private Map<Integer,SaalProxy> saalCache;
   private Map<Integer,ReiheProxy> reiheCache;
   private Map<Integer,SitzProxy> sitzCache;
   private Map<Integer,PersonProxy> personCache;
   private static KinoApp theInstance = new KinoApp();
   private KinoApp(){
      try{DBConnectionManager.getTheInstance().openDBConnection(new DBConnectionData("jdbc:mysql://localhost:3306", "KinoApp", "root" , ""));
         TypeKeyManager.getTheInstance().initializeFor("KinoApp");
         this.loadProxies();
         this.loadRelations();
      }catch(Exception e){assert false : "Failed to establish initial database connection. Program aborted: " + e.getMessage();}
   }
   public static KinoApp getInstance(){return theInstance;}
   
// The methods loadProxies/Relations will be replaced by more intelligent lazy-load-strategies!
   private void loadProxies() throws PersistenceException{
      this.saalCache = new InitialProxyLoader<SaalProxy>("generated", "KinoApp", "kinoApp", "Saal", "Saal").perform();
      this.reiheCache = new InitialProxyLoader<ReiheProxy>("generated", "KinoApp", "kinoApp", "Reihe", "Reihe").perform();
      this.sitzCache = new InitialProxyLoader<SitzProxy>("generated", "KinoApp", "kinoApp", "Sitz", "Sitz").perform();
      this.personCache = new InitialProxyLoader<PersonProxy>("generated", "KinoApp", "kinoApp", "Person", "Person").perform();
   }
   private void loadRelations() throws PersistenceException{
      for(IntegerPair pair : new InitialRelationLoader("ReiheImSaal").perform().values()){
         String className1 = this.dmlExecuter.getNameOfConcreteType(pair.getP1(), "Saal", "KinoApp");
         String className2 = this.dmlExecuter.getNameOfConcreteType(pair.getP2(), "Reihe", "KinoApp");
         try{this.addReiheImSaalElement(pair.getP1(), className1, pair.getP2(), className2);}catch(ConstraintViolation cv){throw new PersistenceException(cv.getMessage());}
      }
      for(IntegerPair pair : new InitialRelationLoader("sitzReihe").perform().values()){
         String className1 = this.dmlExecuter.getNameOfConcreteType(pair.getP1(), "Sitz", "KinoApp");
         String className2 = this.dmlExecuter.getNameOfConcreteType(pair.getP2(), "Reihe", "KinoApp");
         try{this.addsitzReiheElement(pair.getP1(), className1, pair.getP2(), className2);}catch(ConstraintViolation cv){throw new PersistenceException(cv.getMessage());}
      }
   }
   private void addReiheImSaalElement(Integer id1, String className1, Integer id2, String className2) throws ConstraintViolation, PersistenceException{
      ISaal proxy1 = null; IReihe proxy2 = null; 
      if(className1.equals("Saal"))  proxy1 = this.saalCache.get(id1);
      if(className2.equals("Reihe"))  proxy2 = this.reiheCache.get(id2);
      ReiheImSaalSupervisor.getInstance().addAlreadyPersistent(proxy1, proxy2);
   }
   private void addsitzReiheElement(Integer id1, String className1, Integer id2, String className2) throws ConstraintViolation, PersistenceException{
      ISitz proxy1 = null; IReihe proxy2 = null; 
      if(className2.equals("Reihe"))  proxy2 = this.reiheCache.get(id2);
      if(className1.equals("Sitz"))  proxy1 = this.sitzCache.get(id1);
      sitzReiheSupervisor.getInstance().setAlreadyPersistent(proxy1, proxy2);
   }
   public Saal getSaal(Integer id){
      return this.saalCache.get(id).getTheObject();
   }
   public void addSaalProxy(SaalProxy p) throws PersistenceException{
      this.saalCache.put(p.getId(), p);
   }
   public Map<Integer,SaalProxy> getSaalCache(){
      return this.saalCache;
   }
   public Reihe getReihe(Integer id){
      return this.reiheCache.get(id).getTheObject();
   }
   public void addReiheProxy(ReiheProxy p) throws PersistenceException{
      this.reiheCache.put(p.getId(), p);
   }
   public Map<Integer,ReiheProxy> getReiheCache(){
      return this.reiheCache;
   }
   public Sitz getSitz(Integer id){
      return this.sitzCache.get(id).getTheObject();
   }
   public void addSitzProxy(SitzProxy p) throws PersistenceException{
      this.sitzCache.put(p.getId(), p);
   }
   public Map<Integer,SitzProxy> getSitzCache(){
      return this.sitzCache;
   }
   public Person getPerson(Integer id){
      return this.personCache.get(id).getTheObject();
   }
   public void addPersonProxy(PersonProxy p) throws PersistenceException{
      this.personCache.put(p.getId(), p);
   }
   public Map<Integer,PersonProxy> getPersonCache(){
      return this.personCache;
   }
   public void closeDBConnection() throws java.sql.SQLException{
      db.connection.DBConnectionManager.getTheInstance().close();
   }
   //80 ===== Editable : Your Operations =============
//90 ===== GENERATED: End of Your Operations ======
}
