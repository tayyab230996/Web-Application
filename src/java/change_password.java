import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class change_password extends HttpServlet
{
public void doPost(HttpServletRequest req,HttpServletResponse res)
        throws ServletException,IOException
    {
res.setContentType("text/html");
PrintWriter pw = res.getWriter();
String  travelID= req.getParameter("ta-id");
String pass=req.getParameter("ta-pass");
String  new_password= req.getParameter("ta-newpass");
{
    try
    {
Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","tayyab","tayyab7277");
Statement stmt=con.createStatement();
String q2="update travel_agency set password='"+new_password+"' where email='"+travelID+"' and password='"+pass+"'";

int x=stmt.executeUpdate(q2);
        if(x>0)
        {
        pw.println("<html>\n" +
"    <head>\n" +
"        <link rel=\"stylesheet\" type=\"text/css\" href=\"homepage.css\">\n" +
"        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.0.10/css/all.css\" integrity=\"sha384-+d0P83n9kaQMCwj8F4RJB66tzIwOKmrdb46+porD/OvrJ+37WqIM7UoBtwHO6Nlg\" crossorigin=\"anonymous\">\n" +
"        <style>\n" +
"            .end{background-color:rgba(165,100,78,1);}\n" +
"            h1{text-align: center;} h3{text-align: center;}   \n" +
"            p{text-align:right;color:black;margin-right: 50px;text-shadow:0 0 1px brown;font-size:20px;}\n" +
"\n" +
"        .profile\n" +
"        {text-decoration: none;text-align:center;color: darkblue;\n" +
"          display: inline-block;\n" +
"          height: 50px;width:50%;padding-top: 20px;    background-color: rgba(114,163,118,0.4); \n" +
"        }\n" +
"        .profile:hover{background-color: transparent;font-weight: bold;font-size: 20px;}\n" +
"      .view{display: block;height: 300px;width: 800px; background-color:transparent; margin-left: 260px;}\n" +
"        </style>\n" +
"    </head>\n" +
"    <body>\n" +
"        <div class=\"logo\">\n" +
"            <table>\n" +
"            <tr><td><div class=\"top-img\"><img src=\"WhatsApp Image 2018-05-09 at 1.33.51 PM.jpeg\"></div><td>\n" +
"            <td style=\"font-size:40px;font-weight: bold; font-family: Adobe Hebrew;color:black;text-shadow:0 0 5px darkred;letter-spacing: 3px;text-align:right;\">KOLKATA CITY GUIDE</td>   \n" +
"            <td width=\"30%\">\n" +
"            <p><font size=\"3\"><i class=\"fas fa-phone\"></i>CALL US:</font>\n" +
"             9038640962</p>\n" +
"            <p><font size=\"3\"><i class=\"fas fa-at\"></i>MAIL US:</font>\n" +
"             tayyab.ali03@gmail.com</p>\n" +
"             </td></tr>\n" +
"            </table>\n" +
"            <ul>\n" +
"           \n" +
"        <li><i class=\"fas fa-sign-in-alt\"></i><a href =\"loginpage.html\">LOGIN</a></li> \n" +
"       <li><i class=\"fas fa-calendar-check\"></i><a href =\"booking.html\">BOOKING</a></li> \n" +
"        <li><i class=\"fas fa-cog\"></i><a href =\"services.html\">SERVICES</a></li>\n" +
"       <li><i class=\"fas fa-home\"></i><a href =\"homepage.html\">HOME</a></li>\n" +
"      </ul> \n" +
"           </div>\n" +
"        <h2 style=\"text-align:center\">TRAVEL AGENCY HOME</h2>\n" +
"            <div class=\"view\">\n" +
"                <h3><a class=\"profile\" href=\"travelhome?id\">Click Here To See Your Profile</a></h3><br> \n" +
"                <h3><a class=\"profile\" href=\"change_pass.html\">Click Here To Change Your Password</a></h3>\n" +
"            </div>\n" +
"        \n" +
"<ul class=\"end\">\n" +
"            <li><i class=\"fas fa-info-circle\"></i><a href=\"aboutus.html\">ABOUT US</a></li>\n" +
"            <li><i class=\"fas fa-envelope\"></i><a href=\"#\">CONTACT US</a></li>\n" +
"        </ul> \n" +
"    </body>\n" +
"</html>");
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




