package com.chainsys;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Mvprojectdao {
	 public void insert(Mvproject M1 ) throws ClassNotFoundException, SQLException {
	       String  query="insert into Movie(Movie_name,Movie_id,Movie_type,movie_ratings,price,movie_duration,director,music_director,hero_name) values (?,?,?,?,?,?,?,?,?)";
			Connection con=connectionm.DBConnection();
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1,M1.getMovie_name());
			pstmt.setInt(2,M1.getMovie_id());
			pstmt.setString(3,M1.getMovie_type());
			pstmt.setInt(4,M1.getMovie_ratings() );
			pstmt.setInt(5,M1.getPrice());
			pstmt.setInt(6,M1.getMovie_duration());
			pstmt.setString(7,M1.getDirector());
			pstmt.setString(8,M1.getMusic_director());
			pstmt.setString(9,M1.getHero_name());
			int i = pstmt.executeUpdate();
			
			System.out.println(i+"rows inserted successfully");
			
		}
		
		public void update(Mvproject M1 ) throws SQLException, ClassNotFoundException {
			
			String query="update Movie set Movie_id=? where Movie_type=100";
			Connection con=connectionmv.getDBConnect();
			PreparedStatement pstmt = con.prepareStatement(query);
			
			pstmt.setString(1,);
			
	         int i = pstmt.executeUpdate();
			
			System.out.println(i+"rows inserted successfully");
		}
		
	public void delete(Mvproject M1 ) throws SQLException, ClassNotFoundException {
			
			String query="delete Movie;"
			Connection con=connectionmv.getDBConnect();
			PreparedStatement pstmt = con.prepareStatement(query);
			
			pstmt.setString(1,);
			
	         int i = pstmt.executeUpdate();
			
			System.out.println(i+"rows deleted successfully");
	


			
			
	 }
}


