package OOP2_STUDY;
/*
 	������
 	-�������� ���¸� ���� �� �ִ� �ɷ�
 	-����Ŭ���� Ÿ���� ���������� �ڼ�Ŭ������ �ν��Ͻ��� �����Ҽ��ִ�
 	-���� Ÿ���� �ν��Ͻ����� ���������� Ÿ�Կ� ���� ����Ҽ� �ִ� ����� ������ �޶�����.
 	-���� Ÿ���� ���������� �ڼ�Ÿ���� �ν��Ͻ��� ������ �� �ִ�
 	-�ݴ�� �ڼ�Ÿ���� ���������� ���� Ÿ���� �ν��Ͻ��� ������ ���� ����
 	
 	�������� ���� ����ȯ
 	�ڼ�Ÿ�� -1> ����Ÿ��(up-casting): ����ȯ ��������
 	�ڼ�Ÿ�� <- ����Ÿ��(down-casting): ����ȯ �����Ұ�
 
 	-����ȯ�� ���������� Ÿ���� ��ȯ�ϴ� ������ �ν��Ͻ��� ��ȯ�ϴ� ���� �ƴϱ� ������ ���������� ����ȯ�� �ν��Ͻ��� �ƹ��� ������ ��ġ���ʴ´�.
 	-�����ϰ� �ִ� �ν��Ͻ����� ����� �� �ִ� ����� ����(����)�� �����ϴ°��̴�.
 	
 	-���� ��Ӱ��迡 �ִ� Ÿ�԰� ����ȯ�� �瓇������ �����Ӱ� ����� �� ������,���������� ����Ű�� �ν��Ͻ��� �ڼ�Ÿ������ ����ȯ�� �������ʴ´�.
 	�׷��� ���������� ����Ű�� �ν��Ͻ��� Ÿ���� �������� Ȯ���ϴ� ���� �߿��ϴ�.
 */


public class CastingTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* castingtest1
		 
	
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 =null;
		
		fe.water();
		car = fe; //car= (car)fe; ���� ����ȯ�� ������ �����̴�.
		fe2 = (FireEngine)car; //�ڼ�Ÿ�� <- ����Ÿ��
		fe2.water();
			 */
		
		//castingtest2
		Car car = new Car();
		Car car2 = null;
		FireEngine fe =null;
		
		car.drive();
		fe = (FireEngine)car; //�������� ok ����� �����߻��Ѵ�.
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
 
 
 
 
 
 
 
 
 
 
 