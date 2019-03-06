package OOP1_STUDY;
/* 오버로딩 예제
  오버로딩이란
  - 한 클래스 내에 같은 이름을 가진 메서드를 여러개 정의하는것을 메서드 오버로딩 이라한다.
  
  오버로딩의 조건
  -메서드의 이름이 같아야한다.
  -매개변수의 개수 또는 타입이 같아야한다. 변수명은 달라도 안됨
  
 */



public class OverLoadeingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mymath3 mm = new Mymath3();
		System.out.println("mm.add(3,3) 결과 :" + mm.add(3,3));
		System.out.println("mm.add(3L,3) 결과 :" + mm.add(3L,3));
		System.out.println("mm.add(3,3L) 결과 :" + mm.add(3,3L));
		System.out.println("mm.add(3L,3L) 결과 :" + mm.add(3L,3L));
		
		int[] a = { 100,200,5};
		System.out.println("mm.add(a) 결과 :" + mm.add(a));
		
		
	}
}





class Mymath3{
	//메서드 오버로딩
	int add(int a , int b) {
		
		System.out.print("int add(int a , int b) - ");
		return a+b;
	}
	
	long add(int a , long b) {
		System.out.print("long add(int a , long b) - ");
		return a+b;
	}
	
	long add(long a , int b) {
		System.out.print("long add(long a , int b) - ");
		return a+b;
	}
	long add(long a , long b) {
		
		System.out.print("int add(int a , int b) - ");
		return a+b;
	}
	int add(int[] a) { //배열의 모든 요소의 합을 보여준다.
		
		System.out.print("int add(int[] a) - ");
		int result = 0;
		for(int i=0;i<a.length;i++)
			result += a[i];
			return result;
	}
}