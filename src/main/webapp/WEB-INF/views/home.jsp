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
	
	
	
	${nick}
	${tel}
	
	
	
	<h4>아이디 클래스</h4>
	
	<div id="one-box"></div>
	<div class="my-box a b c" style=""></div>
	<div class="round my-box onclick" style="back"></div>
	<div class="my-box onclick"></div>
	<div class="my-box onclick"></div>
	<div class="my-box onclick"></div>
	
	



	<h4 style="margin-top:60px;">jQuery</h4>
	
	<input id="inp"/>
	<h1 id="title">hello</h1>
	<button id="btn">Go!</button>
	
	
	<!-- Table -->
	
	<h2 style="margin-top:30px;">Our Members!</h2>
	<input id="name" placeholder="name"/>
	<input id="age" type="number" placeholder="age"/>
	<input id="address" placeholder="address"/>
	<button id="save-btn" type="button" class="btn btn-primary">Save</button>
	
	<table class="table">
	  <thead>
	    <tr>
	      <th scope="col">#</th>
	      <th scope="col">Name</th>
	      <th scope="col">Age</th>
	      <th scope="col">Address</th>
	    </tr>
	  </thead>
	  <tbody>
	    <tr>
	      <th scope="row">1</th>
	      <td>Mark</td>
	      <td>25</td>
	      <td>Seoul</td>
	    </tr>
	  </tbody>
	</table>
	
	
</body>



<script src="./js/home.js">
</script>

</html>

