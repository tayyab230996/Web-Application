import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class update_package2 extends HttpServlet
{
public void doPost(HttpServletRequest req,HttpServletResponse res)
        throws ServletException,IOException
    {
res.setContentType("text/html");
PrintWriter pw = res.getWriter();
String Drop_Visit=req.getParameter("dv");
String Drive_Pass=req.getParameter("dp");
String Drive_Over=req.getParameter("do");
String AC=req.getParameter("ac");
String Non_AC=req.getParameter("nac");
String Add_guest=req.getParameter("ag");
String Guide_Charges=req.getParameter("gc");

    try
    {
        
Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","tayyab","tayyab7277");
Statement stmt=con.createStatement();
String q2="update package_3 set drop_visit='"+Drop_Visit+"',drive_pass='"+Drive_Pass+"',drive_over='"+Drive_Over+"',ac='"+AC+"',non_ac='"+Non_AC+"',add_guest='"+Add_guest+"',guide_charges='"+Guide_Charges+"'";
int x=stmt.executeUpdate(q2);
        if(x>0)
        {
            pw.println("<html>\n" +
"    <head>\n" +
"        <link rel=\"stylesheet\" type=\"text/css\" href=\"homepage.css\">\n" +
"        <link rel=\"stylesheet\" type=\"text/css\" href=\"package.css\">\n" +
"       <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.0.10/css/all.css\" integrity=\"sha384-+d0P83n9kaQMCwj8F4RJB66tzIwOKmrdb46+porD/OvrJ+37WqIM7UoBtwHO6Nlg\" crossorigin=\"anonymous\">\n" +
"    <style>\n" +
"        table{width: 100%;text-align:left; line-height: 2;letter-spacing: 1.5px;font-size: 18px;}\n" +
"         input{padding-right: 100px;padding-left: 100px;padding: 15px;border: 2px solid brown;}\n" +
"         #title{height: 20px;width: 40%;color:darkcyan;font-size:30px;}\n" +
"         #option1{height: 15px;width:30%;font-size: 20px;color: red;}\n" +
"         #option2{height: 15px;width:20%;font-size: 20px;color: blue;}\n" +
"         #option3{height: 15px;width:30%;font-size: 20px;color: red;}\n" +
"         #option4{height: 15px;width:20%;font-size: 20px;color: blue;}\n" +
"         #option5{height: 15px;width:30%;font-size: 20px;color: red;}\n" +
"         #option6{height: 15px;width:30%;font-size: 20px;color: red;}\n" +
"         #update{margin-top: 30px;margin-left: 600px;font-size: 22px;background-color:brown;color: white;}\n" +
"        </style>\n" +
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
"        <h1><marquee>Update Packages</marquee></h1>\n" +
"       <div class=\"content1\">\n" +
"           <div class=\"pack\">\n" +
"               <form method=\"post\" action=\"update_package\">      \n" +
"               <table><h2>Full Day Tour</h2>\n" +                   
"                   <div style=\"height:70px;width: 480px;margin-top: 10px;margin-left:400px;\">\n" +
"                       <h1 style=\"text-align:center;color:greenyellow\">Updated Sucessfully</h1>\n" +
"               </div>\n" +
"                   \n" +
"        <tr>\n" +
"            <td id=\"title\">Features:</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td id=\"option1\">Time Duration:</td><td id=\"option2\">10 Hours</td> &Tab;&Tab;<td id=\"option3\">Tour Starts:</td><td id=\"option4\">8 a.m(From Esplanade or Our Affilated Hotels)</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td id=\"option1\">Tour Plan:</td><td id=\"option2\">Sightseeing Spots included in Our Tour Package</td> &Tab;&Tab;<td id=\"option3\">Vehicle:</td><td id=\"option4\">AC/Non-AC</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td id=\"option1\">Refreshment:</td><td id=\"option2\">Drinking Water + Light Snacks </td> &Tab;&Tab;<td id=\"option3\">Lunch Break:</td><td id=\"option4\">Yes</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td id=\"title\">Sightseeing Spots:</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td id=\"option5\">Drop &AMP; Visit:</td><td id=\"option6\"><input type=\"text\" name=\"dv\"></td> \n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td id=\"option5\">Drive Pass:</td><td id=\"option6\"><input type=\"text\" name=\"dp\"></td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td id=\"option5\">Drive Over:</td><td id=\"option6\"><input type=\"text\" name=\"do\"></td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td id=\"title\">Package Cost:</td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td id=\"option1\">Tour in AC Vehicle(1 Guest):</td><td id=\"option2\"><input type=\"text\" name=\"ac\"></td> &Tab;&Tab;<td id=\"option3\">Tour in Non-AC Vehicle(1 Guest):</td><td id=\"option4\"><input type=\"text\" name=\"nac\"></td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td id=\"option1\">Additional Guest:</td><td id=\"option2\"><input type=\"text\" name=\"ag\"></td> &Tab;&Tab;<td id=\"option3\">Tour Guide Charges:</td><td id=\"option4\"><input type=\"text\" name=\"gc\"></td>\n" +
"        </tr>\n" +
"        <tr>\n" +
"            <td id=\"option1\">Parking/Toll:</td><td id=\"option2\"> Inclusive</td> &Tab;&Tab;<td id=\"option3\">Entry Fee/Tickets:</td><td id=\"option4\">Not included</td>\n" +
"        </tr>\n" +
"               </table>\n" +
"               <input id=\"update\" type=\"submit\" value=\"UPDATE\"></form> \n" +
"           </div>\n" +
"           <div class=\"center\">\n" +
"           <div class=\"pag\">\n" +
"               <a href=\"update-package2.html\">&laquo;</a>\n" +
"               <a href=\"update-package.html\">1</a>\n" +
"               <a href=\"update-package1.html\">2</a>\n" +
"               <a href=\"update-package2.html\">3</a>\n" +
"               <a href=\"update-package1.html\">&raquo;</a>\n" +
"           </div>\n" +
"           </div>\n" +
"       </div>\n" +
"       <div class=\"footer\"><h2>Let's Keep In Touch</h2>\n" +
" <p class=\"coment\">Thank you for Visiting City Tourism.If you would like to get in touch into contact with us,please fill out the form below.</p>\n" +
"       <form>\n" +
"              <table>\n" +
"                  <tr>\n" +
"                      <td width=\"30%\">\n" +
"                          <font style=\"font-weight: bold;color:black;margin-right: 30px;text-shadow:0 0 2px red;font-size: 24px;\">Name:</font><input  type=\"text\" placeholder=\"Enter Name\" name=\"name\"><br><br>\n" +
" <font style=\"font-weight: bold;color:black;margin-right: 30px;text-shadow:0 0 2px red;font-size: 24px;\"> Email:</font><input type=\"text\" placeholder=\"Enter Email\" name=\"email\">\n" +
"                      </td>\n" +
"                      <td width=\"20%\">\n" +
"                          <p class=\"coment\">Comments:</p>\n" +
"                          <textarea rows=\"7\" cols=\"40\" name=\"comment\"></textarea>\n" +
"                      </td>\n" +
"                      <td width=\"40%\">\n" +
"                          <p class=\"coment\" style=\"text-align:left\">\n" +
"             <font size=\"3\">Address:</font><br>\n" +
"                              Nowhere Street<br>\n" +
"                              Kolkata-700000,West Bengal<br>\n" +
"                          Phone:\n" +
"                              033-24467890\n" +
"                          </p>\n" +
"                      </td>\n" +
"                  </tr>\n" +
"              </table>\n" +
"          </form>\n" +
"           <ul class=\"end\">\n" +
"            <li><i class=\"fas fa-info-circle\"></i><a href=\"aboutus.html\">ABOUT US</a></li>\n" +
"            <li><i class=\"fas fa-envelope\"></i><a href=\"#\">CONTACT US</a></li>\n" +
"        </ul> \n" +
" </div>\n" +
"\n" +
"    </body>\n" +
"</html>");
        } else {
            System.out.println("in else");
        }
        con.close();
    }
    
        catch(Exception e)
        {
        pw.println(e);
        }
    }
}




