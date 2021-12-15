package com.chains;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.Chainsy.Mv5project;
import com.Sys.Connectionmv3;
import com.Sys.Mv3project;
import com.chainsys.connectionmv;

public class Mv5projectdao {
	public void insert(Mv5project M5) throws ClassNotFoundException, SQLException {
	       String  query="insert into booking_detail(booking_id,user_id,booked_seats,amount,booking_status,seat_type, payment_status) values (?,?,?,?,?,?,?)";
			Connection con=Connectionmv3.DBConnection();
			PreparedStatement Pstmt1 = con.prepareStatement(query);
			Pstmt1.setInt(1,M5.getBooking_id());
			Pstmt1.setInt(2,M5.getUser_id());
			Pstmt1.setInt(3,M5.getBooked_seats());
			Pstmt1.setInt(4,M5.getAmount());
			Pstmt1.setString(5,M5.getSeat_type());
			Pstmt1.setString(6,M5.getPayment_status());
			
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
			
			
              
