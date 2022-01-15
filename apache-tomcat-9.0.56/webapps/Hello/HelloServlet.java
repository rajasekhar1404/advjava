import javax.servlet.http.*;
import java.io.*;

public class HelloServlet extends HttpServlet
{
    public void service (HttpServletRequest request, HttpServletResponse response)
    {
        try
        {
            PrintWriter out = response.getWriter();
            out.println("<h1>Hello</h1>");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}