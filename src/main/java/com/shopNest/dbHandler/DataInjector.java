package com.shopNest.dbHandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DataInjector {
	public static String addCustomer(String uName, String mail, String password, String gender, String address) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pwd = "hr";
		String query = "INSERT INTO SHOPNEST_USERS (UNAME,EMAIL,PASSWORD,GENDER,ADDRESS) VALUES(?,?,?,?,?)";
		String regStatus = "";
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, pwd);
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, uName);
			ps.setString(2, mail);
			ps.setString(3, password);
			ps.setString(4, gender);
			ps.setString(5, address);
			ps.executeUpdate();
			regStatus = "sucess";
		} catch (Exception e) {
			System.out.println("problem in adding user");
			e.printStackTrace();
			regStatus = "fail";
		} finally {
			return regStatus;
		}
	}

	public static boolean addProduct(int pid, String pname, String pdesc, int pprice, String pimg) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pwd = "hr";
		String query = "INSERT INTO SHOPNEST_PRODUCTS VALUES(?,?,?,?,?)";
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, pwd);
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, pid);
			ps.setString(2, pname);
			ps.setString(3, pdesc);
			ps.setInt(4, pprice);
			ps.setString(5, pimg);
			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println("problem in adding products");
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
