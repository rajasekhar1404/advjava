<%@ page import="java.servlet.http.*"%>

User entered data is <br><br>
<%
    String s1 = (String)session.getAttribute("sun");
    String s2 = (String)session.getAttribute("spwd");
%>
Username is: <%= s1 %><br>
Password is: <%= s2 %><br>
Email is: <%= request.getParameter("em") %> <br>
Subject is: <%= request.getParameter("sb") %> <br>