import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class view_pack1 extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse res)
        throws ServletException,IOException
{
    res.setContentType("text/html");
PrintWriter pw = res.getWriter();  

try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","tayyab","tayyab7277");
Statement stmt=con.createStatement();
String q2="select * from package";
ResultSet rs=stmt.executeQuery(q2);
pw.println("<html>\n" +
"    <head>\n" +
"        <link rel=\"stylesheet\" type=\"text/css\" href=\"homepage.css\">\n" +
"         <link rel=\"stylesheet\" type=\"text/css\" href=\"package.css\">\n" +
"       <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.0.10/css/all.css\" integrity=\"sha384-+d0P83n9kaQMCwj8F4RJB66tzIwOKmrdb46+porD/OvrJ+37WqIM7UoBtwHO6Nlg\" crossorigin=\"anonymous\">\n" +
"    </head>\n" +
"    <body>\n" +
"    \n" +
"         <div class=\"logo\">\n" +
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
"       <h1><marquee>VIEW PACKAGES</marquee></h1>\n" +
"       <div class=\"content1\">\n" +
"           <div class=\"pack\">\n" +
"               \n" +
"               <table border=\"1\"><h2>Full Day Tour</h2>\n" +
"        <tr>\n" +
"            <td id=\"title\">Features:</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td id=\"option1\">Time Duration:</td><td id=\"option2\">10 Hours</td> \n" +
"            </tr>\n" +
"        <tr>\n" +
"            <td id=\"option1\">Tour Starts:</td><td id=\"option2\">8 a.m(From Esplanade or Our Affilated Hotels)</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td id=\"option1\">Tour Plan:</td><td id=\"option2\">Sightseeing Spots included in Our Tour Package</td> \n" +
"            </tr>\n" +
"        <tr>\n" +
"            <td id=\"option1\">Vehicle:</td><td id=\"option2\">AC/Non-AC</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td id=\"option1\">Refreshment:</td><td id=\"option2\">Drinking Water + Light Snacks </td>\n" +
"            </tr>\n" +
"        <tr>\n" +
"            <td id=\"option1\">Lunch Break:</td><td id=\"option2\">Yes</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td id=\"title\">Sightseeing Spots:</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td id=\"option1\">Drop &AMP; Visit:</td>");
while(rs.next())
{
pw.println("<td id=\"option2\">"+rs.getString(1)+"</td></tr>\n");
}
pw.println("   <tr>\n" +
"            <td>Drive Pass:</td>");
while(rs.next())
{
pw.println("<td id=\"option2\">"+rs.getString(2)+"</td></tr>\n");
}
pw.println("<tr>\n" +
"            <td>Drive Over:</td>");
while(rs.next())
{
pw.println("<td id=\"option2\">"+rs.getString(3)+"</td></tr>\n");
}
pw.println(
"        <tr>\n" +
"            <td id=\"title\">Package Cost:</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td id=\"option1\">Tour in AC Vehicle(1 Guest):</td>");
while(rs.next())
{
pw.println("<td id=\"option2\">"+rs.getString(4)+"</td></tr>\n");
}
pw.println(
"        <tr>\n" +
"            <td id=\"option1\">Tour in Non-AC Vehicle(1 Guest):</td>");
while(rs.next())
{
pw.println("<td id=\"option2\">"+rs.getString(5)+"</td> </tr>\n");
}
pw.println(
"        <tr>\n" +
"            <td id=\"option1\">Additional Guest:</td>");
while(rs.next())
{
pw.println("<td id=\"option2\">"+rs.getString(6)+"</td> </tr>\n");
}
pw.println(
"        <tr>\n" +
"            <td id=\"option1\">Tour Guide Charges:</td>");
while(rs.next())
{
pw.println("<td id=\"option2\">"+rs.getString(7)+"</td>\n" +
"        </tr>");
}
pw.println("</table> \n" +
"            </form></div>\n" +
"                <ul class=\"end\">\n" +
"            <li><i class=\"fas fa-info-circle\"></i><a href=\"aboutus.html\">ABOUT US</a></li>\n" +
"            <li><i class=\"fas fa-envelope\"></i><a href=\"#\">CONTACT US</a></li>\n" +
"        </ul> \n" +
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
