package com.view;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Join {

	public static void main(String[] args) {
		{
			System.out.println("NaturalJoin");
			    try
			    {
			    	Class.forName("com.mysql.jdbc.Driver");
					//create the connection
					  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/htc","root","root");
					  
					
						 Statement st = con.createStatement();
						 
						 String query="select reservationid,username,room,startdate,enddate.Did=Room.Did";
						 		ResultSet res = st.executeQuery(query);
						 
						 System.out.println("Did\tDname\troom\tStartdate\tenddate\troomid\tcostpernight\troomtype");
						 
						 
						 st.close();
						 
						 }
			  
					 catch(Exception e)
					 {
						 System.out.println(e.getMessage());
						 e.printStackTrace();
					 }
			    
			    }
	}

}
