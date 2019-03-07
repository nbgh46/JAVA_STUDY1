package OOP1_STUDY;
//매개변수가 있는 생성자



//car 클래스 정의
class Car{
	String color; //색상
	String gearType; // 변속기 종류 -auto , manual
	int door; //문의 개수
	
	//car 클래스 기본 생성자 정의
	Car(){}
	
	//car 클래스 생성자 정의
	Car(String c, String g , int d){
		color = c;
		gearType=g;
		door = d;
	}

}


public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//기본 생성자로 인스턴스 생성및 초기화
		Car c1 = new Car();
		c1.color="white";
		c1.gearType="auto";
		c1.door=4;
		
		//생성자를 이용한 초기화
		Car c2 = new Car("blue", "manual", 2);
		
		System.out.println("c1의 color: "+c1.color+" c1의 gearType:"+c1.gearType+" c1의 door:"+c1.door);
		System.out.println("c2의 color: "+c2.color+" c2의 gearType:"+c2.gearType+" c2의 door:"+c2.door);
	}

}
