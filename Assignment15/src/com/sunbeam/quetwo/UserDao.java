package com.sunbeam.quetwo;

import java.io.Closeable;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


public class UserDao implements AutoCloseable{
     private Connection con;
     
     
     public UserDao() throws Exception{
    	 con = DBUtil.getConnections();
     }
     
     public void close(){
    	 try {
    	 if(con != null) {
    		 con.close();
    	 }
    	 }catch(Exception ex) {
    		 ex.printStackTrace();
             System.exit(0);
    	 }
     }
     
     public int save(Users u) {
    	 int count=0;
    	 String query = "Insert into users Values(default,?,?,?,?,?,0,'voter')";
    	 SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
    	 java.util.Date date=null;
    	 
    	 try {
    		 date = format.parse(u.getDob());
    	 }catch(Exception ex) {
    		 ex.printStackTrace();
    		 System.exit(0);
    	 }
    	 
    	 try(PreparedStatement stmt = con.prepareStatement(query)){
    		 stmt.setString(1, u.getFirstname());
    		 stmt.setString(2, u.getLastname());
    		 stmt.setString(3, u.getEmail());
    		 stmt.setString(4, u.getPassword());
    		 Date d = new Date(date.getTime());
    		 stmt.setDate(5, d);
    		 
    		 count = stmt.executeUpdate();
    		 
    		 
    	 }catch(Exception ex) {
    		 ex.printStackTrace();
    	 }
    	 
    	 return count;
     }
     
     public int updateUser(Users u) {
    	 int count =0;
    	 String query = "Update users set first_name = ? , last_name = ? , email = ? , password = ? , dob = ? where id = ?";
    	 SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
    	 java.util.Date date=null;
    	 
    	 try {
    		 date = format.parse(u.getDob());
    	 }catch(Exception ex) {
    		 ex.printStackTrace();
    		 System.exit(0);
    	 } 
    	 
    	 
    	 try(PreparedStatement stmt = con.prepareStatement(query)){
    		 
    		 stmt.setString(1, u.getFirstname());
    		 stmt.setString(2, u.getLastname());
    		 stmt.setString(3, u.getEmail());
    		 stmt.setString(4, u.getPassword());
    		 Date d = new Date(date.getTime());
    		 stmt.setDate(5, d);
    		 stmt.setInt(6,u.getId());
    		 
    		 count = stmt.executeUpdate();
    		 if(count != 0) {
    			 System.out.println("No. of Rows Affected : "+count);
    		 }else {
    			System.out.println("No rows Affected "); 
    		 }
    		 
    		 
    	 }catch(Exception e) {
    		 e.printStackTrace();
    	 }
    	 
    	 return count;
     }
     
     public int delete(int id) {
    	 int count = 0;
    	 String query = "Delete from users where id = ?";
    	 
    	 try(PreparedStatement stmt = con.prepareStatement(query)){
    		 stmt.setInt(1, id);
    		 count = stmt.executeUpdate();
    		 
    		 if(count != 0) {
    			 System.out.println("No. of Rows Affected : "+count);
    		 }else {
    			System.out.println("No rows Affected "); 
    		 }
    		 
    	 }catch(Exception ed){
    		ed.printStackTrace(); 
    	 }
    	 
    	 return count;
     }
     
     public List<Users> display(){
    	 
    	 List<Users> list = new ArrayList<Users>();
    	 String query = "Select * from users";
    	 
    	 try(PreparedStatement stmt = con.prepareStatement(query)){
    		 try(ResultSet rs = stmt.executeQuery()){
    			 
    			 while(rs.next()) {
    				int id =  rs.getInt("id");
    				String firstname = rs.getString("first_name");
    				String lastname = rs.getString("last_name");
    				String email = rs.getString("email");
    				String password = rs.getString("password");
    				java.util.Date date = rs.getDate("dob");
    				
    				Users user = new Users(id,firstname,lastname,email,password,date.toString());
    				list.add(user);    			 }
    		 }
    		 
    	 }catch(Exception e) {
    		 e.printStackTrace();
    	 }
    	 
    	 return list;
     }
     
     
     
} 
