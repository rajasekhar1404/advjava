import javax.servlet.http.*;
import java.sql.*;
import java.io.*;

public class Registration extends HttpServlet
{
    public void service(HttpServletRequest request, HttpServletResponse response)
    {

        response.setContentType("text/html");


        try{

            String Nm = request.getParameter("Name");
            String Em = request.getParameter("Email");
            String Pwd = request.getParameter("Password");
            String Add = request.getParameter("Address");
    
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/mystore";
            String uname = "root";
            String pwd = "Rajasekhar@123";

            PrintWriter out = response.getWriter();
            Class.forName(driver);

            Connection con = DriverManager.getConnection(url, uname, pwd);
    
            //create the statement
            String qry = "insert into login(Name, Email, Password, Address) values(?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(qry);
            stmt.setString(1, Nm);
            stmt.setString(2, Em);
            stmt.setString(3, Pwd);
            stmt.setString(4, Add);

            stmt.executeUpdate();
          
            con.close();
                out.println("<h1>You have registered successfully</h1>");
                out.println("<a href=\"./login.html\"><h2>Login now</h2></a>");
        }
            catch(Exception e)
        {
            System.out.println(e);
        }
    }
}