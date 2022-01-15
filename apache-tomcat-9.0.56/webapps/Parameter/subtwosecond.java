import javax.servlet.http.*;
import java.io.*;
import javax.servlet.*;

public class subtwosecond extends HttpServlet
{
    public void service(HttpServletRequest request, HttpServletResponse response)
    {
        response.setContentType("text/html");

        try
        {
        ServletConfig config = getServletConfig();
        String name = config.getInitParameter("nm");
        PrintWriter out = response.getWriter();
        out.println("<h1>Wellcome "+name+"</h1>");

        ServletContext application = config.getServletContext();
        String comp = application.getInitParameter("company");

        out.println("<h1> wellcome my name is "+name+" i am working at "+comp);
        }
        catch(Exception e)
        {

        }
    }
}