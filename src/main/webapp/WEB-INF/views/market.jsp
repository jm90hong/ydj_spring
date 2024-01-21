<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.7.1.min.js" 
integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" 
crossorigin="anonymous"></script>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" 
rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" 
crossorigin="anonymous">


<link rel="stylesheet" href="./css/index.css"/>



</head>





<body>
	
	
	<div style="padding:16px;width:800px;height:100vh;background: #f2f2f2;margin:0 auto;">
		
		<section>
			<h6 style="font-weight:700;">회원 관리</h6>
			<div style="display:flex;align-items: center;">
				<input id="name" placeholder="이름"/>
				<input id="point" type="number" placeholder="포인트"/>
				<button id="save-user-btn" type="button" class="btn btn-primary btn-sm">회원등록</button>
			</div>
		</section>
		
	</div>
	
</body>



<script src="./js/market.js"></script>

</html>

