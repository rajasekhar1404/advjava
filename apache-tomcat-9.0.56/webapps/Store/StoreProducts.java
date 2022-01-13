import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class StoreProducts extends HttpServlet
{
    

public void service(HttpServletRequest request, HttpServletResponse response)
{
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/mystore";
        String uname = "root";
        String pwd = "Rajasekhar@123";
        response.setContentType("text/html");
 
    
    try
    {
        String productid = request.getParameter("Pid");
        String productname = request.getParameter("Pname");
        String catagory = request.getParameter("cat");
        int Quantity = Integer.parseInt(request.getParameter("qty"));

        PrintWriter out = response.getWriter();

        Class.forName(driver);

        Connection con = DriverManager.getConnection(url, uname, pwd);
    
            //create the statement
            String qry = "insert into storeproducts values(?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(qry);
            stmt.setString(1, productid);
            stmt.setString(2, productname);
            stmt.setString(3, catagory);
            stmt.setInt(4, Quantity);

            stmt.executeUpdate();
          
            con.close();
        
        out.println(productid+"</br>");
        out.println(productname+"</br>");
        out.println(catagory+"</br>");
        out.println(Quantity+"</br>");
        out.println("<h1>all the products added successfully</h1>");
        out.println("</br></br><a href=\"./index.html\"> Add another products</a>");
        

    }
    catch(Exception e)
    {
        System.out.println(e);
    }
}

}