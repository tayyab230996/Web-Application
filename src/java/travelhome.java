import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class travelhome extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse res)
        throws ServletException,IOException
{
    res.setContentType("text/html");
PrintWriter pw = res.getWriter();  

try
{
    HttpSession ses=req.getSession();
    String agencyID=(String)ses.getAttribute("agencyid");
Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","tayyab","tayyab7277");
Statement stmt=con.createStatement();
String q2="select * from travel_agency";
ResultSet rs=stmt.executeQuery(q2);
pw.println("<html>\n" +
"    <head>\n" +
"        <link rel=\"stylesheet\" type=\"text/css\" href=\"homepage.css\">\n" +
"        <style>\n" +
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
"\n" +
"            .logintable{\n" +
"              margin-top: 30px;\n" +
"            }\n" +
"            #td1{\n" +
"                text-align: left;\n" +
"                padding-left: 80px;\n" +
"                padding-right: 40px;\n" +
"                font: 18px sans-serif;\n" +
"            }\n" +
"        </style>\n" +
"    </head>\n" +
"    <body>\n" +
"        \n" +
"        <div class=\"clip\">\n" +
"            <img src=\"Webp.net-gifmaker (1).gif\" height=\"300\" width=\"300\">  \n" +
"        </div>\n" +
"        <ul class=\"wer\">\n" +
"            <li><a href =\"loginpage.html\">LOGIN</a></li> \n" +
"            <li><a href =\"booking.html\">BOOKING</a></li> \n" +
"            <li><a href =\"services.html\">SERVICES</a></li>\n" +
"            <li><a href =\"homepage.html\">HOME</a></li>\n" +
"        </ul>  \n" +
"\n" +
"        <div class=\"content\"><form method=\"post\" action=\"travelhome\">\n" +
"<table border=\"1\" width=\"100%\">\n" +
"    <tr>\n" +
"        <th width=\"16%\">NAME</th>\n" +
"        <th width=\"14%\">CONTACT NO</th>\n" +
"        <th width=\"14%\">EMAIL</th>\n" +
"        <th width=\"14%\">PASSWORD</th>\n" +
"        <th width=\"14%\">AGENCY NAME</th>\n" +
"        <th width=\"14%\">OFFICE ADDRESS</th>\n" +
"        <th width=\"14%\">OFFICE CONTACT</th>\n" +
"    </tr>");
while(rs.next())
{
pw.println(" <tr>\n" +
"        <td width=\"16%\">"+rs.getString(1)+"</td>\n" +
"        <td width=\"14%\">"+rs.getString(2)+"</td>\n" +
"        <td width=\"14%\">"+rs.getString(7)+"</td>\n" +
"        <td width=\"14%\">"+rs.getString(8)+"</td>\n" +
"        <td width=\"14%\">"+rs.getString(3)+"</td>\n" +
"        <td width=\"14%\">"+rs.getString(5)+"</td>\n" +
"        <td width=\"14%\">"+rs.getString(6)+"</td>\n" +
"    </tr>");
}
pw.println("</table>\n" +
"            </form>\n" +
"        </div>\n" +
"\n" +
"        <ul>\n" +
"            <li><a href=\"aboutus.html\">ABOUT US</a></li>\n" +
"            <li><a href=\"contactus.html\">CONTACT US</a></li>\n" +
"        </ul>   \n" +
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
