import javax.servlet.http.*;
import java.io.*;

public class MySecondProject extends HttpServlet
{
    public void service(HttpServletRequest request, HttpServletResponse response)
    {
        try
        {
        PrintWriter out = response.getWriter();
        out.println("<h1>Here is my 2nd servlet project</h1>");
        }
        catch(Exception e)
        {

        }
    }
}