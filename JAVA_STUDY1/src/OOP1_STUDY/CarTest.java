package OOP1_STUDY;
//�Ű������� �ִ� ������



//car Ŭ���� ����
class Car{
	String color; //����
	String gearType; // ���ӱ� ���� -auto , manual
	int door; //���� ����
	
	//car Ŭ���� �⺻ ������ ����
	Car(){}
	
	//car Ŭ���� ������ ����
	Car(String c, String g , int d){
		color = c;
		gearType=g;
		door = d;
	}

}


public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�⺻ �����ڷ� �ν��Ͻ� ������ �ʱ�ȭ
		Car c1 = new Car();
		c1.color="white";
		c1.gearType="auto";
		c1.door=4;
		
		//�����ڸ� �̿��� �ʱ�ȭ
		Car c2 = new Car("blue", "manual", 2);
		
		System.out.println("c1�� color: "+c1.color+" c1�� gearType:"+c1.gearType+" c1�� door:"+c1.door);
		System.out.println("c2�� color: "+c2.color+" c2�� gearType:"+c2.gearType+" c2�� door:"+c2.door);
	}

}
