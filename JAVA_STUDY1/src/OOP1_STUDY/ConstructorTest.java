package OOP1_STUDY;
/*
 	생성자
 	-인스턴스 초기화 메서드
 	-생성자의 이름은 클래스의 이름과 같아야한다.
 	-생성자는 리턴값이 없다.
 	
 	기본생성자
 	-컴파일러에서 자동적으로 생성해주는 생성자
 	-매개변수도 없고 아무런 내용이 없다.
 	
 */
public class ConstructorTest {

	//클래스 1 생성
	class Data1{
		int value;
	}
	//클래스 2 생성
	class Data2{
		int value;
		//생성자 생성
		Data2(int x){ //매개변수가 있는 생성자
			value =x;
			
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data1 d1 = new Data1();
		//Data2 d2 = new Data2(); //컴파일 에러 발생
		/* 컴파일 에러가 발생하는 이유는 기본 생성자가 없기 떄문이다.
		    기본생성자가 컴파일러에 의해 생성되는 경우는 클래스에 정의된 생성자가 하나도없을떄 뿐이다.
		 */
	}

}
