<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP Message</title>
</head>
<body>
<h1>Hey!! You poked me!</h1>

  <p>FYI: I am in webapp - web-inf - jsp</p>
  
  <p> I got this server-message for you:<br/>
  <b>${greeting}</b><br/>
  but wrapped in a .jsp file.  
 </p>
  
  <br/>  <br/>  <br/>
  <h4>If you prefer to talk to Thymeleaf...    <a href="/springmvc/thymeleaf/start">this is the way</a></h4>
  
</body>
</html>