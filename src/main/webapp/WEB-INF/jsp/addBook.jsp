<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>

    <link rel="stylesheet" type="text/css"
          href="webjars/bootstrap/3.3.7/css/bootstrap.min.css"/>

    <!--
	<spring:url value="/css/main.css" var="springCss" />
	<link href="${springCss}" rel="stylesheet" />
	 -->
    <c:url value="/css/main.css" var="jstlCss"/>
    <link href="${jstlCss}" rel="stylesheet"/>

</head>
<body>

<h1>Customer list</h1>

<div class="container">

    <form action="/book/add" method="post" enctype="application/json">
        <p>Title</p><input type="text" name="title" class="input-lg">
        <p>Author</p><input type="text" name="author" class="input-lg">
        <p>Category</p><input type="text" name="category" class="input-lg">
        <p>ISBN</p<><input type="text" name="isbn" class="input-lg">

        </br>
        <input type="submit" value="Add" class="btn">
    </form>
</div>
<!-- /.container -->

<script type="text/javascript"
        src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</body>

</html>
