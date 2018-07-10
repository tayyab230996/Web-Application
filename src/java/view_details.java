import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class view_details extends HttpServlet
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
String q2="select * from travel_agency";
ResultSet rs=stmt.executeQuery(q2);
pw.println("<html>\n" +
"    <head>\n" +
"        <link rel=\"stylesheet\" type=\"text/css\" href=\"homepage.css\">\n" +
"        <link rel=\"stylesheet\" type=\"text/css\" href=\"hotels-pics.css\">\n" +
"       <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.0.10/css/all.css\" integrity=\"sha384-+d0P83n9kaQMCwj8F4RJB66tzIwOKmrdb46+porD/OvrJ+37WqIM7UoBtwHO6Nlg\" crossorigin=\"anonymous\">\n" +
"        <style>\n" +
"            .footer{display: inline-block;height:auto;width: 100%;background-color:rgba(165,100,78,0.5);}\n" +
"        .end{background-color:rgba(165,100,78,1);}\n" +
"        input{border-radius: 5px; padding:10px;}\n" +
"             body{margin: 30px; height:auto;background-color:rgba(251,238,201,0.8);}\n" +
"    p{text-align:right;color:black;margin-right: 50px;text-shadow:0 0 1px brown;font-size:20px;}\n" +
"     p.coment{text-align:center;font-weight: bold;color:black;margin-right: 50px;\n" +
"              text-shadow:0 0 2px red;font-size: 24px;}\n" +
"            .login-form{\n" +
"                border-radius: 5px;\n" +
"                background-color: #6bb76d; width:40%; height:250px;\n" +
"                align-content: space-between;\n" +
"                margin:20px;\n" +
"                padding-bottom: 5px;\n" +
"                padding-top: 5px;\n" +
"                border: 2px solid #1ab39f;\n" +
"                text-align: center;\n" +
"                font-size: 20px;\n" +
"                color:darkred;\n" +
"            }\n" +
"            .login-form:hover{font-weight: bolder;}\n" +
"            .field{\n" +
"                padding: 10px;\n" +
"                margin:2px;\n" +
"                display: inline-block;\n" +
"                border: 1px solid #ccc;\n" +
"                border-radius: 4px;\n" +
"                box-sizing: border-box;}\n" +
"            .field:hover{\n" +
"                background-color:#8fb08c;\n" +
"                color: darkblue;\n" +
"                transition-duration: 2s;\n" +
"            }\n" +
"            .travel-link:link, .travel-link:visited{\n" +
"                text-align: center;\n" +
"                text-decoration: none;\n" +
"                font-size: 16px;\n" +
"                padding: 14px 25px;\n" +
"               background-color: olivedrab;\n" +
"               \n" +
"            }\n" +
"            .wer{\n" +
"                ;\n" +
"            }\n" +
"            table{text-align: center;height: auto;}\n" +
"            .logintable{\n" +
"              margin-top: 30px;\n" +
"            }\n" +
"            #td1{\n" +
"                text-align: left;\n" +
"                padding-left: 80px;\n" +
"                padding-right: 40px;\n" +
"                font: 18px sans-serif;\n" +
"            }\n" +
"            </style>\n" +
"           </head>\n" +
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
"\n" +
"        <div class=\"content\"><form method=\"post\" action=\"view_details\">\n" +
"<table border=\"1\" width=\"100%\">\n" +
"    <tr>\n" +
"        <th width=\"16%\">NAME</th>\n" +
"        <th width=\"14%\">CONTACT NO</th>\n" +
"        <th width=\"14%\">EMAIL</th>\n" +
"        <th width=\"14%\">AGENCY NAME</th>\n" +
"        <th width=\"14%\">OFFICE ADDRESS</th>\n" +
"        <th width=\"14%\">OFFICE CONTACT</th>\n" +
"        <th width=\"14%\">ACTIVE</th>\n" +
"    </tr>");
while(rs.next())
{
pw.println(" <tr>\n" +
"        <td width=\"16%\">"+rs.getString(1)+"</td>\n" +
"        <td width=\"14%\">"+rs.getString(2)+"</td>\n" +
"        <td width=\"14%\">"+rs.getString(7)+"</td>\n" +
"        <td width=\"14%\">"+rs.getString(3)+"</td>\n" +
"        <td width=\"14%\">"+rs.getString(5)+"</td>\n" +
"        <td width=\"14%\">"+rs.getString(6)+"</td>\n" +
"        <td width=\"14%\">"+rs.getString(11)+"</td>\n" +
"    </tr>");
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
