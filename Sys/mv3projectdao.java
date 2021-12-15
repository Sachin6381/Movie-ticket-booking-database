package com.Sys;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.chain.Connectionmv2;
import com.chain.Mv2project;
import com.chainsys.connectionmv;

public class mv3projectdao {
	public void insert(Mv3project M3 ) throws ClassNotFoundException, SQLException {
	       String  query="insert into movie_theatre(movie_id,theatre_id, MT_id,active,movie_timing,Movie_date) values (?,?,?,?,?,?)";
			Connection con=Connectionmv3.DBConnection();
			PreparedStatement Pstmt1 = con.prepareStatement(query);
			Pstmt1.setInt(1, M3.getMovie_id());
			Pstmt1.setInt(2,M3.getTheatre_id());
			Pstmt1.setInt(3,M3.getMT_id());
			Pstmt1.setInt(4,M3.getActive());
			Pstmt1.setString(5,M3.getMovie_timing());
			Pstmt1.setString(6,M3.getMovie_date());
			
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
			


