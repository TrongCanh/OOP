package test;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import connect.Connect;
import create.StoreEntity;
import cypher.MatchNode;
import entity.Entity;
import entity.Person;

public class Test {

	public static void main(String[] args) {
		
//		Entity person = new Person("person1","Cảnh" ,"là Sinh viên", "hust/Dat", "3 năm ");
//		storeEntity create= new storeEntity();
//		create.createEntity(person);

//		String cypher="MATCH (n:Person) RETURN n.description, n.name";
//		Connect conn= new Connect();
//		Connection connect= conn.getConnect();
//		try {
//			PreparedStatement prst= connect.prepareStatement(cypher);
//			ResultSet rs= prst.executeQuery();
//			while(rs.next()) {
//				System.out.println(rs.getString("n.name")+": "+rs.getString("n.description"));
//			}
//		} catch (SQLException e) {
//			System.out.println("Lỗi statement: "+e.getMessage());
//		}
		MatchNode match= new MatchNode();
		List<Person> Persons= match.cypherPerson();
		int i=1;
		for (Person person : Persons) {
		
		System.out.println("i, "+person.getName()+" "+person.getId());
		i++;
	}
		
	}

}
