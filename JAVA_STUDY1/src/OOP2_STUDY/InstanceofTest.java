package OOP2_STUDY;
/*
 instanceof������
 -���������� �����ϰ� �ִ� �ν��Ͻ��� ���� Ÿ���� �˾ƺ��� ���� instanceof�����ڸ� ����Ѵ�.
 -�Ÿ�Կ� ���� instanceof������ ����� true��� ���� �˻��� Ÿ������ ����ȯ�� �����ϴ� ���� ���Ѵ�.
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