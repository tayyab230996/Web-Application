import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class travel extends HttpServlet
{
public void doPost(HttpServletRequest req,HttpServletResponse res)
        throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter pw = res.getWriter();
String f_name = req.getParameter("n1");
String m_name = req.getParameter("n2");
String l_name = req.getParameter("n3");
String mobile = req.getParameter("n7");
String agency=req.getParameter("agencyname");
String reg_no=req.getParameter("reg");
String address = req.getParameter("n4");
String contact = req.getParameter("n6");
String email = req.getParameter("n5");
String password = req.getParameter("n10");
String seq_que = req.getParameter("seq-ques");
String ans = req.getParameter("seq-ans");

String name=f_name+" "+m_name+" "+l_name;
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","tayyab","tayyab7277");
Statement stmt=con.createStatement();
String q1="insert into travel_agency values('"+name+"','"+mobile+"','"+agency+"','"+reg_no+"','"+address+"','"+contact+"','"+email+"','"+password+"','"+seq_que+"','"+ans+"','no')";
int x=stmt.executeUpdate(q1);
if(x>0)
{
pw.println("<html>\n" +
"    <head>\n" +
"        <link rel=\"stylesheet\" type=\"text/css\" href=\"homepage.css\">\n" +
"        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.0.10/css/all.css\" integrity=\"sha384-+d0P83n9kaQMCwj8F4RJB66tzIwOKmrdb46+porD/OvrJ+37WqIM7UoBtwHO6Nlg\" crossorigin=\"anonymous\">\n" +
"        <style>\n" +
"             body{margin: 0px;background-image: url(\"victoria_memorial_by_sagnikarmakar.jpg\");}\n" +
"        h2{color:black;text-align: center;text-shadow:0 0 2px navy;} \n" +
"        h2:hover{color:black;text-align: center;text-shadow:0 0 5px navy;} \n" +
"       .inner{margin: 60px;background-image: url(\"victoria_memorial_by.jpg\");\n" +
"             height:auto;}\n" +
"       p{text-align:right;color:black;margin-right: 50px;text-shadow:0 0 1px brown;font-size:20px;} \n" +
"       p.coment{text-align:center;font-weight: bold;color:whitesmoke;margin-right: 50px;\n" +
"              text-shadow:0 0 2px red;font-size: 24px;}\n" +
"        table{width:100%; text-align: center;}\n" +
"       input{border-radius: 5px; padding:10px;}\n" +
"       .content1{height: auto;}\n" +
"             .login-form{\n" +
"               width:30%; height:auto;\n" +
"                align-content: space-between;\n" +
"                margin:20px; background-color:rgba(239,228,176,0.3);\n" +
"                padding-top: 15px;\n" +
"                text-align: center;\n" +
"                font-size: 20px;\n" +
"            }\n" +
"            td{font-size: 22px; color: black;font-weight: bold;}\n" +
"            .field{\n" +
"                padding: 10px;\n" +
"                margin:5px; color:whitesmoke; font-size: 20px;\n" +
"                display: inline-block;\n" +
"                border: 1px solid #ccc;\n" +
"                border-radius: 5px;\n" +
"                box-sizing: border-box; \n" +
"                border: 2px solid black;background-color:rgba(0,0,0,0.3);\n" +
"                padding-right: 40px;padding-left: 40px;\n" +
"            }\n" +
"            .field:hover{\n" +
"                \n" +
"                transition-duration: 2s;\n" +
"            }\n" +
"            \n" +
"            .sub{ text-align: center;\n" +
"                text-decoration: none;\n" +
"                font-size: 24px;border: 2px solid black;\n" +
"                padding:10px;margin-right: 10px;margin-left: 20px;margin-bottom: 20px;\n" +
"               background-color:transparent; padding-right: 20px;padding-left: 20px;\n" +
"               display: inline-block;\n" +
"               color:white;}\n" +
"            </style>\n" +
"    </head>\n" +
"    <body>\n" +
"        <div class=\"inner\"> \n" +
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
"       <h2>Agency Login</h2>\n" +
"        <div class=\"content1\">\n" +
"           \n" +
"            <center>\n" +
"                <form class=\"login-form\" method=\"post\" action=\"agency_login\">\n" +
"                    <table class=\"logintable\">\n" +
"                <tr>\n" +
"                    <td>USER ID:<br><input class=\"field\" type=\"email\"  name=\"ta-id\"></td>\n" +
"                </tr> \n" +
"                  <tr>\n" +
"                      <td>PASSWORD:<br><input class=\"field\" type=\"password\"  name=\"ta-pass\"></td>\n" +
"                  </tr>\n" +
"                  </table><br>\n" +
"                  <input class=\"sub\"  type=\"submit\" value=\"Login\">\n" +
"                   <a class=\"sub\" href=\"travel-reg.html\" target=\"_blank\">New User..?</a>\n" +
"                 \n" +
"                 \n" +
"                </form>\n" +
"            </center>\n" +
"        </div>\n" +
"<ul class=\"end\">\n" +
"            <li><i class=\"fas fa-info-circle\"></i><a href=\"aboutus.html\">ABOUT US</a></li>\n" +
"            <li><i class=\"fas fa-envelope\"></i><a href=\"#\">CONTACT US</a></li>\n" +
"        </ul> \n" +
"        </div>\n" +
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