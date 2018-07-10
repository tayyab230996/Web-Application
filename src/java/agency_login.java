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
 
public class agency_login extends HttpServlet
{
public void doPost(HttpServletRequest req,HttpServletResponse res)
        throws ServletException,IOException
{
    res.setContentType("text/html");
PrintWriter pw = res.getWriter();
String userid = req.getParameter("ta-id");
String pass = req.getParameter("ta-pass");
{    
try
{
    HttpSession ses=req.getSession();
    ses.setAttribute("agencyid",userid);
Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","tayyab","tayyab7277");
Statement stmt=con.createStatement();
String q2="select * from travel_agency where email='"+userid+"' and password='"+pass+"'and active='yes'";
ResultSet rs=stmt.executeQuery(q2);
if(rs.next())
{
pw.println("<html>\n" +
"    <head>\n" +
"        <link rel=\"stylesheet\" type=\"text/css\" href=\"homepage.css\">\n" +
"        <style>\n" +
"            h1{text-align: center;}a{text-decoration: none;text-align:center;color: darkblue;}h3{text-align: center;}\n" +
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
"        <div class=\"content\">\n" +
"            <h1> WELCOME TO TRAVEL AGENCY HOMEPAGE</h1><br>\n" +
"            <h3><a href=\"travelhome?id\">To View Your Profile Click on This Link</a></h3>\n" +
"        </div>\n" +
"\n" +
"        <ul>\n" +
"            <li><a href=\"aboutus.html\">ABOUT US</a></li>\n" +
"            <li><a href=\"contactus.html\">CONTACT US</a></li>\n" +
"        </ul>   \n" +
"    </body>\n" +
"</html>");
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