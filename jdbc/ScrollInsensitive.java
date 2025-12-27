package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ScrollInsensitive {
 
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
            Statement statement = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String query = "select * from student";

            ResultSet st = statement.executeQuery(query);

            System.out.println("------- scroll insensistive and read only--------");
            // TYPE_FORWARD_ONLY , CONCURRENT_READ_ONLY -> default

            /*
            CONCURRENT_READ_ONLY -> means when a request is made to db it will fetch that curernt data and keep a cache menaing that if any change occur in daabase we won't be able to see that -> NO LIVE UPDATE

             */

            System.out.println("-----Read data---------");

           /* while(st.next()){
                System.out.println(
                st.getInt("id") + " | " +
                    st.getString("stdName")+ " | " +
                        st.getInt("age")

                );
            }*/
            st.last();

            System.out.println("Last row: " + st.getInt("id"));
            System.out.println("Last row: " + st.getString("stdName"));

            st.first();
            System.out.println("First row: " + st.getInt("id"));
            System.out.println("First row: " + st.getString("stdName"));


            st.absolute(2);
            System.out.println("First row: " + st.getInt("id"));
            System.out.println("First row: " + st.getString("stdName"));


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
