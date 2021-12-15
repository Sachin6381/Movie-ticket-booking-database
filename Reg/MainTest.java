package com.Reg;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class MainTest {
	
	
public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner sc = new Scanner(System.in);
		Connection con=Connectionreg.DBConnection();
		//System.out.println("Connection established");
		registerdao uDao = new registerdao();
		System.out.println("welcome Like myshow");
		System.out.println("\n1.Register \n2.Login \n3.Admin login");
		int choice=Integer.parseInt(sc.nextLine());
//		
		
		switch(choice) {
	    case 1:
	    	System.out.println("Enter User Details");
	    	String pDetail=sc.nextLine();
		Reg1 p1=new Reg1(pDetail.split(",")[0],pDetail.split(",")[1],
		pDetail.split(",")[2],Integer.parseInt(pDetail.split(",")[3]),pDetail.split(",")[4]);
		uDao.insert(p1);
     	break;
		
		
		case 2:
	     registerdao regdao=new  registerdao();
		System.out.println("Enter your register email_id");
		String useremail=sc.nextLine();
		System.out.println("Enter your password");
		String userpassword=sc.nextLine();
		boolean flag=regdao.validateuser(useremail, userpassword);
				if(flag) {
					System.out.println("Valid");
				}else {
					System.out.println("invalid");
				}
		
		break;
		
			
		}			
}
}
