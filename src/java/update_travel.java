import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class update_travel extends HttpServlet
{
public void doPost(HttpServletRequest req,HttpServletResponse res)
        throws ServletException,IOException
    {
res.setContentType("text/html");
PrintWriter pw = res.getWriter();
String  travelID= req.getParameter("ta-id");
{
    try
    {
Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","tayyab","tayyab7277");
Statement stmt=con.createStatement();
String q2="update travel_agency set active='no' where email='"+travelID+"'";
pw.println(q2);
int x=stmt.executeUpdate(q2);
        if(x>0)
        {
       res.sendRedirect("update_travel.html");
        }
        else
        {
        pw.println("update unsuccess");
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




