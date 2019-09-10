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
        if (request.getAttribute("Object") != null) {
            String[] array = (String[]) request.getAttribute("Object");

            switch (array[0]) {
                case ("random"):
                    out.print("<div class=\"w3-container\" <p><font size=4>" + "Случайный массив: " + array[1] + "</font></p>\n" + "</div>");
                    out.print("<div class=\"w3-container\" <p><font size=4>" + "Отсортированный массив: " + array[2] + "</font></p>\n" + "</div>");
                    break;
                case ("sort"):
                    out.print("<div class=\"w3-container\" <p><font size=4>" + "Массив: " + array[1] + "</font></p>\n" + "</div>");
                    out.print("<div class=\"w3-container\" <p><font size=4>" + "Отсортированный массив: " + array[2] + "</font></p>\n" + "</div>");
                    break;
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
