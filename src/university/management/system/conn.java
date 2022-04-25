package university.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class conn{
    Connection c;
    Statement s;
    public conn(){  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");
            c =DriverManager.getConnection("jdbc:mysql://localhost:3307/ums","root","");
            s =c.createStatement();
            System.out.println("connection created");
            
           
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  
