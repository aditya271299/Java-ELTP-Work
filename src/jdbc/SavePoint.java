package jdbc;
import java.sql.*;
public class SavePoint {
        public static void main(String[] args) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/savepoint","root","aditya");
                Statement statement  = con.createStatement();
                String q = "delete from savepoint where id =1";
                con.setAutoCommit(false);
                Savepoint sp = con.setSavepoint();
                statement.executeUpdate(q);

                con.rollback(sp);
                con.commit();


            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }


        }
}

