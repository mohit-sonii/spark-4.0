package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC {
 
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
        String query = "select * from student";
       
        ResultSet st = statement.executeQuery(query);

            System.out.println("-----Read data---------");

            while(st.next()){
                System.out.println(
                st.getInt("id") + " | " +
                    st.getString("stdName")+ " | " +
                        st.getInt("age")

                );
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
