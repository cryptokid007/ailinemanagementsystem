package javaair;

import java.sql.*; 
import java.sql.Connection;
import java.sql.DriverManager;


public class conn{
    Connection c;
    Statement s;
    public conn(){  
        try{  
            Class.forName("org.postgresql.Driver");  
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ni","postgres", "postgres");    
            s =c.createStatement(); 
           
          
            
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  