<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="homepage.css">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.10/css/all.css" integrity="sha384-+d0P83n9kaQMCwj8F4RJB66tzIwOKmrdb46+porD/OvrJ+37WqIM7UoBtwHO6Nlg" crossorigin="anonymous">
        <style>
            h1{text-align: center;color: whitesmoke;}
    body{margin: 0px;background-image: url("victoria_memorial_by_sagnikarmakar.jpg");}
        h2{color:whitesmoke;text-align: center;} 
       .inner{margin: 80px;background-image: url("victoria_memorial_by_sagnikarmakar-d4mxhgk.jpg");
             height:auto;}
        p{text-align:right;font-weight: bold;color: whitesmoke;margin-right: 50px;} 
        table{width:100%; text-align: center;}
       input{border-radius: 5px; padding: 10px;}
  .home-content{
    height: 30px;
    width: 300px;
    background-color:rgba(0,0,0,0.3); 
    text-align: center;	
    text-decoration: none;
    display: inline-block;
    padding-top: 10px;padding-left: 30px;padding-bottom: 30px;padding-right: 30px;letter-spacing: 3px;
    margin: 10px;font-size: 22px;color:white;border-radius: 20px;border: 1px solid  white;line-height:1.3;
    transition: 1s;
}
        </style>
</head>
<body>
    <%
		if (session != null) {
			if (session.getAttribute("admin") != null) {
				String name = (String) session.getAttribute("admin");
				out.print("Hello, " + name + "  Welcome to ur Profile");
			} else {
				response.sendRedirect("adminlogin.html");
			}
		}
	%>
        
        
        
        
    <div class="inner"> 
        <div class="logo">
            <table>
            <tr><td><div class="top-img"><img src="WhatsApp Image 2018-05-09 at 1.33.51 PM.jpeg"></div><td>
            <td>KOLKATA CITY TOUR</td>  
            <td width="30%">
            <p><font size="3"><i class="fas fa-phone"></i>CALL US:</font>
             9038640962</p>
            <p><font size="3"><i class="fas fa-at"></i>MAIL US:</font>
             tayyab.ali03@gmail.com</p>
             </td></tr>
            </table>
            <ul>
           
     <li><form action="signout" method="post"><input type="submit" value="Logout"></form></li>
       <li><i class="fas fa-calendar-check"></i><a href ="booking.html">BOOKING</a></li> 
        <li><i class="fas fa-cog"></i><a href ="services.html">SERVICES</a></li>
       <li><i class="fas fa-home"></i><a href ="homepage.html">HOME</a></li>
      </ul> 
           </div>
        <h1>ADMIN HOME</h1>
        <form method="post" action="agency_pending.html"> 
        <div class="content">
            <center><table>
                    <tr>
            <td> <h2><a class="home-content" href="agency_pending?id">Pending Travel Agency Request</a></h2></td>
           <td>  <h2><a class="home-content" href="view_details?id">View Agency Details</a></h2></td>
            </tr>
            <tr>
            <td> <h2><a class="home-content" href="update_travel.html">Update Agency Status</a></h2></td>
           <td> <h2><a class="home-content" href="agency_pending?id">Pending Traveller's Request</a></h2></td>
           </tr>
            </table></center>
        </div>

        <ul class="end">
           
            <li><i class="fas fa-info-circle"></i><a href="aboutus.html">ABOUT US</a></li>
            <li><i class="fas fa-envelope"></i><a href="contact.html">CONTACT US</a></li>
        </ul>  
</div>
	
		
	
</body>
</html>