<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!doctype html>
<html>
<style>
#i
{
font-size:200%;
height:900px;
top:900px;
background-color:pink;
}
</style>

  <body>
<div id="i">
<%-- <center><img src="<% request.getParameter("lol2"); %>" width="200" height="200"></img></center> --%>
<center><img src="https://img.clipartfox.com/3425382d155fa05fb8b41c72daf8a10c_tags-health-medical-doctor-medical-doctor-clipart_300-300.png" width="200" height="200"></img></center>

<br>
<br>
<br>

<%=request.getParameter("lol") %>

</div>


  </body>
</html>
