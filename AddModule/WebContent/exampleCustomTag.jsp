<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/WEB-INF/myTag" prefix="t" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CustomTag</title>
</head>
<style>
.inColumn{
	border: 1px solid black;
	margin:2px;
}
.inRow{
	margin-top:20px;	
	position:absolute;
	border: 1px solid black;
	display:flex;
	flex-direction:row;
}
</style>
<body>
	<h3>this is example of custom tag: myTag</h3>
	<t:myTag></t:myTag>
	<h1>this is my second tag</h1>
	<t:printTable number="10" color="orange"></t:printTable>
	<t:printTable number="15" color="white"></t:printTable>
	<t:printTable number="20" color="green"></t:printTable>	
</body>
</html>