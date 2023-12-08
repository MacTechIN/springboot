<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>hello page</title>
</head>
<body>
	<h1>Hello Image Page</h1>
	<p>filename: ${imagefile}</p>
	<img width=400 height=200 src="images/${imagefile}" />
</body>
</html>