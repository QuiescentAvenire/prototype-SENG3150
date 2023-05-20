<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>FlightPub</title>
</head>

<body>
<h1>Hello, welcome to FlightPub</h1>

<s:form action="airlines" method="post">
    <s:submit value="View Airlines"/>
</s:form>

</body>
</html>