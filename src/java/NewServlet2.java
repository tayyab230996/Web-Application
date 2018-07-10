import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class NewServlet2 extends HttpServlet
{
public void doPost(HttpServletRequest req,HttpServletResponse res)
        throws ServletException,IOException
{
    res.setContentType("text/html");
PrintWriter pw = res.getWriter();   
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","tayyab","tayyab7277");
Statement stmt=con.createStatement();
String q2="select url from image";
ResultSet rs=stmt.executeQuery(q2);
pw.println("<html>\n" +
"    <head>\n" +
"      <style>\n" +
"          td{height: 400px;width: 600px;}\n" +
"          </style>\n" +
"    </head>\n" +
"    <body>\n" +
"        <table>");
while(rs.next())
{
pw.println("<html>\n" +
"    <head>\n" +
"      <style>\n" +
"          table{height: 400px;width: 600px;}\n" +
"          </style>\n" +
"    </head>\n" +
"    <body> \n" +
"        <table border=\"1\">\n" +
"            <tr>\n" +
"                <td><img src="+rs.getString(1)+"></td>\n" +
"            </tr>\n" +
"            \n" +
"        </table>\n" +
"      \n" +
"    </body>\n" +
"</html>");
}
pw.println(
"    </body>\n" +
"</html>");
con.close();
}
catch(Exception e)
{
pw.println(e);
}
}
}
