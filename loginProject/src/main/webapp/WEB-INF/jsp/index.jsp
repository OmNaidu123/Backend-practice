<%@page language="java" %>
<html>
<head>
    <title>login page</title>
</head>
<body>
<h3>LOGIN</h3>
<form action="login" method="post">
    <label for="user">Enter user name:</label>
    <br>
    <input type = "text" id ="user" name = "username">
    <br>
    <label for ="password">Enter password:</label>
    <br>
    <input type = "password" id = "password" name = "password">
    <br>
    <input type = "submit" value = "submit">
</form>
<h3>Don't have an account? create one</h3>
<form action="create" method="post">
    <label for="newuser">Enter user name:</label>
    <br>
    <input type = "text" id ="newuser" name = "username">
    <br>
    <label for ="newpassword">Enter password:</label>
    <br>
    <input type = "password" id = "newpassword" name = "password">
    <br>
    <input type = "submit" value = "submit">
</form>
</body>
</html>
