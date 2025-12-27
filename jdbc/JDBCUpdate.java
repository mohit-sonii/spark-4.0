package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCUpdate {
 
/*
-> load the driver class
-> get connection from db
-> create statement
-> Execute Query
*/

    public static void main(String[] args)  {
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","admin");
        Statement statement = con.createStatement();
        String query = "insert into student (id,stdName,age) values (2,'Ankit',21)";
       
       int insertedRows = statement.executeUpdate(query);

            System.out.println("Inserted : "+ insertedRows);


        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
