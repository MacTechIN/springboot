<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>hello page</title>
	<script type="text/javascript" src="js/helloscript.js"></script>
</head>
<body>
	<h1>Hello Image Page</h1>
	<p>filename: ${imagefile}</p>
	<button onClick="clickButton()">클릭</button>
	<img width=400 height=200 src="images/${imagefile}" />
</body>
</html>