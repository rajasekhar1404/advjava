// program to demonstrate JDBC
import java.sql.*;

class JDBCEX1
{
    public static void main(String[] args)
    {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/school";
        String uname = "root";
        String pwd = "Rajasekhar@123";
        
        try{
        // register the drive
        Class.forName(driver);

        //get the connection
        Connection con = DriverManager.getConnection(url, uname, pwd);

        //create the statement
        Statement stmt = con.createStatement();

        //execute the query
        stmt.executeUpdate("Insert into student values(1, 'Rajasekhar')");

        //close the connection
        con.close();
        }

        catch(Exception e)
        {
                System.out.println(e);
        }
    }
}