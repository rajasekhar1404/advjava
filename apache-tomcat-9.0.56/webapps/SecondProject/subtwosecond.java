import javax.servlet.http.*;
import java.io.*;

public class subtwosecond extends HttpServlet
{
    public void service(HttpServletRequest request, HttpServletResponse response)
    {
        try
        {
        PrintWriter out = response.getWriter();
        out.println("<h1>here is the 2nd sub url of web apps program</h1>");
        }
        catch(Exception e)
        {

        }
    }
}