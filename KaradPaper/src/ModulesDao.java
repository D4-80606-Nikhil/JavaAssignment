import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class ModulesDao {
    public Connection con;
	public PreparedStatement ADD_MODULE;
	public PreparedStatement DeleteModulesByName;
	public PreparedStatement DisplayTotalDaysForGivenID;
	public PreparedStatement editModules;
	public PreparedStatement displayDaysForFaculty;
	public PreparedStatement DisplayModuleOfGivenBatch;
	
	
	public ModulesDao(){
		try {
		con = DBUtil.getConnections();
		ADD_MODULE = con.prepareStatement("Insert into modules VALUES(?,?,?,?,?,?");
		DisplayModuleOfGivenBatch = con.prepareStatement("Select * from modules where batch_id = ?");
		DeleteModulesByName = con.prepareStatement("Delete from modules where name = ? and batch_id = ?");
		DisplayTotalDaysForGivenID = con.prepareStatement("Select batch_id as ID,sum(days) as TotalDays from modules"
				+ " group by batch_id");
		editModules = con.prepareStatement("Update modules set name = ?, start_date = ?, days = ? ,faculty = ?, batch_id = ? where id = ?");
		
		displayDaysForFaculty = con.prepareStatement("select sum(days) as Total ,faculty  from modules,batches where modules.batch_id = batches.id"
				+ " group by modules.faculty , course");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	
	public int addModules(Modules obj) {
		int count = 0;
		try {
		ADD_MODULE.setInt(1, obj.getId());
		ADD_MODULE.setString(2, obj.getName());
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		java.util.Date date = format.parse(obj.getDate());
		Date parsedDate  = new Date(date.getTime());
		
		ADD_MODULE.setDate(3, parsedDate);
		ADD_MODULE.setInt(4, obj.getDays());
		ADD_MODULE.setString(5, obj.getFaculty());
        ADD_MODULE.setInt(6, obj.getBatchid());
        count = ADD_MODULE.executeUpdate();
		
		
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return count;
	}
	
	public List<Modules> DisplayModuleGivenBatch(int id) {
		List<Modules> list = new ArrayList<Modules>();
		try {
			DisplayModuleOfGivenBatch.setInt(1, id);
			ResultSet rs = DisplayModuleOfGivenBatch.executeQuery();
			
			while(rs.next()) {
				String name = rs.getString("name");
				String date = rs.getDate("start_date").toString();
				int days = rs.getInt("days");
				String faculty = rs.getString("faculty");
				int batchid = rs.getInt("batch_id");
				Modules module = new Modules(id,name,date,days,faculty,batchid);
				list.add(module);
				
			}
			
		}catch(Exception ed) {
		  ed.printStackTrace();	
		}
		return list;
	}
	
	public int DeleteModuleByName(String name,int batchid) {
		int count = 0;
		
		try {
			
			DeleteModulesByName.setString(1, name);
			DeleteModulesByName.setInt(2, batchid);
			count = DeleteModulesByName.executeUpdate();
			
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return count;
	}
	
	public List<ResultModules> DisplayTotaldaysgivenId() {
		List<ResultModules> list = new ArrayList<>();
		try {
			ResultSet rs = DisplayTotalDaysForGivenID.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("ID");
				int total = rs.getInt("TotalDays");
				
				ResultModules rm = new ResultModules(id, total);
				list.add(rm);
				
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return list;
	}
	
	public int  editmodule(Modules obj) {
		int count = 0;
		try {
			editModules.setString(1, obj.getName());
			
			SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
			java.util.Date date = format.parse(obj.getDate());
			Date parsedDate  = new Date(date.getTime());
			
			editModules.setDate(2, parsedDate);
			editModules.setInt(3, obj.getDays());
			editModules.setString(4, obj.getFaculty());
			editModules.setInt(5, obj.getBatchid());
			editModules.setInt(6, obj.getId());
			
			count = editModules.executeUpdate();
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return count;
	}
	
	public List<FacultyTotal> displaydatesforFaculty(){
		List<FacultyTotal> list = new ArrayList<>();
		
		try {
			
			ResultSet rs = displayDaysForFaculty.executeQuery();
			while(rs.next()) {
				int total = rs.getInt("Total");
				String faculty = rs.getString("faculty");
				
				FacultyTotal ft = new FacultyTotal(total, faculty);
				list.add(ft);
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return list;
	}
	
	
	
}
