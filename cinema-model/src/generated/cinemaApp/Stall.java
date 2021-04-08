/**--- Generated at Thu Apr 08 13:20:09 CEST 2021 
 * --- Change only in Editable Sections!  
 * --- Do not touch section numbering!   
 */
package generated.cinemaApp;
//10 ===== GENERATED:      Import Section =========
import java.sql.SQLException;
import db.connection.NoConnectionException;
import db.connection.TypeKeyManager;
import java.util.Optional;
import java.sql.ResultSet;
import db.executer.DBExecuterFactory;
import db.executer.PersistenceException;
import db.executer.PersistenceExecuterFactory;
import generated.cinemaApp.proxies.IStall;
import exceptions.ConstraintViolation;
//20 ===== Editable : Your Import Section =========

//25 ===== GENERATED:      Header Section =========
public class Stall extends Category implements java.io.Serializable, IStall
{
   //30 ===== GENERATED:      Attribute Section ======
   private static Optional<Stall> theInstance = Optional.empty();
   //40 ===== Editable : Your Attribute Section ======
   
   //50 ===== GENERATED:      Constructor ============
   private Stall(Integer id, Optional<String> name, Optional<Integer> price, boolean objectOnly)
   {
      super(id, name, price, objectOnly);
      if(objectOnly) return;
   }
   private static Stall createAlreadyPersistent(Integer id, Optional<String> name, Optional<Integer> price){
      return new Stall(id, name, price, true);
   }
   //60 ===== Editable : Your Constructors ===========
   
   //70 ===== GENERATED:      Feature Access =========
   public static Stall getInstance() throws PersistenceException{
      if(!theInstance.isPresent())theInstance = Optional.of(load());
      return theInstance.get();
   }
   private static Stall load() throws PersistenceException {
      try{
         Integer typeKey = TypeKeyManager.getTheInstance().getTypeKey("CinemaApp", "Stall");
         ResultSet rs = DBExecuterFactory.getConfiguredFactory().getDBDMLExecuter().selectEntriesOfTable("Category", typeKey);
         rs.next();
         Optional<String> name = (rs.getObject("name") == null ? Optional.empty() : Optional.of(rs.getString("name")));
         Optional<Integer> price = (rs.getObject("price") == null ? Optional.empty() : Optional.of(rs.getInt("price")));
         return Stall.createAlreadyPersistent(rs.getInt("id"), name, price);
      } catch (SQLException | NoConnectionException e) {
         throw new PersistenceException(e.getMessage());
      }
   }
   public Stall getTheObject(){
      return this;
   }
   //80 ===== Editable : Your Operations =============
//90 ===== GENERATED: End of Your Operations ======
}
