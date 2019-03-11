package OOP2_STUDY;
/*
 instanceof연산자
 -참조변수가 참조하고 있는 인스턴스의 실제 타입을 알아보기 위해 instanceof연산자를 사용한다.
 -어떤타입에 대해 instanceof연산의 결과가 true라는 것은 검사한 타입으로 형변환이 가능하단 것을 뜻한다.
 */
public class InstanceofTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		FireEngine2 fe = new FireEngine2();
		if(fe instanceof FireEngine2) {
			System.out.println("This is a FireEngine2 instance.");
		
			
		}
		
		if(fe instanceof Car2) {
			System.out.println("This is a Car instance");
		}

		if(fe instanceof Object) {
			System.out.println("This is an Object instance");
		}
		System.out.println(fe.getClass().getName());
	}

}


class Car2{}
class FireEngine2 extends Car2{}