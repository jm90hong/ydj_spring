

$(document).ready(function(){
	
	
	
	
	var thisTodoId = $('#todo-id').val();
	
	
	$.ajax({
		url:'https://jsonplaceholder.typicode.com/todos/'+thisTodoId,
		type:'get',  //get, post
		data:{},
		success:function(response){
			$('#title').html(response.title);
			$('#comp').html(response.completed.toString());
		},
		error:function(error){
			
		}
	});
	
	
	
});

