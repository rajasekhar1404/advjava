package raja;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;

public class customtag extends SimpleTagSupport
{
    public void doTag() throws JspException, IOException
    {
        JSPContext c = getJspContext();
        JSPWriter out = c.getOut();
        out.println("Welcome to my world");
    }
}