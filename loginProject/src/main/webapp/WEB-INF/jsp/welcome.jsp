<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>User Page</title>
</head>
<body>
<b>Hello user ${verified.username}</b>
<br>
<br>
<form action="vidPOST" method="post">
    <label for="video">
        <h3>Want to insert a new video? Give URL of video</h3>
    </label>
    <input type="url" id="video" name="vidURL">
    <input type="hidden" name="username" value="${verified.username}">
    <input type="submit" value="Submit">
</form>
<br>
<br>
<h1>Video List</h1>
<ul>
    <c:forEach var="url" items="${videos.urls}">
        <li>
            <a href="${url}" target="_blank">${url}</a>
        </li>
    </c:forEach>
</ul>
</body>
</html>
