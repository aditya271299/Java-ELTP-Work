package jdbc;
import java.sql.*;
public class Que6 {
        public static void main(String[] args) {
            Connection con;
            Statement st;
            try{
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/que6","root","aditya");
                st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
                ResultSet rs = st.executeQuery("select * from que6");
                rs.absolute(1);
                String s = rs.getString(2);
                rs.updateString(3,"prof");
                rs.updateRow();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

