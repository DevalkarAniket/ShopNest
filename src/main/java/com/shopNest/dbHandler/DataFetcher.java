package com.shopNest.dbHandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.shopNest.product.Product;

public class DataFetcher {
	public static String fetchPass(String uName) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pwd = "hr";
		String query = "SELECT PASSWORD FROM SHOPNEST_USERS WHERE UNAME=?";
		String dbPass = "";
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, pwd);
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, uName);
			ResultSet rs = ps.executeQuery();
			rs.next();
			dbPass = rs.getString(1);
		} catch (Exception e) {
			System.out.println("Login issiue");
			e.printStackTrace();
		}
		return dbPass;
	}

	public static List fetchUsersInfo() {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pwd = "hr";
		String query = "SELECT UNAME, EMAIL, GENDER, ADDRESS FROM SHOPNEST_USERS";
		List ulist = new ArrayList();
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, pwd);
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			while (rs.next()) {
				String temp = rs.getString(1) + ":" + rs.getString(2) + ":" + rs.getString(3) + ":" + rs.getString(4);
				ulist.add(temp);
			}
		} catch (Exception e) {
			System.out.println("Problem in login.");
			e.printStackTrace();
		}
		return ulist;
	}

	public static List fetchProdInfo() {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pwd = "hr";
		String query = "SELECT PID, PNAME, PDESC, PPRICE, PIMG FROM SHOPNEST_PRODUCTS";
		List plist = new ArrayList();
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, pwd);
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			while (rs.next()) {
				String temp = rs.getString(1) + ":" + rs.getString(2) + ":" + rs.getString(3) + ":" + rs.getString(4)
						+ ":" + rs.getString(5);
				plist.add(temp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return plist;
	}

	public static Product getProductById(int pid) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pwd = "hr";
		String query = "SELECT PNAME, PPRICE FROM SHOPNEST_PRODUCTS WHERE PID=?";
		Product p = null;
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, pwd);
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, pid);
			ResultSet rs = ps.executeQuery();
			rs.next();
			String pname = rs.getString(1);
			int pprice = rs.getInt(2);
			p = new Product(pid, pname, pprice);
		} catch (Exception e) {
			System.out.println("Problem in fetching products by id");
			e.printStackTrace();
		} finally {
			return p;
		}
	}
}
