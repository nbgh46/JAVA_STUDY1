package OOP1_STUDY;
/*
 	생성자에서 다른 생성자 호출하기
 	-생성자의 이름으로 클래스이름 대신 this를 사용한다.
 	-한 생성자에서 다른 생성자를 호출할 떄는 반드시 첫 줄에서만 호출이 가능하다.
 	-this 를 사용할수있는건 인스턴스 변수뿐이다 static 메서드에서는 사용할수없다.
 	
 	this- 인스턴스 자신을 가리키는 참조변수, 인스턴스의 주소가 저장되어 있다.
 		   모든 인스턴스메서드에 지역변수로 숨겨진 채로 존재한다.
 		   
 	this(), this(매개변수)- 생성자,같은 클래스의 다른 생성자를 호출할 떄 사용한다.
 	
 	this와 this()는 전혀 다른것이다. this는 참조변수이고 this()는 생성자이다.
 */



//car 클래스 정의
class Car2{
	String color; //색상
	String gearType; // 변속기 종류 -auto , manual
	int door; //문의 개수
	// 생성자에서 다른 생성자 호출하기
	
	Car2(){
		this("white","auto",4);
	}
	
	

	Car2(String color){
	this(color,"auto",4);	
	}
	
	//car 클래스 생성자 정의
	Car2(String c, String g , int d){
		color = c;
		gearType=g;
		door = d;
	}
}
public class CarTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 c1 = new Car2();
		
		
		//생성자를 이용한 초기화
		Car2 c2 = new Car2("blue");
		
		System.out.println("c1의 color: "+c1.color+" c1의 gearType:"+c1.gearType+" c1의 door:"+c1.door);
		System.out.println("c2의 color: "+c2.color+" c2의 gearType:"+c2.gearType+" c2의 door:"+c2.door);
	}

}
