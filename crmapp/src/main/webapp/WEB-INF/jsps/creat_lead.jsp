<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create</title>
</head>
<body>
<h2>Create | Lead</h2>
<form action="saveLead" method ="post">
<pre>
first Name <input type ="text" name="firstName">
last Name <input type ="text" name="lastName">
email <input type ="email" name="email">
mobile <input type ="number" name="mobile">

<select name="source" >
  <option value="newspaper">News paper</option>
  <option value="tv comercial">TV Commercial</option>
  <option value="online">Online</option>
  <option value="seminar">Seminar</option>
</select>
<input type="submit" value ="save">
</pre>

</form>

</body>
</html>