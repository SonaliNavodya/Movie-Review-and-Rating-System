package movie.review.system;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    
    Conn(){
        try{
            //creating mysql connection
            c = DriverManager.getConnection("jdbc:mysql:///mrs", "root", "Hewage#9949");
            s = c.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
