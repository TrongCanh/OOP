package create;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connect.Connect;
import entity.Entity;

public class StoreEntity {
	
	public void createEntity(Entity entity) {

		String cypher="CREATE (n:Person { name: '"+entity.getName()+
				"', description: '"+entity.getDescription()+"', id:'"+entity.getId()
				+"', link:'"+entity.getLink()+"', dat:'"+entity.getDat()+"' })";
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
