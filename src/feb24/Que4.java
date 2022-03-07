package feb24;
import java.io.*;
import java.sql.*;

public class Que4 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/image", "root", "aditya");
        PreparedStatement pst = con.prepareStatement("insert into image(image) values(?)");
        FileInputStream f = new FileInputStream("src/feb24/golden.png");
        pst.setBinaryStream(1, f, f.available());
        pst.executeUpdate();
        System.out.println("image added");

    }
}
