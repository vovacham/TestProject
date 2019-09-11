<%@ page import="model.TabEntity" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Результат сортировки</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/w3.css">
</head>
<body>


<form class="w3-selection w3-light-grey w3-padding">
    <h2>Результат сортировки</h2>
    <%
        if (request.getAttribute("TabEntity") != null) {
            TabEntity tabEntity = (TabEntity) request.getAttribute("TabEntity");

            if (tabEntity.getMesType().equals("random")) {
                out.print("<div class=\"w3-container\" <p><font size=4>" + "Случайный массив: " + tabEntity.getMes1() + "</font></p>\n" + "</div>");
                out.print("<div class=\"w3-container\" <p><font size=4>" + "Отсортированный массив: " + tabEntity.getMes2() + "</font></p>\n" + "</div>");
            }

            if (tabEntity.getMesType().equals("sort")) {
                out.print("<div class=\"w3-container\" <p><font size=4>" + "Массив: " + tabEntity.getMes1() + "</font></p>\n" + "</div>");
                out.print("<div class=\"w3-container\" <p><font size=4>" + "Отсортированный массив: " + tabEntity.getMes2() + "</font></p>\n" + "</div>");
            }
        }
    %>
</form>

<div>
    <button class="w3-btn w3-green w3-round-large w3-margin-bottom" onclick="window.location.href='index.jsp'">На
        главную
    </button>
</div>

</body>
</html>
