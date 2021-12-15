package com.Reg;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Sys.Connectionmv3;
import com.chains.Mv4project;

public class registerdao {
	public void insert(Reg1 M4) throws ClassNotFoundException, SQLException {
	       String  query="insert into register_page(user_name,gender,email_id,mobile_number,password) values (?,?,?,?,?)";
			Connection con=Connectionreg.DBConnection();
			PreparedStatement Pstmt1 = con.prepareStatement(query);
			Pstmt1.setString(1,M4.getUser_name());
			Pstmt1.setString(2,M4.getGender());
			Pstmt1.setString(3,M4.getEmail_id());
			Pstmt1.setInt(4,M4.getMobile_number());
			Pstmt1.setString(5,M4.getPassword());
			
			
			
		int i = Pstmt1.executeUpdate();

		System.out.println(i+ "rows inserted successfully");
	}
			
	    public  boolean validateuser(String useremail,String userpassword  ) throws ClassNotFoundException, SQLException {
			String  validate="select * from register_page where email_id = ? and password = ?";
			Connection con=Connectionreg.DBConnection();
		    PreparedStatement Pstmt1 = con.prepareStatement(validate);
		    Pstmt1.setString(1, useremail);
		    Pstmt1.setString(2, userpassword);
			ResultSet rs = Pstmt1.executeQuery();
			if(rs.next()) {
				return true;
			}
			return false;
	}
	    
}
