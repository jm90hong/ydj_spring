


$(document).ready(function(){
	
	
	
	
	//멤버 추가 기능
	$('#save-btn').on('click',function(){
		
		var name = $('#name').val();
		var age = $('#age').val();
		var address = $('#address').val();
		
		
		
		if(name.length == 0){
			alert('이름을 적어주세요');
			return;
		}
		
		if(age == 0){
			alert('나이를 적어주세요');
			return;
		}
		
		if(address.length == 0){
			alert('주소를 적어주세요');
			return;
		}
		
		
		
		$('tbody').append(`
			<tr>
		      <th scope="row">1</th>
		      <td>${name}</td>
		      <td>${age}</td>
		      <td>${address}</td>
		    </tr>
		
		`);
		
		
		
	});
	
	
	
	
	//글자 바꾸기
	$('#btn').on('click',function(){
		
		//hello -> hello home
		var value = $('#inp').val();
		$('#title').html(value);
		$('#title').css('color','#fff');
		//$('body').css('background','blue');
	});
	
	
	
});




function init(){
	alert('준비');
}












//데이터 타입 변수
var a = 10;
var b= 'aa';




var name = '철수';
var name = 'a';  //재선언
name = 'b' //재정의


let age = 22;
age=30;   //재정의 (O), 재선언 (X)


const pi=3.14; //재정의 (X), 재선언 (X)

//배열
var team = ['철수','민지','대한'];
var one = team[1];


//오브젝트 /자바:맵, 파이썬:딕셔너리

var man = {
	'name':'김민수',
	'age':30,
	'asset':['스마트폰','노트북','볼펜']
};

var value = man['age']; //30
var value = man.name; //김민수
var have =  man['asset'][2]    //볼펜



//함수 선언
function add10_20(){
	var sum = 10+20;
}


//함수 호출
add10_20();

//함수 매개변수(인자)
function add(num1, num2){
	var sum = num1 + num2;
	
	return sum;
}




var result = add(5,20); //25


//조건문
if(result==25){
	
}else{
	
}


//반복문
var members = ['a','b','c','d'];

for(var i=0; i<members.length; i++){
	var one = members[i];  // 하나의  UI 만들고 container에 추가
}





























