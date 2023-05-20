<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Airlines</title>
</head>
<body>
<h1>Airlines</h1>
<table>
    <tr>
        <th>Airline Code</th>
        <th>Airline Name</th>
        <th>Country Code 3</th>
    </tr>
    <s:iterator value="airlines">
        <tr>
            <td><s:property value="airlineCode" /></td>
            <td><s:property value="airlineName" /></td>
            <td><s:property value="countryCode3" /></td>
        </tr>
    </s:iterator>
</table>
</body>
</html>
