package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PreparedStatementDemo {
 
/*
-> load the driver class
-> get connection from db
-> create statement
-> Execute Query
*/

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "admin");
            Statement statement = con.createStatement();

        /*
        Prepared Statement
        -> a PS is used to precompiled a sql query and resue it multiple time
         */
            String query = "insert into student (id,stdName,age) values (?,?,?)";

            PreparedStatement preparedStatement = con.prepareStatement(query);

            preparedStatement.setInt(1, 101);
            preparedStatement.setString(2, "Ankit Sharma");
            preparedStatement.setInt(3, 13);

            int updated = preparedStatement.executeUpdate();
            System.out.println("Updated: " + updated);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
