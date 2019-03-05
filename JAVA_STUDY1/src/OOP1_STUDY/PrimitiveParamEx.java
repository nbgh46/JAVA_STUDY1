package OOP1_STUDY;
class Data {int x;}
public class PrimitiveParamEx {   //기본형 매개변수 예제

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Data d = new Data();
		d.x=10;
		System.out.println("main() : x ="+d.x);
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = "+d.x);
	}

	//change 매서드의 변수값만 바뀐것이기 떄문에 복사본만 바뀐것이므로 원본은 변하지않는다.
	
	static void change(int x) { //기본형 매개변수
		x=1000;
		System.out.println("change() : x ="+x);
	}
	
	
	
}

