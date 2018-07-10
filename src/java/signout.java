import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 
/**
 * Servlet implementation class LogoutSession
 */
public class signout extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>\n" +
"    <head>\n" +
"        <link rel=\"stylesheet\" type=\"text/css\" href=\"homepage.css\">\n" +
"        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.0.10/css/all.css\" integrity=\"sha384-+d0P83n9kaQMCwj8F4RJB66tzIwOKmrdb46+porD/OvrJ+37WqIM7UoBtwHO6Nlg\" crossorigin=\"anonymous\">\n" +
"        <style>\n" +
"            .content1{height: auto;padding-top: 50px;}\n" +
"             .login-form{\n" +
"                 width:35%; height:300px;\n" +
"                align-content: space-between;\n" +
"                margin:20px;\n" +
"                padding-bottom: 5px;\n" +
"                padding-top: 50px;\n" +
"                text-align: center;\n" +
"                font-size: 20px;\n" +
"                color:darkred;\n" +
"                background-color: rgba(0,0,0,0.3);\n" +
"            }\n" +
"            .login-form:hover{font-weight: bolder;}\n" +
"            .field{\n" +
"                padding: 15px;\n" +
"                margin:5px;\n" +
"                display: inline-block;\n" +
"                border: 1px solid #ccc;\n" +
"                border-radius: 5px;\n" +
"                box-sizing: border-box;\n" +
"                border: 1px solid black;background-color:transparent;\n" +
"            }\n" +
"            .field:hover{\n" +
"                background-color:whitesmoke;\n" +
"                color: black;\n" +
"                transition-duration: 2s;\n" +
"            }\n" +
"            .travel-link:link, .travel-link:visited{\n" +
"                text-align: center;\n" +
"                text-decoration: none;\n" +
"                font-size: 16px;\n" +
"                padding: 14px 25px;\n" +
"               background-color:transparent;border: 1px solid black;\n" +
"               display: inline-block;\n" +
"               color: white;\n" +
"            }\n" +
"            .travel-link:hover,input:hover{\n" +
"                display: inline-block;\n" +
"               \n" +
"             \n" +
"                font-size: 20px;\n" +
"                transition-duration: 2s;\n" +
"            }\n" +
"\n" +
"            .logintable{\n" +
"              margin-top: 30px;\n" +
"            }\n" +
"            #td1{\n" +
"                text-align: left;\n" +
"                padding-left: 60px;\n" +
"                padding-right: 20px;\n" +
"                font: 20px sans-serif;\n" +
"                color: whitesmoke;\n" +
"            }\n" +
"            #td1:hover{\n" +
"                font-size: 22px;\n" +
"                transition-duration: 1s;\n" +
"            }\n" +
"            input{ text-align: center;\n" +
"                text-decoration: none;\n" +
"                font-size: 16px;border: 1px solid black;\n" +
"                padding: 14px 25px;margin-right: 10px;margin-left: 40px;\n" +
"               background-color:transparent;\n" +
"               display: inline-block;\n" +
"               color: whitesmoke;}\n" +
"           \n" +
"        </style>\n" +
"    </head>\n" +
"    <body>\n" +
"        \n" +
"        <div class=\"clip\">\n" +
"            <img src=\"Webp.net-gifmaker (1).gif\" height=\"300\" width=\"300\">  \n" +
"        </div>\n" +
"        <ul>\n" +
"           <li><i class=\"fas fa-sign-in-alt\"></i><a href =\"loginpage.html\">LOGIN</a></li> \n" +
"       <li><i class=\"fas fa-calendar-check\"></i><a href =\"booking.html\">BOOKING</a></li> \n" +
"        <li><i class=\"fas fa-cog\"></i><a href =\"services.html\">SERVICES</a></li>\n" +
"       <li><i class=\"fas fa-home\"></i><a href =\"homepage.html\">HOME</a></li>\n" +
"        </ul>  \n" +
"\n" +
"        <div class=\"content1\">\n" +
"           \n" +
"            <center>\n" +
"                <form class=\"login-form\" method=\"post\" action=\"admin_login\">\n" +
"                    <table class=\"logintable\">\n" +
"                \n" +
"                <tr>\n" +
"                    <td id=\"td1\">USER ID</td>\n" +
"                    <td><input class=\"field\" type=\"text\" placeholder=\"enter you id\" name=\"ad-id\"></td>\n" +
"                </tr> \n" +
"                  <tr>\n" +
"                      <td id=\"td1\">PASSWORD</td>\n" +
"                      <td><input class=\"field\" type=\"password\" placeholder=\"enetr password\" name=\"ad-pass\"></td>\n" +
"                  </tr>\n" +
"                  </table><br>\n" +
"                  <div class=\"link\">\n" +
"                   <input type=\"submit\" value=\"Login\">\n" +
"                    <a class=\" travel-link\" href=\"forgetpass.html\">Forget Password</a>\n" +
"                  </div>\n" +
"                </form>\n" +
"            </center>\n" +
"        </div>\n" +
"\n" +
"        <ul>\n" +
"            <li><i class=\"fas fa-sign-out-alt\"></i>Logout</li>\n" +
"            <li><i class=\"fas fa-info-circle\"></i><a href=\"aboutus.html\">ABOUT US</a></li>\n" +
"            <li><i class=\"fas fa-envelope\"></i><a href=\"contact.html\">CONTACT US</a></li>\n" +
"        </ul>   \n" +
"    </body>\n" +
"</html>");
		HttpSession session = request.getSession(false);
		// session.setAttribute("user", null);
		session.removeAttribute("admin");
		session.getMaxInactiveInterval();
	}
}