package OOP1_STUDY;
/*
 	�����ڿ��� �ٸ� ������ ȣ���ϱ�
 	-�������� �̸����� Ŭ�����̸� ��� this�� ����Ѵ�.
 	-�� �����ڿ��� �ٸ� �����ڸ� ȣ���� ���� �ݵ�� ù �ٿ����� ȣ���� �����ϴ�.
 	-this �� ����Ҽ��ִ°� �ν��Ͻ� �������̴� static �޼��忡���� ����Ҽ�����.
 	
 	this- �ν��Ͻ� �ڽ��� ����Ű�� ��������, �ν��Ͻ��� �ּҰ� ����Ǿ� �ִ�.
 		   ��� �ν��Ͻ��޼��忡 ���������� ������ ä�� �����Ѵ�.
 		   
 	this(), this(�Ű�����)- ������,���� Ŭ������ �ٸ� �����ڸ� ȣ���� �� ����Ѵ�.
 	
 	this�� this()�� ���� �ٸ����̴�. this�� ���������̰� this()�� �������̴�.
 */



//car Ŭ���� ����
class Car2{
	String color; //����
	String gearType; // ���ӱ� ���� -auto , manual
	int door; //���� ����
	// �����ڿ��� �ٸ� ������ ȣ���ϱ�
	
	Car2(){
		this("white","auto",4);
	}
	
	

	Car2(String color){
	this(color,"auto",4);	
	}
	
	//car Ŭ���� ������ ����
	Car2(String c, String g , int d){
		color = c;
		gearType=g;
		door = d;
	}
}
public class CarTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 c1 = new Car2();
		
		
		//�����ڸ� �̿��� �ʱ�ȭ
		Car2 c2 = new Car2("blue");
		
		System.out.println("c1�� color: "+c1.color+" c1�� gearType:"+c1.gearType+" c1�� door:"+c1.door);
		System.out.println("c2�� color: "+c2.color+" c2�� gearType:"+c2.gearType+" c2�� door:"+c2.door);
	}

}
