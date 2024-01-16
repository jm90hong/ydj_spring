<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TODO 상세보기</title>
<script src="https://code.jquery.com/jquery-3.7.1.min.js" 
integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" 
crossorigin="anonymous"></script>



<link rel="stylesheet" href="./css/index.css"/>
</head>
<body>
	<main>
		<input type="hidden" id="todo-id" value="${id}"/>
		<h2 id="title">loading...</h2>
		<h4>유저 아이디 : ${id}</h4>
		<h4 id="comp"></h4>
	</main>
</body>

<script src="./js/todo-detail.js"></script>

</html>



