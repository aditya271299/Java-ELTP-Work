package feb24;
import java.sql.*;
import java.util.Formatter;
public class Que3 {
    Connection c;
    Statement st;
    ResultSet rs;
    public void setConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/stud", "root", "aditya");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void alterGender() {
        try {
            st = c.createStatement();
            String o1 = "alter table student add column gender varchar(1)";
            st.executeUpdate(o1);
            System.out.println("Gender Column added successfully");
            System.out.println("===========================================================================");
            displayFullTable();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void displayFullTable() {
        try {
            st = c.createStatement();
            String o2 = "select * from student";
            rs = st.executeQuery(o2);
            System.out.println("=======================================================================");
            Formatter fmt = new Formatter();
            fmt.format("%15s %15s %15s %15s %17s\n", "id","name","year","percentage","city");
            while (rs.next()) {
                fmt.format("%14s %14s %17s %14s %14s\n", rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
            }
            System.out.println(fmt);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void greater70() {
        try {
            st = c.createStatement();
            String o3 = "select * from student where percentage>70 and year='TY'";
            rs = st.executeQuery(o3);
            System.out.println("============================================================================================");
            Formatter fmt = new Formatter();
            fmt.format("%15s %15s %15s %15s %17s\n", "id","name","year","percentage","city");
            while (rs.next()) {
                fmt.format("%14s %14s %17s %14s %14s\n", rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
            }
            System.out.println(fmt);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void onetoten() {
        try {
            st = c.createStatement();
            String o4 = "select * from student where id between 1 and 10;";
            rs = st.executeQuery(o4);
            System.out.println("==================================================================================");
            Formatter fmt = new Formatter();
            fmt.format("%15s %15s %15s %15s %17s\n", "id","name","year","percentage","city");
            while (rs.next()) {
                fmt.format("%14s %14s %17s %14s %14s\n", rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
            }
            System.out.println(fmt);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertRecord() {
        try {
            st = c.createStatement();
            System.out.println("========================================================");
            String o5 = "insert into student values (11,'sham','TY',99,'DELHI','M')";
            String o6 = "insert into student values (12,'ram','FY',98,'Mumbai','M')";
            String o7 = "insert into student values (13,'luv','SY',97,'Pune','M')";
            st.executeUpdate(o5);
            st.executeUpdate(o6);
            st.executeUpdate(o7);
            displayFullTable();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void updatemrmrs() {
        try {
            st = c.createStatement();
            System.out.println("===============================================================================");
            String o8 = "update student set name=concat('Mr.',name)where gender='M'";
            String o9 = "update student set name=concat('Ms.',name)where gender='F'";
            st.executeUpdate(o8);
            st.executeUpdate(o9);
            displayFullTable();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void removeStudentLy() {
        try {
            st = c.createStatement();
            System.out.println("=============================================================================");
            String o10 = "delete from student where year = 'LY'";
            st.executeUpdate(o10);
            displayFullTable();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Que3 one= new Que3();
        one.setConnection();
        one.displayFullTable();
        one.alterGender();
        one.greater70();
        one.onetoten();
        one.insertRecord();
        one.updatemrmrs();
        one.removeStudentLy();
    }
}
/*
============================================================================================
             id            name            year      percentage              city
             3          arjun                TY             90         Mumbai
             4          aarav                TY             89          Dhule
            10         akshay                TY             92      Hyderabad

==================================================================================
             id            name            year      percentage              city
             1            adi                FY             89           Pune
             2          arnav                LY             78           Pune
             3          arjun                TY             90         Mumbai
             4          aarav                TY             89          Dhule
             5            raj                LY             98       Banglore
             6          parth                SY             87        Kolkata
             7          karan                SY             67        Chennai
             8          sahil                FY             77         Mumbai
             9         hritik                LY             96          Delhi
            10         akshay                TY             92      Hyderabad

========================================================
=======================================================================
             id            name            year      percentage              city
             1            adi                FY             89           Pune
             2          arnav                LY             78           Pune
             3          arjun                TY             90         Mumbai
             4          aarav                TY             89          Dhule
             5            raj                LY             98       Banglore
             6          parth                SY             87        Kolkata
             7          karan                SY             67        Chennai
             8          sahil                FY             77         Mumbai
             9         hritik                LY             96          Delhi
            10         akshay                TY             92      Hyderabad
            11           sham                TY             99          DELHI
            12            ram                FY             98         Mumbai
            13            luv                SY             97           Pune

===============================================================================
=======================================================================
             id            name            year      percentage              city
             1            adi                FY             89           Pune
             2          arnav                LY             78           Pune
             3          arjun                TY             90         Mumbai
             4          aarav                TY             89          Dhule
             5            raj                LY             98       Banglore
             6          parth                SY             87        Kolkata
             7          karan                SY             67        Chennai
             8          sahil                FY             77         Mumbai
             9         hritik                LY             96          Delhi
            10         akshay                TY             92      Hyderabad
            11        Mr.sham                TY             99          DELHI
            12         Mr.ram                FY             98         Mumbai
            13         Mr.luv                SY             97           Pune

=============================================================================
=======================================================================
             id            name            year      percentage              city
             1            adi                FY             89           Pune
             3          arjun                TY             90         Mumbai
             4          aarav                TY             89          Dhule
             6          parth                SY             87        Kolkata
             7          karan                SY             67        Chennai
             8          sahil                FY             77         Mumbai
            10         akshay                TY             92      Hyderabad
            11        Mr.sham                TY             99          DELHI
            12         Mr.ram                FY             98         Mumbai
            13         Mr.luv                SY             97           Pune



 */
