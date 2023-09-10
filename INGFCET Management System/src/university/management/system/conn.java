package university.management.system;

import java.sql.*;  

public class conn{
    Connection c;
    Statement s;
    public conn(){  
        try{  
            
            Class.forName("com.mysql.jdbc.Driver");  
            System.out.println("testing1");
            
            c =DriverManager.getConnection("jdbc:mysql://localhost:3306/ums","root",""); 
            System.out.println("testing1");
            System.out.println(c);
            s =c.createStatement();  
            
           
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  