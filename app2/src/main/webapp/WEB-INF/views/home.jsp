<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	App 2  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<p>List of customers:</p>
<ul>
<c:forEach items="${customers}" var="customer">
	<li><c:out value="${customer.name}"></c:out></li>
</c:forEach>
</ul>

<table>
<tr>
	<td colspan="2">Customer 1</td>
</tr>
<tr>
	<td>Name:</td><td><c:out value="${customer1.name }"/></td>
</tr>
<tr>
	<td>Constact person:</td><td><c:out value="${customer1.contactPerson.name }"/> <c:out value="${customer1.contactPerson.city }"/></td>
</tr>
</table>

</body>
</html>
