package OOP1_STUDY;
//Ŭ���� �޼���(static) �� �ν���Ʈ �޼���

class mymath2{
	long a,b;
	
	//�ν��Ͻ� ���� a,b ���� �̿��ؼ� �۾��ϹǷ� �Ű������� �ʿ����.
	long add() {return a+b;}; //a,b�� �ν���Ʈ ����
	long subtract() {return a-b;}; 
	long multiply() {return a*b;}; 
	long divide() {return a/b;}; 

	//�ν��Ͻ������� ������� �Ű����������� �۾��� �����ϴ�.
	static long add(long a , long b) {return a+b;};
	static long subtract(long a , long b) {return a-b;};
	static long multiply(long a , long b) {return a*b;};
	static long divide(long a , long b) {return a/b;};

}

public class MyMathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ŭ���� �޼��� ȣ��, �ν��Ͻ� ���� ȣ�� ����
		System.out.println(mymath2.add(200L, 100L));
		System.out.println(mymath2.subtract(300, 200));
		System.out.println(mymath2.multiply(10, 20));
		System.out.println(mymath2.divide(50, 10));
		
		
		//�ν��Ͻ� ����
		mymath2 mm = new mymath2();
		mm.a=100;
		mm.b=200;
		//�ν��Ͻ� �޼���� ��ü �����Ŀ��� ȣ���� �����ϴ�.
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
		
		
		
		
		
		
	}

}
