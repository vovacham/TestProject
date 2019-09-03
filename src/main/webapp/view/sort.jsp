<%--
  Created by IntelliJ IDEA.
  User: Владимир
  Date: 03.09.2019
  Time: 13:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>



<%
    if (request.getAttribute("sortArray") != null) {

        out.print("<div class=\"w3-container\" <p><font size=4>" + request.getAttribute("message") + "</font></p>\n" + "</div>");
        out.print("<div class=\"w3-container\" <p><font size=4>" + request.getAttribute("sortArray") + "</font></p>\n" + "</div>");

    }

%>

<div class="w3-container w3-grey w3-opacity w3-right-align w3-padding">
    <button class="w3-btn w3-round-large" onclick="window.location.href='index.jsp'">На главную</button>
</div>

</body>
</html>
