import javax.servlet.http.*;
import java.io.*;

public class FirstServlet extends HttpServlet
{
public void service(HttpServletRequest request, HttpServletResponse response)
    {
        try
        {
        PrintWriter out = response.getWriter();
        out.println("Hello, this is my first servelet program");
        }
        catch(Exception e)
        {}
    }
}