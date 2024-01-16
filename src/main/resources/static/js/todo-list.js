

$(document).ready(function(){
	
	fetchAllTodos();
	
	
	
	$(document).on('click','.todo-box',function(){
		
		var id = $(this).data('todo-id');
		location.href=`./todo-detail?todo_id=${id}`;
	});
	
	
});



function fetchAllTodos(){
	
	$.ajax({
		url:'https://jsonplaceholder.typicode.com/todos/',
		type:'get',
		data:{},
		success:function(jsonList){
			
			
		
			
			$.each(jsonList, function(index, todo){
				
				
				var compHtml='';
				
				if(todo.completed){
					compHtml = `<span class="c ok">완료</span>`;
				}else{
					compHtml = `<span class="c no">미완료</span>`;
				}
				
				
				
				$('#todo-list').append(`
					<nav class="todo-box" data-todo-id="${todo.id}">
						<div class="t">[${todo.id}] ${todo.title}</div>
						${compHtml}
					</nav>
				
				`);
				
				
			});
			
		},
		error:function(err){
			
		}
	});
}