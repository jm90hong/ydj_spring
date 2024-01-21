

$(document).ready(function(){
	
	
	$('#save-user-btn').on('click',function(){
		
		
		var name = $('#name').val();
		var point = $('#point').val();
		
		
		
		if(name.length==0){
			alert('이름을 입력하세요');
			return;
		}
		
		
		if(point==0){
			alert('포인트를 입력하세요');
			return;
		}
		
		
		$.ajax({
				url:'http://3.36.28.140:8080/ydj_spring/user/save',
				type:'post',
				data:{
					'name':name,
					'point':point
				},
				success:function(response){
					alert(response);
				},
				error:function(error){}
			});
	});
	
	
	
	
	
});



