package OOP2_STUDY;
/*
 오버라이딩
 -조상 클래스에서 상속받은 메서드의 내용을 변경 하는것 
 
오버라이딩의 조건
- 메서드의 내용만을 새로 작성하는 것이므로 메서드의 선언부는 조상의것과 일치해야한다.
- 이름이 같아야 한다.
- 메게변수가 같아야 한다.
-반환타입이 같아야 한다.

조상 클래스의 메서드를 자소 클래스에서 오버라이딩 할 뗴 
-접근 제어자는 조상 클래스의 메서드보다 좁은 범위로 변경 할 수 없다.
-조상 클래스의 메서드보다 많은 수의 예외를 선언할 수 없다.
-인스턴스메서드를 static메서드로 또는 그 반대로 변경할수 없다.

super
-자손 클래스에서 조상클래스로부터 상속받은 멤버를 참조하는데 사용되는 참조변수이다.
-조상 클래스로부터 상복받은 멤버도 자손 클래스 자신의 멤버이므로 super 대신 this를 사용할수있다.
-조상 클래스의 멤버와 자손클래스의 멤버가 중복 정의되어 서로 구분해야 할떄 사용한다.
 */



public class SuperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		child c = new child();
		c.method();
	}

}

class parent{
	int x =10; //super
	
}

class child extends parent{
	int x = 20; //this
	void method() {
		System.out.println("x="+x);
		System.out.println("this.x="+this.x);
		System.out.println("super.x="+super.x);
		
		
		
	}
}