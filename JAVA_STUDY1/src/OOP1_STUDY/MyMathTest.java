package OOP1_STUDY;
//클래스 메서드(static) 와 인스턴트 메서드

class mymath2{
	long a,b;
	
	//인스턴스 변수 a,b 만을 이용해서 작업하므로 매개변수가 필요없다.
	long add() {return a+b;}; //a,b는 인스턴트 변수
	long subtract() {return a-b;}; 
	long multiply() {return a*b;}; 
	long divide() {return a/b;}; 

	//인스턴스변수와 관계없이 매개변수만으로 작업이 가능하다.
	static long add(long a , long b) {return a+b;};
	static long subtract(long a , long b) {return a-b;};
	static long multiply(long a , long b) {return a*b;};
	static long divide(long a , long b) {return a/b;};

}

public class MyMathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//클래스 메서드 호출, 인스턴스 없이 호출 가능
		System.out.println(mymath2.add(200L, 100L));
		System.out.println(mymath2.subtract(300, 200));
		System.out.println(mymath2.multiply(10, 20));
		System.out.println(mymath2.divide(50, 10));
		
		
		//인스턴스 생성
		mymath2 mm = new mymath2();
		mm.a=100;
		mm.b=200;
		//인스턴스 메서드는 객체 생성후에만 호출이 가능하다.
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
		
		
		
		
		
		
	}

}
