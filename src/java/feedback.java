import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class feedback extends HttpServlet
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
String q2="select * from feedback";
ResultSet rs=stmt.executeQuery(q2);
pw.println("<html>\n" +
"    <head>\n" +
"        <link rel=\"stylesheet\" type=\"text/css\" href=\"homepage.css\">\n" +
"        <link rel=\"stylesheet\" type=\"text/css\" href=\"hotels-pics.css\">\n" +
"       <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.0.10/css/all.css\" integrity=\"sha384-+d0P83n9kaQMCwj8F4RJB66tzIwOKmrdb46+porD/OvrJ+37WqIM7UoBtwHO6Nlg\" crossorigin=\"anonymous\">\n" +
"        <style>\n" +
"    .footer{display: inline-block;height:auto;width: 100%;background-color:rgba(165,100,78,0.5);}\n" +
"        .end{background-color:rgba(165,100,78,1);}\n" +
"        input{border-radius: 5px; padding:10px;}\n" +
"             body{margin: 30px; height:auto;background-color:rgba(251,238,201,0.8);}\n" +
"    p{text-align:right;color:black;margin-right: 50px;text-shadow:0 0 1px brown;font-size:20px;}\n" +
"     p.coment{text-align:center;font-weight: bold;color:black;margin-right: 50px;\n" +
"              text-shadow:0 0 2px red;font-size: 24px;}\n" +
"     .home-content{\n" +
"    height: 20px; color:white; text-shadow:0 0 10px brown;\n" +
"    width: 400px; font-size: 24px;\n" +
"    background-color:rgba(0,0,0,0.3); \n" +
"    text-align: center; 	\n" +
"    text-decoration: none;\n" +
"    display: inline-block;\n" +
"    padding-top: 10px;padding-left: 20px;padding-bottom: 30px;padding-right: 20px;letter-spacing: 3px;\n" +
"    margin: 5px;border-radius:30px 0 30px 0;border: 3px solid  white;\n" +
"    transition: 1s;\n" +
"}\n" +
"            </style>\n" +
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
"        <li><i class=\"fas fa-sign-in-alt\"></i><a href =\"logoutadmin?id\">LOGOUT</a></li> \n" +
"       <li><i class=\"fas fa-calendar-check\"></i><a href =\"booking.html\">BOOKING</a></li> \n" +
"        <li><i class=\"fas fa-cog\"></i><a href =\"services.html\">SERVICES</a></li>\n" +
"       <li><i class=\"fas fa-home\"></i><a href =\"homepage.html\">HOME</a></li>\n" +
"      </ul> \n" +
"           </div>\n" +
"        <h1 style=\"text-align:center\">ADMIN HOME</h1>\n" +
"        <div style=\"height:auto;width: 1100px;margin-left: 100px;background-color: wheat;margin-bottom: 30px;\">\n" +
"            <center><table border=\"0\" width=\"100%\">\n" +
"                  <tr>\n" +
"                      <th width=\"30%\">NAME:</th>\n" +
"                      <th width=\"30%\">EMAIL:</th>\n" +
"                      <th width=\"40%\">FEEDBACK:</th>\n" +
"                  </tr>");
while(rs.next())
{
pw.println("<tr>\n" +
"                      <td width=\"30%\">"+rs.getString(1)+"</td>\n" +
"                      <td width=\"30%\">"+rs.getString(2)+"</td>\n" +
"                      <td width=\"40%\">"+rs.getString(3)+"</td>\n" +
"                  </tr>");
}
pw.println("</table></center>\n" +
"        </div>\n" +
"        <ul class=\"end\">\n" +
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
