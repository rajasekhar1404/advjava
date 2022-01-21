<%@page import="java.servlet.http.*"%>

<html>
    <head>

    </head>

    <body>
        <%
        String name = request.getParameter("un");
        String pwd = request.getParameter("pwd");

        session.setAttribute("sun", name);
        session.setAttribute("spwd", pwd);
        %>
        <form action="<%= response.encodeURL("getdata.jsp")%>" method="post">


        Email
        <input type="email" name="em"><br>
        Subject
        <input type="text" name="sb"><br>
        <button type="submit">Submit</button>
    </form>
    </body>
</html>