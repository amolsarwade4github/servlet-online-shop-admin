<%--
  Created by IntelliJ IDEA.
  User: Amol.Sarwade
  Date: 29-05-2021
  Time: 17:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Product</title>
    <link rel="stylesheet" href="/admin/assets/css/main.css"/>
</head>
<body>
  <form action="/admin/product-add" method="POST">
      <label for="title">Title</label>
      <input type="text" id="title" name="title" />
      <label for="sku">Sku</label>
      <input type="text" id="sku" name="sku" />
      <label for="price">Price</label>
      <input type="text" id="price" name="price" />
      <label for="quantity">Quantity</label>
      <input type="text" id="quantity" name="quantity" />
      <input type="submit" value="Save">
  </form>
</body>
</html>
