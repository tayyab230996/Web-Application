import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class NewServlet extends HttpServlet
{
public void doPost(HttpServletRequest req,HttpServletResponse res)
        throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter pw = res.getWriter();
String URL = req.getParameter("u");
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","tayyab","tayyab7277");
Statement stmt=con.createStatement();
String q1="insert into image values('"+URL+"')";
pw.println(q1);
int x=stmt.executeUpdate(q1);
if(x>0)
{
pw.println("sucess");
}
else
{
pw.println("unsuccess");
}
con.close();
}
catch(Exception e)
{
pw.println(e);
}
}
}