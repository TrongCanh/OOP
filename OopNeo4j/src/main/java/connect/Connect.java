package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
	String boltUrl="jdbc:neo4j:bolt://localhost:11001";
	String user="neo4j";
	String password="123456";
	public Connection getConnect(){
		Connection connect=null;
		try {
			connect=DriverManager.getConnection(boltUrl, user, password);
		} catch (SQLException e) {
			System.out.println("Lỗi không kết nối được: "+e.getMessage());
		}
		return connect;
	}
	public void closeConnect(Connection connect) {
		try {
			connect.close();
		} catch (SQLException e) {
			System.out.println("Lỗi closeConnect"+e.getMessage());
		}
	}
}
