# JDBC
 - java database connectivity.
 - 5 main steps to remember
   - Register the Driver
   - Get the connection
   - Create the statement object
   - Execute the query
   - Close the connection
**Rwgister the drvier**

 - Class.for.Name("driver name")
   - Class.forName("com.mysql.jdbc.Driver")
 - DriverManager.registryDriver(driver-object)

**Get the connection**

 - we use getConnection method which is in Driver manger package to establish the connection.
   - we need to provide url, username, and password to connect.
   - url of mysql is: jdbc:mysql://localhost3306/test

**creating statement object**

 - Statement stmt = con.createStatement();

**Execute the query**

 - stmt.executeUpdate(query);
   - stmt.executeUpdate("Insert into student values(1, "Rajasekhar")");
   - or
   - executeQuery(query);

**close the connection**

 - con.close();

# retrieve data from database

 - we have select query's and non-select query's in sql,
 - non-select query's are insert, update, create,...etc
 - select query's are "select".
 - we have to use executeQuery(qry) for select query's.
 - executeUpdate(qry) for non-select query's.
 - we can print the retrived data with result.next();
   - if the data type is int - getInt
     - getString
     - getBoolean
     - getDouble
       - getInt(1); or getInt("roll") to print the data of a perticular cell.

# sql injection

 - we can give dynamic values into out java program to insert data into a database,
 - we use strings to do this.
 - but hackers can connect to database by giving sql query's from the users
 - if user enters **' or 1=1 -- '** in the place of username then they can access our database.
 - to protect from this type of sql injection we have preparedstatements in JDBC.

# Prepared Statement in JDBC

 - in this method first the statement will send the question marks in the place of dynamic values, then in the place of these question marks, it will replace the values with given data.

# callable Statement in JDBC

 - it is used to execute procedures.
 - static query's are executed by using statement
 - dynamic query's are executed by using prepared statements.
 - It is used to execute already stored statements by calling them.

# Type of Resultsets
 - we use resultsets in the createStatements method to get more efficient results.
 - createStatement(Result Type, Concurrency Mode)
   - ResultSet Type:
     - ResultSet.TYPE_FORWARD_ONLY
     - ResultSet.TYPE_SCROLL_INSENSITIVE
     - ResultSet.TYPE_SCROLL_SENSITIVE

   - Concurrency Mode
     - ResultSet.CONCUR_READ_ONLY
     - ResultSet.CONCUR_UPDATABLE

# introduction to web applications

 - we can create 3 types of application using java
   - Standalone applications: desktop application, they need all the code in the client system.
   - Applet: client side applications, but depricated due to the execution of code in client system.
   - web based applications: server side application,

 - types of web servers of java
   - Tomcat, web logic, websphere, jboss
 - php
   - xampp/wamp/apache
 - .net
   - vs

 - HTTP: Hyper Text Transfer Protocol

# procedure to develop first webbased application

 - project folder structure:
   - Create a folder with your project name
   - create a folder "WEB-INF" inside above folder
   - in WEB-INF
     - Create 2 sub folders classes, lib
     - Create a file web.xml
   - place all html, css, jsp, java script files inside project folder
   - place all the library files(.jar) in lib folder
   - place all the .class files in classes folder.

 - we can run the server with localhost:8080

# servlet & it's life cycle

 - server is also an java programs which will run in web server.
 - servlet life cycle;
   - init
   - service
   - destroy

# database connectivity for servlets

 - same as regular java database connectivity.

# introduction to JSP

 - JSP: Java Server Pages
 - it is advanced version of servlets.
 - it improves the productivity
 - we can separate presentation logic bussiness Logic
 - We can develop application without writing java code.
 - we can write multiple types of codes in a single jsp file.
 - we can write jsp code without having knowledge on java.

# JSP Elements:

 - Telmplate Text: Text that is directly Written inside jsp file.1
 - Scriptlet: It is used to write java code inside jsp.
   - it can be identified with scriptlet tags as follows
      <%
        java code
      %>
 - JSP Declarations: it is used to declare variables or methods.
      <%!
        instance variables
        instance methods
        static variables
        static methods
      %>
 - JSP Directivie: it is used to give instructions to java compiler
                  <%@ directivename otherparameters
                  %>
   directive attributes: language, import, extends, session, info, contextType, errorPage, isErrorPage, isThreadSafe, isELIgnored.
 - JSP Expressions:it is used to print the result.
                     <%=
                          expression
                     %>
   - we have 3 directives in it
     - page: to include content in it
     - include: to include the other files, like other jsp or html etc.
     - taglib: to create custom tags.
 - JSP Action Tags
 - JSP Custom Tags

# java beans

 - java beans is also a java class which follows it's own rules.
   - those rules are
     - class must be declared as public.
     - it must implements from serializable class.(not mandatary)
     - all properties mmust be declared as private.
     - write setteer and getter methods for each property
       - ex:
            private int rno;

            public int getRno()
            {
              return rno;
            }

            public void setRno(int r)
            {
              rno=r;
            }
     - Provide default constructer
        public Student()
        {
          
        }

# jsp action tags

  - to change the behaviour of servlet engine
 - to perform actions
 - we must create the java program in the classes folder so we can get the result, that is what you learn while learning this topic.

# custom tags in JSP

 - These are used to create our own tags to perform required action.
 - it can be done with a simpleTagSupport class and doTag method.
 - we use tld file to like our programs with tags, tld: tag library discripter.
 - we use three steps to create a custom tag.
   - create a cls that extends SimpleTagSupport
   - override doTag() method
   - create a tld file.

# implicit variables in JSP
  these variables are given by JSP to automatically work, we don't need to create object for these variables, we can directly implement the values using the available variables given by JSP.

 - request: it is an object of HttpServletRequest.
 - response: HttpServletResponse.
 - out: we can print text or anything on the screen with this clss.
 - session: thse are used to manage the session.(HttpSession)
 - application
 - config
 - pageContext
 - page
 - Exception

# State Management in Web Apps

 - HTTP(HyperText Transfer Protocol) is a Stateless Protocol
 - it won't remember the previous status except the just before status.
 - we can manage them StateFull using Hidden Variables, Cookies, Sessions, Sessions with URL Rewriting.