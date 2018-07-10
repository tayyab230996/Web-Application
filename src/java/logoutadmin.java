
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class logoutadmin extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       PrintWriter out = response.getWriter();
       HttpSession session=request.getSession(false);
       session.invalidate();
       out.print("<html>\n" +
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
"       .content1{height: auto;background-color: wheat;width: 40%;align-content: center;}\n" +
"            \n" +
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
"        \n" +
"            <center>\n" +
"                <h2>You are Sucessfully Logged Out</h2>       \n" +
"            </center>\n" +
"        \n" +
"<ul class=\"end\">\n" +
"            <li><i class=\"fas fa-info-circle\"></i><a href=\"aboutus.html\">ABOUT US</a></li>\n" +
"            <li><i class=\"fas fa-envelope\"></i><a href=\"#\">CONTACT US</a></li>\n" +
"        </ul> \n" +
"        </div>\n" +
"    </body>\n" +
"</html>");
     
      
    }

   

}
