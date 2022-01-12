import java.sql.*;
import java.util.*;

class CallabeEx
{

public static void main(String[] args)
{
    String driver = "com.mysql.jdbc.Driver";
    String url= "jdbc:mysql://localhost:3306/school";
    String username = "root";
    String password = "Rajasekhar@123";

    System.out.println("Pleae enter your roll number: ");
    Scanner rn = new Scanner(System.in);
    int roll = Integer.parseInt(rn.nextLine());

    try{
    Class.forName(driver);
    Connection con = DriverManager.getConnection(url, username, password);
    CallableStatement stmt = con.prepareCall("{call getname(?)}");
    stmt.setInt(1, roll);

    ResultSet rs = stmt.executeQuery();
    CallableStatement stmt2 = con.prepareCall("{call inserdata()}");
    stmt2.executeUpdate();

    if(rs.next())
    {
        System.out.println(rs.getString(1));
    }
    else
    {
        System.out.println("no data found");
    }
    con.close();
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
}
}