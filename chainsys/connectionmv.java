package com.chainsys;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionmv {
public static Connection DBConnection() throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.OracleDriver");
		
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system","oracle");
		
		
		return con;
}

}
