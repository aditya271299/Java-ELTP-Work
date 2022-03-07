package feb24;

import java.sql.*;

public class Que1 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","aditya");
            Statement st=con.createStatement();
            PreparedStatement pst=con.prepareStatement("insert into student values(?,?)");
            st.execute("insert into student values(1,'adi')");
            pst.setInt(1,2);
            pst.setString(2,"arjun");
            pst.execute();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
