package com.registrationservlet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class TestConnection {
	public static Connection createConnection() throws FileNotFoundException, IOException {
		Connection connection = null;
//		Properties properties = new Properties();
//		properties.load(new FileInputStream("D:\\Adv Java\\JDBC\\Adv JavaProjectFirstApplication\\build\\classes\\com\\registrationservleconnection-info.properties"));
		try {
//			Class.forName(properties.getProperty("drivers"));
//			connection = DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("username"),properties.getProperty("password"));
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","satish","welcome");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return connection;

	}
}
