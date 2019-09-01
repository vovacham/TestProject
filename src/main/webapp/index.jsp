<%--
  Created by IntelliJ IDEA.
  User: Владимир
  Date: 26.08.2019
  Time: 9:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Сортировка массива</title>
    <link rel="stylesheet" href="styles/w3.css">
</head>


<body>
<div class="w3-container w3-center">
    <h2>Сортировка массива</h2>
</div>
<form method="post" class="w3-selection w3-light-grey w3-padding">
    <h2>Введите элементы массива через пробел</h2>
    <label>
        <input type="text" name="mass" class="w3-input w3-animate-input w3-border w3-round-large"
               style="width: 30%"><br/>
    </label>
    <button type="submit" name="action" value="sort" class="w3-btn w3-green w3-round-large w3-margin-bottom">
        Сортировка
    </button>
    <button type="submit" name="action" value="random" class="w3-btn w3-green w3-round-large w3-margin-bottom">Случайный
        массив
    </button>
</form>


<%
    if (request.getAttribute("sortArray") != null) {
        out.print("<div class=\"w3-container\" <p><font size=4>" + request.getAttribute("message") + "</font></p>\n" + "</div>");
        out.print("<div class=\"w3-container\"> <h4>" + request.getAttribute("sortArray") + "</h4>\n" + "</div>");
    }
%>

</body>
</html>
