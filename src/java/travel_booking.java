import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class travel_booking extends HttpServlet
{
@Override
public void doPost(HttpServletRequest req,HttpServletResponse res)
        throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter pw = res.getWriter();
String f_name = req.getParameter("n1");
String m_name = req.getParameter("n2");
String l_name = req.getParameter("n3");
String mob_no=req.getParameter("mobile");
String emailID=req.getParameter("email");
String pass=req.getParameter("password");
String city=req.getParameter("city");
String state=req.getParameter("state");
String date=req.getParameter("date");
String person=req.getParameter("persons");
String pack=req.getParameter("pack-type");
String vehicle=req.getParameter("veh-type");
String pick_point=req.getParameter("pickup");
String drop_point=req.getParameter("drop");
String name=f_name+" "+m_name+" "+l_name;
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","tayyab","tayyab7277");
Statement stmt=con.createStatement();
String q1="insert into traveller_booking values('"+name+"',"+mob_no+",'"+emailID+"','"+pass+"','"+city+"','"+state+"','"+date+"','"+person+"','"+pack+"','"+vehicle+"','"+pick_point+"','"+drop_point+"')";
int x=stmt.executeUpdate(q1);
if(x>0)
{
pw.println("<html>\n" +
"    <head>\n" +
"        <link rel=\"stylesheet\" type=\"text/css\" href=\"homepage.css\">\n" +
"        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.0.10/css/all.css\" integrity=\"sha384-+d0P83n9kaQMCwj8F4RJB66tzIwOKmrdb46+porD/OvrJ+37WqIM7UoBtwHO6Nlg\" crossorigin=\"anonymous\">\n" +
"        <style>\n" +
"            .payment{height:200px;width:600px;display: block;background-color: rgba(0,0,0,0.3);\n" +
"           margin-left: 350px;margin-top: 10px;margin-bottom: 20px;}\n" +
"            .content1{height: auto;} h2{text-align: center;}\n" +
"            .card-field\n" +
"            {padding: 15px 40px;\n" +
"             margin:10px;margin-top: 15px;\n" +
"            display: inline-block;background-color:white;opacity: 0.8;\n" +
"            border: 1px solid #ccc;\n" +
"             border-radius: 5px;\n" +
"            box-sizing: border-box;\n" +
"            margin-left: 50px;\n" +
"            }\n" +
"            .card-field1{padding: 15px 40px;\n" +
"             margin:15px;\n" +
"            display: inline-block;\n" +
"            border: 1px solid #ccc;\n" +
"             border-radius: 5px;\n" +
"            box-sizing: border-box;\n" +
"            margin-left: 230px;}\n" +
"            .payment-form{display: block;position: absolute;top:98%;margin-left: 30px;}\n" +
"            .card1{opacity: 0.7;} table{text-align: center;margin-top: 45px;}\n" +
"           p{font-size: 20px;text-align: center}h2{text-align: center;color:darkblue;}\n" +
"           #back{text-align: center;text-decoration: none;color: darkblue;}\n" +
"            </style>\n" +
"    </head>\n" +
"    <body>\n" +
"         <div class=\"clip\">\n" +
"      <video preload=\"auto\" autoplay=\"autoplay\" src=\"victoria_memorialtrim.mp4\" loop></video> \n" +
"       </div>\n" +
"         <ul>\n" +
"       <li><i class=\"fas fa-sign-in-alt\"></i><a href =\"loginpage.html\">LOGIN</a></li> \n" +
"       <li><i class=\"fas fa-calendar-check\"></i><a href =\"booking.html\">BOOKING</a></li> \n" +
"        <li><i class=\"fas fa-cog\"></i><a href =\"services.html\">SERVICES</a></li>\n" +
"       <li><i class=\"fas fa-home\"></i><a href =\"homepage.html\">HOME</a></li>\n" +
"      </ul>     \n" +
"        \n" +
"       <div class=\"content1\">\n" +
"           <div class=\"payment\"> <br>\n" +
"            <h2>Thank You for Booking Our Packages.</h2>\n" +
"           <p>Our Team will you within 12 Hours of your Booking.<br>\n" +
"           <a id=\"back\" href=\"homepage.html\">Back to Homepage</a></p>\n" +
"       </div>\n" +
"       </div>\n" +
"        <ul>\n" +
"            <li><i class=\"fas fa-info-circle\"></i><a href=\"aboutus.html\">ABOUT US</a></li>\n" +
"            <li><i class=\"fas fa-envelope\"></i><a href=\"contact.html\">CONTACT US</a></li>\n" +
"           </ul>   \n" +
"    </body>\n" +
"</html>");
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