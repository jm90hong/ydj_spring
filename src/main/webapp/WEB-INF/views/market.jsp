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


<link href="
https://cdn.jsdelivr.net/npm/noto-sans-kr@0.1.1/styles.min.css
" rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" 
rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" 
crossorigin="anonymous">


<link rel="stylesheet" href="./css/index.css"/>



</head>





<body>
	
	
	<div style="padding:16px;width:800px;background: #f2f2f2;margin:0 auto;">
		
		<section>
			<h6 style="font-weight:700;">회원 관리</h6>
			<div style="display:flex;align-items: center;">
				<input id="name" placeholder="이름"/>
				<input id="point" type="number" placeholder="포인트"/>
				<button id="save-user-btn" type="button" class="btn btn-primary btn-sm">회원등록</button>
			</div>
			<table class="table">
			  <thead>
			    <tr>
			      <th scope="col">고유코드</th>
			      <th scope="col">이름</th>
			      <th scope="col">포인트</th>
			      <th scope="col">등록날짜</th>
			      <th scope="col">삭제</th>
			    </tr>
			  </thead>
			  <tbody id="user-tbody">
			    
			  </tbody>
			</table>
			
			
		</section>
		
		<section>
			<h6 style="font-weight:700;">상품 관리</h6>
			<div style="display:flex;align-items: center;">
				<input id="item-name" placeholder="상품명"/>
				
				<select class="slt-user">
					
				</select>
				
				<input id="item-price" type="number" placeholder="가격"/>
				<input id="item-count" type="number" placeholder="수량"/>
				<button id="save-item-btn" type="button" class="btn btn-success btn-sm">상품등록</button>
			</div>
			<table class="table">
			  <thead>
			    <tr>
			      <th scope="col">상품IDX</th>
			      <th scope="col">상품명</th>
			      <th scope="col">판매자</th>
			      <th scope="col">가격</th>
			      <th scope="col">수량</th>
			      <th scope="col">등록날짜</th>
			      <th scope="col">삭제</th>
			    </tr>
			  </thead>
			  <tbody id="item-tbody">
			    
			  </tbody>
			</table>
			
			
		</section>
		
	</div>
	
</body>



<script src="./js/market.js"></script>

</html>

