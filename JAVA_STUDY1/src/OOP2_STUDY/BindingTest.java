package OOP2_STUDY;
/*
 참조변수와 인스턴스 연결
 -조상 클래스에서 선언된 멤버변수와 같은 이름의 인스턴스 변수를 자손 클래스에 중복으로 정의했을떄 조상타입의 참조변수로 자손 인스턴스를 참조하는ㄴ 경우와 자손타입의 
 참조변수로 자손 인스턴스를 참조하는 경우는 서로 다른결과를 얻는다.
 -멤버변수의 경우 참조타입에 따라 달라진다.
 -멤버ev  ddev evdevfv vv  v vcc vc vyuuu변수가 조상클래스와 자손클래스로 중복 정의된 경우 조상타입의 참조변수를 사용했을 떄는 조상클래스에 선언된 멤버변수가 사용되고
 자손타입의 참조변수가 사용됬을 경우에는 자손클래스에서 사용된 멤버 변수가 사용된다.
 
 */
public class BindingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		parent2 p = new child2();
		child2 c = new child2();
		
		System.out.println("p.x: "+p.x);
		p.method();
		System.out.println();
		System.out.println("c.x: "+c.x);
		c.method();
	}

}

class parent2{
	int x=100;
	void method() {
		System.out.println("Parent Method");
	}
}

class child2 extends parent2{
	/* bindingTest1
	int x=200;
	void method() {
		System.out.println("child method");
}*/
	//bindingTest3
	int x=200;
	void method() {
		System.out.println("x="+x);
		System.out.println("super.x="+super.x);
		System.out.println("this.x="+this.x);
	}
	
	
}