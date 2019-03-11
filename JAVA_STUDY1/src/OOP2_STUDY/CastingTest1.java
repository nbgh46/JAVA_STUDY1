package OOP2_STUDY;
/*
 	다형성
 	-여러가지 형태를 가질 수 있는 능력
 	-조상클래스 타입의 참조변수로 자손클래스의 인스턴스를 참조할수있다
 	-같은 타입의 인스턴스지만 참조변수의 타입에 따라 사용할수 있는 멤버의 개수가 달라진다.
 	-조상 타입의 참조변수로 자손타입의 인스턴스를 참조할 수 있다
 	-반대로 자손타입의 참조변수로 조상 타입의 인스턴스를 참조할 수는 없다
 	
 	참조변수 간의 형변환
 	자손타입 -1> 조상타입(up-casting): 형변환 생략가능
 	자손타입 <- 조상타입(down-casting): 형변환 생략불가
 
 	-형변환은 참조변수의 타입을 변환하는 것이지 인스턴스를 변환하는 것은 아니기 떼문에 참조변수의 형변환은 인스턴스에 아무런 영향을 미치지않는다.
 	-참조하고 있는 인스턴스에서 사용할 수 있는 멤버의 범위(개수)를 조절하는것이다.
 	
 	-서로 상속관계에 있는 타입간 형변환은 양뱡향으로 자유롭게 수행될 수 있으나,참조변수가 가리키는 인스턴스의 자손타입으로 형변환은 허용되지않는다.
 	그래서 참조변수가 가리키는 인스턴스의 타입이 무엇인지 확인하는 것이 중요하다.
 */


public class CastingTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* castingtest1
		 
	
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 =null;
		
		fe.water();
		car = fe; //car= (car)fe; 에서 형변환이 생략된 형태이다.
		fe2 = (FireEngine)car; //자손타입 <- 조상타입
		fe2.water();
			 */
		
		//castingtest2
		Car car = new Car();
		Car car2 = null;
		FireEngine fe =null;
		
		car.drive();
		fe = (FireEngine)car; //컴파일은 ok 실행시 오류발생한다.
		fe.drive();
		car2=fe;
		car2.drive();
		
	}

}

private class  Car{
	String color;
	int door;
	void drive() {
		System.out.println("drive, Brrrr~");
	}

	void stop() {
		System.out.println("stop!!!");
	}
	 
}

private class FireEngine extends Car{
	void water() {
		System.out.println("water!!!");
		
	}
}
 
 
 
 
 
 
 
 
 
 
 