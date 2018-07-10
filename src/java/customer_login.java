import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 
public class customer_login extends HttpServlet
{
public void doPost(HttpServletRequest req,HttpServletResponse res)
        throws ServletException,IOException
{
    res.setContentType("text/html");
PrintWriter pw = res.getWriter();
String userid = req.getParameter("cu-id");
String pass = req.getParameter("cu-pass");
{    
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","tayyab","tayyab7277");
Statement stmt=con.createStatement();
String q2="select * from traveller_booking where email='"+userid+"' and password='"+pass+"'";
ResultSet rs=stmt.executeQuery(q2);
if(rs.next())
{
pw.println("sucess");
}
else
{
pw.println("failure");
}
con.close();
}
catch(Exception e)
{
pw.println(e);
}
}
}
}