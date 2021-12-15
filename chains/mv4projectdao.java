package com.chains;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.Sys.Connectionmv3;
import com.Sys.Mv3project;
import com.chainsys.connectionmv;

public class mv4projectdao {
	public void insert(Mv4project M4) throws ClassNotFoundException, SQLException {
	       String  query="insert into user_details(user_name,user_id,email_id,mobile_num,gender) values (?,?,?,?,?)";
			Connection con=Connectionmv3.DBConnection();
			PreparedStatement Pstmt1 = con.prepareStatement(query);
			Pstmt1.setString(1,M4.getUser_name());
			Pstmt1.setInt(2,M4.getUser_id());
			Pstmt1.setString(3,M4.getEmail_id());
			Pstmt1.setInt(4,M4.getMobile_num());
			Pstmt1.setString(5,M4.getGender());
			
			
			
			int i = Pstmt1.executeUpdate();

			System.out.println(i+"rows inserted successfully");
			
	}
	
	public void update(Mv3project M ) throws SQLException, ClassNotFoundException {
		
		String query="update theatre set  where";
		Connection con=connectionmv.getDBConnect();
		PreparedStatement pstmt = con.prepareStatement(query);
		
		pstmt.setString(1,);
		
         int i = pstmt.executeUpdate();
		
		System.out.println(i+"rows inserted successfully");
	}
	
public void delete(Mv3project M3 ) throws SQLException, ClassNotFoundException {
		
		String query="delete Movie;"
		Connection con=connectionmv.getDBConnect();
		PreparedStatement pstmt = con.prepareStatement(query);
		
		pstmt.setString(1,);
		
         int i = pstmt.executeUpdate();
		
		System.out.println(i+"rows deleted successfully");



		    
		    
}
}
			
			
			


