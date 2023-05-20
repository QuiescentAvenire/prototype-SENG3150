<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
    <head>
        <title>FlightPub</title>
    </head>

    <body>
        <h1>Hello, welcome to FlightPub</h1>


        <s:form action="airlines" method="post">
            <s:textfield label="Country Code 3" name="countryCode3"/>
            <br/>
            <s:submit value="Submit"/>
        </s:form>


    </body>
</html>