<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	App 1  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<p>List of customers:</p>
<ul>
<c:forEach items="${customers}" var="customer">
	<li><c:out value="${customer.name}"></c:out></li>
</c:forEach>
</ul>
</body>
</html>
