import java.sql.*;

class RetriveEx {
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
            stmt.executeUpdate("insert into student(roll, Name) value(12, 'Kranthi')");
            stmt.executeUpdate("insert into student(roll, Name) value(13, 'Lenovo')");
            stmt.executeUpdate("insert into student(roll, Name) value(14, 'Dell')");
            stmt.executeUpdate("insert into student(roll, Name) value(15, 'HP')");
            stmt.executeUpdate("insert into student(roll, Name) value(16, 'Apple')");
            ResultSet a = stmt.executeQuery("select * from student;");

            // a.next();

            // System.out.println(a.getString(2));
            // a.next();
            // System.out.println(a.getInt("roll"));

            while(a.next())
            {
                System.out.println(a.getInt(1)+"\t"+a.getString(2));
            }
    
            //close the connection
            con.close();
            }
    
            catch(Exception e)
            {
                    System.out.println(e);
            }
    }
}
