/**
 * 
 */
package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author BEN LAHMAR
 *
 */
public class Test {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//setp 1: chargement du pilot
		Class.forName("com.mysql.jdbc.Driver");
		//setp2 : url
		String url = "jdbc:mysql://localhost/4isi";
		//setp3
		Connection con = DriverManager.getConnection(url, "root", "");
		//setp 4
		Statement st = con.createStatement();
		//step 5
		
		ResultSet rs = st.executeQuery("select * from etudiant ");
		while(rs.next())
		{
			System.out.println("id: "+ rs.getInt("id")+" Nom:  "+   rs.getString(2));
		}
		
		//int nb = st.executeUpdate("insert into etudiant(nom,prenom,log,pass) values ('4isi','4isi','4isi','4isi')");
		//setp 6 traitement
		//System.out.println("il y "+nb +" ligne inserés");
		
		//setp 7 deconnection
		con.close();
		
		
		
		

	}

}
