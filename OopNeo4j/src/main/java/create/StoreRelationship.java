package create;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connect.Connect;

public class StoreRelationship {
	public static void main(String[] args) {
		String cypher="MATCH (a:Person), (b:Person) WHERE a.name = \"Đạt\" AND b.name = \"Cảnh\" \r\n" + 
				"CREATE (a)-[r: TEACH]->(b) \r\n" + 
				"RETURN a,b ";
		Connect conn= new Connect();
		Connection connect= conn.getConnect();
		try {
			PreparedStatement prst= connect.prepareStatement(cypher);
			prst.executeQuery();
			
		} catch (SQLException e) {
			System.out.println("Lỗi statement: "+e.getMessage());
		}
		
	}	
}
