package create;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connect.Connect;

public class CreateNode {
	public static void main(String[] args) {
		String cypher="CREATE (le:Person {name:\"Canh\"}),\r\n" + 
				"  (db:Person {name:\"Phuc\"}),\r\n" + 
				"  (le)-[:KNOWS {since:1768}]->(db)\r\n" + 
				"RETURN le, db";
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
