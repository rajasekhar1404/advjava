import java.sql.*;
import java.util.*;

class SQLinjectionExample {
    public static void main(String[] args)
    {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/sqlinjection";
        String uname = "root";
        String pwd = "Rajasekhar@123";

        try{
            System.out.print("Please enter your username: ");
            Scanner user = new Scanner(System.in);
            String username = user.nextLine();
            System.out.print("Please enter your password: ");
            Scanner pwd1 = new Scanner(System.in);
            String password = pwd1.nextLine();   
            String qry = "select balance from bankbalance where name='"+username+"' and "+"password='"+password+"'";



            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, uname, pwd);
            Statement stmt = con.createStatement();


            ResultSet rs = stmt.executeQuery(qry);

            if(rs.next())
            {
                System.out.println("Balance is: "+rs.getInt(1));
            }
            else
            {
                System.out.println("Invalid credentilas");
            }

            con.close();
        }

        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
