import javax.servlet.http.*;
import java.sql.*;
import java.io.*;

public class Login extends HttpServlet {
    public void service(HttpServletRequest request, HttpServletResponse response)
    {

        response.setContentType("text/html");


        try{
                        
            PrintWriter out = response.getWriter();
            String Em = request.getParameter("Email");
            String Pwd1 = request.getParameter("Password");
    
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/mystore";
            String uname = "root";
            String pwd = "Rajasekhar@123";

            Class.forName(driver);

            Connection con = DriverManager.getConnection(url, uname, pwd);
    
            //create the statement
            String qry = "select * from login where(Email=?)";
            PreparedStatement stmt = con.prepareStatement(qry);
            stmt.setString(1, Em);

            ResultSet rs = stmt.executeQuery();

            if(rs.next())
            {
                String pw = rs.getString("Password");
                if(Pwd1.equals(pw))
                {
                    response.sendRedirect("./index.html");
                }
                else
                {
                    out.println("<h1>incorrect password<h1>");
                }

            }
            else
            {
                out.println("<h1>User doesnot exits</h1>");
            }
          
            con.close();
        }
            catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
