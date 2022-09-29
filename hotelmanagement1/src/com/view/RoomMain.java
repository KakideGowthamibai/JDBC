package com.view;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RoomMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		//create the connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/htc","root","Root");
		//create the statement

		{
			PreparedStatement ps1=con.prepareStatement("insert into Room values(?,?,?,?,?,?,?,?)");
		    ps1.setString(1, "101");
			ps1.setString(2, "5000");
		    ps1.setString(3, "non/ac");
			
			java.sql.Date sqlDate = new java.sql.Date(new java.util.Date().getTime());
			ps1.setDate(5, sqlDate);
			ps1.setString( 1,"105");
			ps1.setString(7, "Anjali");
			ps1.setString(8, "Room-4");
			ps1.executeUpdate();
			System.out.println("inserted succesfully");
		}
		
		{
			PreparedStatement ps1=con.prepareStatement("delete from rooms where userid=?");
			ps1.setInt(1, 12);
			ps1.executeUpdate();
			System.out.println("deleted succesfully");
		}
		{
	        PreparedStatement ps1=con.prepareStatement("update rooms with acrooms r=? where reservationid=?");
			ps1.setString(1, "acroom");
			ps1.setInt(2, 12);
			ps1.executeUpdate();
			System.out.println("Updated succesfully");

		}
		{
			
			PreparedStatement ps1=con.prepareStatement("select * from Rooms");
			ResultSet rs=ps1.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
				System.out.println(rs.getDate(5));
				System.out.println(rs.getString(6));
				System.out.println(rs.getString(7));
				System.out.println(rs.getDate(8));
			}
			con.close();
			System.out.println("view succesfully");
			
		}
		con.close();
	}
}

