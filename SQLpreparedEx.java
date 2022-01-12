import java.sql.*;
import java.util.*;

class SQLpreparedEx {
    public static void main(String[] args)
    {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/school";
        String uname = "root";
        String pwd = "Rajasekhar@123";

        try{
            System.out.print("Please enter your rollnumber: ");
            Scanner nm = new Scanner(System.in);
            String roll = nm.nextLine();

            System.out.print("Please enter your Name: ");
            Scanner pass = new Scanner(System.in);
            String name = pass.nextLine();

            // register the drive
            Class.forName(driver);
    
            //get the connection
            Connection con = DriverManager.getConnection(url, uname, pwd);
    
            //create the statement
            String qry = "insert into student values(?,?)";
            PreparedStatement stmt = con.prepareStatement(qry);
            stmt.setInt(1, Integer.parseInt(roll));
            stmt.setString(2, name);

            stmt.executeUpdate();
          
            con.close();
            }
    
            catch(Exception e)
            {
                    System.out.println(e);
            }
    }
}
