<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<link rel='stylesheet' href='Style.css'>
	<title>Flight Booking System</title>
</head>
<body>
	<h1>Welcome to the Flight Booking System!</h1>
	<p>Please select an option from the menu:</p>
	<ul>
		<li><a href="<s:url action='flightSearch'/>">Search for Flights</a></li>
		<li><a href="<s:url action='flightBooking'/>">Book a Flight</a></li>
		<li><a href="<s:url action='flightStatus'/>">Check Flight Status</a></li>
	</ul>
</body>
</html>