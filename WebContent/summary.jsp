<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*" import="data.*" import="database.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Summary</title>
</head>
<body>
<%
//ArrayList<Quote> quotes = Database.getQuotes();
String json = "{ ‘4/2018’: { quotes_finished: 3, price: { average: 51, max: 54, min: 45, }, quote_time: { average: 2083 } }}";
%>
</body>
<%= json %>
</html>