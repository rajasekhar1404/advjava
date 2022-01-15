<h1>Hello</h1>

Welcome to JSP programs
<br><br>

<%!
int c = 40;
%>
<%!
void show()
{
    System.out.println(c);
}
%>
<%
int a = 10;
int b = 20;

out.print("Sum of a+b: "+ (a+b));
%>
<br>
<%=
    "addition of a and b "+(a+b)
%>

<!-- ======== -->

<%@ page language="java"%>

<!-- ======== -->

<%@ page import="java.util.*" %>


<%@ page info="this program is to learn jsp" %>

<%@ page contentType="text/html" %>

<%@ page errorPage="error.jsp" %>

<%
int k=20;


%>

<%@ page isThreadSafe="false" %>

<%@ page isELIgnored="true" %>

${channel}

<%@ include file="two.jsp" %>

<br>

rajasekhar

<br>

karampudi