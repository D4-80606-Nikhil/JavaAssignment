import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BatchesDao {

	public Connection con;
	public PreparedStatement ADD_BATCH ;
	public PreparedStatement DISPLAY_BATCH;
	
	
	
	
	
   public BatchesDao(){
	   try {
		con = DBUtil.getConnections();
		ADD_BATCH = con.prepareStatement("Insert into batches VALUES(?,?,?)");
		DISPLAY_BATCH = con.prepareStatement("Select * from batches");
	   }
	   catch(Exception ex) {
		   ex.printStackTrace();
	   }
	}
   
   void close() {
	   try {
		
	   if(ADD_BATCH!=null)
		   ADD_BATCH.close();
		   
	   if(con!=null)
		   con.close();
	   }catch(Exception ex) {
		   ex.printStackTrace();
	   }
   }
   
   
   public int addBatch(Batches obj) {
	   int count =0;
	   try {
	   ADD_BATCH.setInt(1, obj.getId());
	   ADD_BATCH.setString(2, obj.getName());
	   ADD_BATCH.setString(3, obj.getCourses());
	   
	   count = ADD_BATCH.executeUpdate();
	   
	   }catch(Exception ex) {
		   ex.printStackTrace();
	   }
	   
	   return count;
   }
   
   
   public List<Batches> displayBatch() {
	   List<Batches> list = new ArrayList<Batches>();
	  try(ResultSet set = DISPLAY_BATCH.executeQuery() ){
	     
		  while(set.next()) {
		  int id = set.getInt("id");
		  String name = set.getString("name");
		  String course = set.getString("course");
		  Batches batch = new Batches(id,name,course);
		  list.add(batch);
		  } 
		  
		  
	  }catch(Exception ex) {
		  ex.printStackTrace();
	  }
	  return list;
   }
   
	
}
