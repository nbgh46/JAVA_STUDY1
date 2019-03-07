package OOP1_STUDY;
/*
  생성자를 이용한 인스턴스의 복사
  -현재 사용하고 있는 인스턴스와 같은 상태를 갖는 인스턴스를 만들고자 할떄 사용
  -생성자의 매개변수로 참조변수를 사용한다.
  -서로 독립적인 별도의 메모리공간에 존재하는 인스턴스이므로 c1의 값을 변경해도 c2에 영향을 끼치지 않는다.
  
  
  **인스턴스를 생성할떄는 2가지 사항을 결정해야한다.
  		1.클래스- 어떤 클래스의 인스턴스를 생성할 것인가?
  		2.생성자- 선택한 클래스의 어떤 생성자로 인스턴스를 생성할 것인가?
  
 */

class Car3{
	String color; //색상
	String gearType; // 변속기 종류 -auto , manual
	int door; //문의 개수

	Car3(){
		this("white","auto",4);
	}

	//인스턴스 복사를 위한 생성자
	Car3(Car3 c){
		color = c.color;
		gearType=c.gearType;
		door=c.door;
	}
	

	Car3(String color){
	this(color,"auto",4);	
	}
	
	//car 클래스 생성자 정의
	Car3(String c, String g , int d){
		color = c;
		gearType=g;
		door = d;
	}







}
public class CarTest3 {
 public static void main(String[] args)	{
	 
	Car3 c1 = new Car3();
		
		
		//생성자를 이용한 초기화
		Car3 c2 = new Car3(c1);   //c1의 복사본 c2를 생성한다.
		
		System.out.println("c1의 color: "+c1.color+" c1의 gearType:"+c1.gearType+" c1의 door:"+c1.door);
		System.out.println("c2의 color: "+c2.color+" c2의 gearType:"+c2.gearType+" c2의 door:"+c2.door);
	}

	 
	 
	 
	 
 }

