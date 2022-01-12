import java.sql.*;
import java.util.*;

class SQLinjectoinEx {
        public static void main(String[] args)
        {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/school";
            String uname = "root";
            String pwd = "Rajasekhar@123";
    
            try{
                System.out.println("Please enter your roll number");
                Scanner roll = new Scanner(System.in);
                String n = roll.nextLine();
                System.out.println("Please enter your Name");
                Scanner name = new Scanner(System.in);
                String nm = name.nextLine();
                String qry = "insert into student(roll, Name) value("+n+","+"'"+nm+"'"+")";

                Class.forName(driver);
                Connection con = DriverManager.getConnection(url, uname, pwd);
                Statement stmt = con.createStatement();
                stmt.executeUpdate(qry);
                con.close();
                }
        
                catch(Exception e)
                {
                        System.out.println(e);
                }
    
        }
}
