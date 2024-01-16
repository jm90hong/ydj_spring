<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>REST API</title>
<script src="https://code.jquery.com/jquery-3.7.1.min.js" 
integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" 
crossorigin="anonymous"></script>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" 
rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" 
crossorigin="anonymous">


<link rel="stylesheet" href="./css/index.css"/>



</head>





<body>
	
	
	<h4>REST API</h4>
	
	<input id="todo-num" placeholder="todo number(1~200)"/>
	<button id="get-one-btn">get one todo</button>
	<div>result</div>
	
	
	
	<div id="todo-title"></div>
	<div id="todo-id"></div>
	<div id="todo-userid"></div>
	<div id="todo-complete"></div>
	
	
</body>



<script src="./js/my-rest-api.js"></script>



</html>

