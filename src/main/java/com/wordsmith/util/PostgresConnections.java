package com.wordsmith.util;

import java.net.URI;
import java.net.URISyntaxException;

public class PostgresConnections {
public static void main(String[] args) throws URISyntaxException {
	System.out.println("TH:::: pA"+System.getenv("DATABASE_URL"));
	URI dbUri = new URI(System.getenv("DATABASE_URL")); 
	
	System.out.println(dbUri);
	 System.out.println(dbUri.getHost());
	 System.out.println(dbUri.getPath());
	 
	       String username = dbUri.getUserInfo().split(":")[0]; 
	        String password = dbUri.getUserInfo().split(":")[1]; 
	        String dbUrl = "jdbc:postgresql://" + dbUri.getHost() + dbUri.getPath(); 
	
	 
	       /*BasicDataSource basicDataSource = new BasicDataSource(); 
	        basicDataSource.setUrl(dbUrl); 
	        basicDataSource.setUsername(username); 
	        basicDataSource.setPassword(password); */
	
	 
       // return basicDataSource; 

}
}
