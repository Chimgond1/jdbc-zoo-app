package com.ty.zoo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;
import static com.ty.zoo.util.AppConstant.*;

public class ConnectionObject {
	
	static {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

	}

	public static Connection  getConnection() {
		try {
			return DriverManager.getConnection(URL, USER, PASSWORD);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
