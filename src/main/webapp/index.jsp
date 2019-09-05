<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Сортировка массива</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/w3.css" type="text/css">
</head>


<body>
<form action="${pageContext.request.contextPath}/Sort" method="post" class="w3-selection w3-light-grey w3-padding">
    <h2>Введите элементы массива через пробел</h2>
    <input type="text" name="mass" class="w3-input w3-animate-input w3-border w3-round-large"
           style="width: 30%"><br/>
    <button type="submit" name="action" value="sort" class="w3-btn w3-green w3-round-large w3-margin-bottom">Сортировка
    </button>
    <button type="submit" name="action" value="random" class="w3-btn w3-green w3-round-large w3-margin-bottom">Случайный
        массив
    </button>
</form>

</body>
</html>