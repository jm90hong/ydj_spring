


$(document).ready(function(){
	
	
	
	$('#get-one-btn').on('click',function(){
		
		
		var number = $('#todo-num').val();
		
		
		$.ajax({
			url:'https://jsonplaceholder.typicode.com/todos/'+number,
			type:'get',  //get, post
			data:{},
			success:function(response){
				console.log(response);
				
				
				
				var htmlTag = '';
				
				if(response.completed){
					//완료			
					htmlTag='<div style="color:blue;">완료</div>';
			
				}else{
					//실패
					htmlTag='<div style="color:red;">미완료</div>';
				}
				
				$('#todo-title').html(response.title);
				$('#todo-id').html(response.id);
				$('#todo-userid').html(response.userId);
				$('#todo-complete').html(htmlTag);	
			},
			error:function(error){
				$('#todo-title').html('조회불가 (200이하 입력 필수)');
				$('#todo-id').html('조회불가');
				$('#todo-userid').html('조회불가');
				$('#todo-complete').html('조회불가');
				
			}
		});
		
		
	});
	
	
});