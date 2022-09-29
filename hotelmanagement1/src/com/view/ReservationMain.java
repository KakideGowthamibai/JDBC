package com.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import com.entity.Room;

public class ReservationMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		//create the connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/htc","root","Root");
		//create the statement
		{
	    PreparedStatement ps=con.prepareStatement("insert the person details(?,?,?,?)");
	    ps.setInt( 1,105);
		ps.setString(2, "k.Anjali");
		ps.setString(3, "ROOM-3");
		ps.setString(4, "startDate-6/10/22");
		ps.setString(5, "endDate-10/10/22");
		
		ps.executeUpdate();
		System.out.println("inserted succesfully");

	    }

			
			{
				
		PreparedStatement ps1=con.prepareStatement("delete th rooms who are cancelled=?");
		ps1.setInt(11060, 0);
		ps1.executeUpdate();
		System.out.println("deleted succesfully");
	        }
			{
		        PreparedStatement ps2=con.prepareStatement("update acroom=?non/acroom?");
				ps2.setString(1, "General");
				ps2.setInt(2, 103);
				ps2.executeUpdate();
				System.out.println("Updated succesfully");

			}
			{
				PreparedStatement ps3=con.prepareStatement("select * from Reservation");
				ResultSet rs=ps3.executeQuery();
				while(rs.next())
				{
					System.out.println(rs.getInt(1));
					System.out.println(rs.getString(2));
					System.out.println(rs.getString(3));
					System.out.println(rs.getString(4));
				}
				con.close();
				System.out.println("view succesfully");
				
			}
			con.close();
	}
	
		
		
	}
