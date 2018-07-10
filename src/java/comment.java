import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class comment extends HttpServlet
{
@Override
public void doPost(HttpServletRequest req,HttpServletResponse res)
        throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter pw = res.getWriter();
String name = req.getParameter("name");
String email = req.getParameter("email");
String feedback = req.getParameter("feedback");
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","tayyab","tayyab7277");
Statement stmt=con.createStatement();
String q1="insert into feedback values('"+name+"','"+email+"','"+feedback+"')";
int x=stmt.executeUpdate(q1);
if(x>0)
{
res.sendRedirect("homepage.html");
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