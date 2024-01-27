

$(document).ready(function(){
	
	initData();
	




	//상품 등록
	$('#save-item-btn').on('click',function(){
		
		var name = $('#item-name').val();
		var userIdx=$('.slt-user').val();
		var price = $('#item-price').val();
		var count = $('#item-count').val();
		
		
		
		console.log(name);
		console.log(userIdx);
		console.log(price);
		console.log(count);
		
		if(name.length==0){
			alert('상품명을 적어주세요.');
			return;
		}
		
		if(price==0){
			alert('가격을 적어주세요.');
			return;
		}
		
		if(count==0){
			alert('수량을 적어주세요.');
			return;
		}
		
		
		$.ajax({
			url:'http://3.36.28.140:8080/ydj_spring/item/save',
			type:'post',
			data:{
				name:name,
				user_idx:userIdx,
				price:price,
				count:count
			},
			success:function(json){
				if(json=='ok'){
					alert('상품등록 완료');
					location.reload();
				}
			},
			error:function(err){}
		});
		
		
		
		
		
	});







	//등록 버튼
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
					if(response=='ok'){
						alert(name+ '님 등록완료!');
						location.reload();
						
					}else if(response=='name'){
						alert('이미 가입된 이름이 존재합니다.')
					}
				},
				error:function(error){}
			});
	});
});





function initData(){
	
	
	
	//상품리스트 가져오기
	$.ajax({
		url:'http://3.36.28.140:8080/ydj_spring/item/all',
		tpye:'get',
		data:{},
		success:function(items){
			
			
			
			$.each(items,function(index, item){
				//회원리스트
				$('#item-tbody').append(`
					<tr>
				      <th scope="row">${item.item_idx}</th>
				      <td>${item.name}</td>
				      <td>${item.u_name}</td>
				      <td>${item.price} P</td>
				      <td>${item.count} 개</td>
				      <td>${item.created_date}</td>
				      <td>
				      	<button type="button" class="btn btn-danger btn-sm">삭제</button>
				      </td>
				    </tr>
				`);
			});
			
			
		},
		error:function(err){
			
		}
	})
	
	
	
	
	//회원리스트 가져오기
	$.ajax({
		url:'http://3.36.28.140:8080/ydj_spring/user/all',
		type:'get',
		data:{},
		success:function(users){
			
			$.each(users, function(index, user){
				
				//회원리스트
				$('#user-tbody').append(`
					<tr>
				      <th scope="row">${user.user_uuid}</th>
				      <td>${user.name}</td>
				      <td>${user.point}</td>
				      <td>${user.created_date}</td>
				      <td>
				      	<button type="button" class="btn btn-danger btn-sm">삭제</button>
				      </td>
				    </tr>
				`);
				
				//회원 select
				$('.slt-user').append(`<option value="${user.user_idx}" >${user.name}</option>`);
				
			});
			
		},
		error:function(err){}
	});
}














