package feb24;

import java.sql.*;

public class Que2 {
    public static void main(String[] args) {
        ResultSet rs;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","aditya");
            Statement st=con.createStatement();
            st.executeUpdate("insert into employee values(1, 'adi', '27dec', 2,60000,'working')");
            st.executeUpdate("insert into employee values(2, 'arnav', '17jan', 1,70000,'working')");
            st.executeUpdate("insert into employee values(3, 'arjun', '24feb', 0,15000,'working')");
            st.executeUpdate("insert into employee values(4, 'mansi', '8mar', 3,25000,'working')");
            st.executeUpdate("insert into employee values(5, 'karan', '2mar', 6,30000,'left')");
            st.executeUpdate("insert into employee values(6, 'sahil', '15mar', 4,35000,'working')");
            st.executeUpdate("insert into employee values(7, 'hritik', '14aug',3,80000,'working')");
            st.executeUpdate("insert into employee values(8, 'akshay', '20feb',5,90000,'working')");
            st.executeUpdate("insert into employee values(9, 'anoop', '6mar', 2,18000,'working')");
            st.executeUpdate("insert into employee values(10,'rahul','4feb',5,99000,'left')");
            rs=st.executeQuery("select * from employee");
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "
                        +rs.getInt(4)+" "+rs.getInt(5)+" "+rs.getString(6));
            }
            st.execute("alter table employee add city varchar(20)");
            st.executeUpdate(" update employee set city = 'mumbai' where id = 1");
            st.executeUpdate(" update employee set city = 'pune' where id = 2");
            st.executeUpdate(" update employee set city = 'delhi' where id = 3");
            st.executeUpdate(" update employee set city = 'pune' where id = 4");
            st.executeUpdate(" update employee set city = 'hyd' where id = 5");
            st.executeUpdate(" update employee set city = 'mumbai' where id = 6");
            st.executeUpdate(" update employee set city = 'noida' where id = 7");
            st.executeUpdate(" update employee set city = 'banglore' where id = 8");
            st.executeUpdate(" update employee set city = 'pune' where id = 9");
            st.executeUpdate(" update employee set city = 'pune' where id = 10");
            rs=st.executeQuery("select * from employee where city= 'pune' and sal>20000");
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "
                        +rs.getInt(4)+" "+rs.getInt(5)+" "+rs.getString(6));
            }
            st.executeUpdate (" update employee set sal = sal+1000  where exp = 3");
            st.execute("delete from employee where status ='left'");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
         catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
/*
         |    1 | adi    | 27dec |    2 | 60000 | working | mumbai   |
         |    2 | arnav  | 17jan |    1 | 70000 | working | pune     |
         |    3 | arjun  | 24feb |    0 | 15000 | working | delhi    |
         |    4 | mansi  | 8mar  |    3 | 26000 | working | pune     |
         |    6 | sahil  | 15mar |    4 | 35000 | working | mumbai   |
         |    7 | hritik | 14aug |    3 | 81000 | working | noida    |
         |    8 | akshay | 20feb |    5 | 90000 | working | banglore |
         |    9 | anoop  | 6mar  |    2 | 18000 | working | pune     |
         +------+--------+-------+------+-------+---------+----------+
         */
