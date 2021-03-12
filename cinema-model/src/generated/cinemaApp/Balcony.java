/**--- Generated at Thu Mar 11 23:51:08 CET 2021 
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
import generated.cinemaApp.proxies.IBalcony;
import exceptions.ConstraintViolation;
//20 ===== Editable : Your Import Section =========

//25 ===== GENERATED:      Header Section =========
public class Balcony extends Category implements java.io.Serializable, IBalcony
{
   //30 ===== GENERATED:      Attribute Section ======
   private static Optional<Balcony> theInstance = Optional.empty();
   //40 ===== Editable : Your Attribute Section ======
   
   //50 ===== GENERATED:      Constructor ============
   private Balcony(Integer id, Optional<String> name, Optional<Integer> price, boolean objectOnly)
   {
      super(id, name, price, objectOnly);
      if(objectOnly) return;
   }
   private static Balcony createAlreadyPersistent(Integer id, Optional<String> name, Optional<Integer> price){
      return new Balcony(id, name, price, true);
   }
   //60 ===== Editable : Your Constructors ===========
   
   //70 ===== GENERATED:      Feature Access =========
   public static Balcony getInstance() throws PersistenceException{
      if(!theInstance.isPresent())theInstance = Optional.of(load());
      return theInstance.get();
   }
   private static Balcony load() throws PersistenceException {
      try{
         Integer typeKey = TypeKeyManager.getTheInstance().getTypeKey("CinemaApp", "Balcony");
         ResultSet rs = DBExecuterFactory.getConfiguredFactory().getDBDMLExecuter().selectEntriesOfTable("Category", typeKey);
         rs.next();
         Optional<String> name = (rs.getObject("name") == null ? Optional.empty() : Optional.of(rs.getString("name")));
         Optional<Integer> price = (rs.getObject("price") == null ? Optional.empty() : Optional.of(rs.getInt("price")));
         return Balcony.createAlreadyPersistent(rs.getInt("id"), name, price);
      } catch (SQLException | NoConnectionException e) {
         throw new PersistenceException(e.getMessage());
      }
   }
   public Balcony getTheObject(){
      return this;
   }
   //80 ===== Editable : Your Operations =============
//90 ===== GENERATED: End of Your Operations ======
}
