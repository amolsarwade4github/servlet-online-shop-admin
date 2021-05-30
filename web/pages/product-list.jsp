<%--
  Created by IntelliJ IDEA.
  User: Amol.Sarwade
  Date: 29-05-2021
  Time: 20:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Products</title>
    <link rel="stylesheet" href="/admin/assets/css/main.css"/>
    <link rel="stylesheet" href="/admin/assets/css/shared.css"/>
    <link rel="stylesheet" href="/admin/assets/css/product-list.css"/>
</head>
<body>
    <main class="product-list-page">
        <h1 class="product-list-title">
            Products
        </h1>
        <c:if test="${productAdded}">
            <div class="product-add-success">Product added successfully!!</div>
        </c:if>
        <table class="product-list-table">
            <c:forEach items="${products}" var="product">
                <tr>
                    <td>${product.id}</td>
                    <td>${product.title}</td>
                    <td>${product.sku}</td>
                    <td>${product.price}</td>
                    <td>${product.quantity}</td>
                </tr>
            </c:forEach>
        </table>
    </main>
</body>
</html>
