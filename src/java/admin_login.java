import java.io.*;
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
public class admin_login extends HttpServlet
{
public void doPost(HttpServletRequest req,HttpServletResponse res)
        throws ServletException,IOException
{
     res.setContentType("text/html");
PrintWriter pw = res.getWriter();
String username = req.getParameter("ad-id");
String password = req.getParameter("ad-pass");
HttpSession session=req.getSession();
if ((username.equals("tayyab.ali03@gmail.com")) && (password.equals("tayyab01")))
{    session.setAttribute("adminid",username);
    res.sendRedirect("./adminhome");
   /* pw.println("<html>\n" +
"    <head>\n" +
"        <link rel=\"stylesheet\" type=\"text/css\" href=\"homepage.css\">\n" +
"        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.0.10/css/all.css\" integrity=\"sha384-+d0P83n9kaQMCwj8F4RJB66tzIwOKmrdb46+porD/OvrJ+37WqIM7UoBtwHO6Nlg\" crossorigin=\"anonymous\">\n" +
"        <style>\n" +
"    h1{text-align: center; color: teal;} h2{text-align: center;}\n" +
"   .adminhome{background-color:transparent;height:auto;width:100%;}\n" +
"   .admin{height:40px;width:500px; text-decoration: none;color:whitesmoke;display: block;\n" +
"           background-color:rgba(0,0,0,0.5);padding: 15px;margin-left:400px;margin-bottom: 30px;\n" +
"   }\n" +
"        </style>\n" +
"    </head>\n" +
"    <body>\n" +
"        \n" +
"        <div class=\"clip\">\n" +
"      <video preload=\"auto\" autoplay=\"autoplay\" src=\"victoria_memorialtrim.mp4\" loop></video> \n" +
"      \n" +
"       </div>\n" +
"        <ul class=\"wer\">\n" +
"            <li><i class=\"fas fa-sign-in-alt\"></i><a href =\"loginpage.html\">LOGIN</a></li> \n" +
"       <li><i class=\"fas fa-calendar-check\"></i><a href =\"booking.html\">BOOKING</a></li> \n" +
"        <li><i class=\"fas fa-cog\"></i><a href =\"services.html\">SERVICES</a></li>\n" +
"       <li><i class=\"fas fa-home\"></i><a href =\"homepage.html\">HOME</a></li>\n" +
"        </ul>  \n" +
"        <h1>ADMIN HOME</h1>\n" +
"        <form method=\"post\" action=\"agency_pending.html\"> \n" +
"        <div class=\"adminhome\">\n" +
"            <h2><a class=\"admin\" href=\"agency_pending?id\">Pending Travel Agency Request</a></h2>\n" +
"            <h2><a class=\"admin\" href=\"view_details?id\">View Agency Details</a></h2>\n" +
"           <h2><a class=\"admin\" href=\"admin_profile.html\">View Your Profile</a></h2>\n" +
"           <h2><a class=\"admin\" href=\"update_travel.html\">Update Agency Details</a></h2>\n" +
"        </div>\n" +
"\n" +
"        <ul>\n" +
"           <li><i class=\"fas fa-sign-out-alt\"></i>Logout</li>\n" +
"            <li><i class=\"fas fa-info-circle\"></i><a href=\"aboutus.html\">ABOUT US</a></li>\n" +
"            <li><i class=\"fas fa-envelope\"></i><a href=\"contact.html\">CONTACT US</a></li>\n" +
"        </ul>   \n" +
"    </body>\n" +
"</html>");*/
}
else
{
pw.println("adminlogin.html");
}
}
}


