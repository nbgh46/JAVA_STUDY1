package OOP1_STUDY;
/*
  �����ڸ� �̿��� �ν��Ͻ��� ����
  -���� ����ϰ� �ִ� �ν��Ͻ��� ���� ���¸� ���� �ν��Ͻ��� ������� �ҋ� ���
  -�������� �Ű������� ���������� ����Ѵ�.
  -���� �������� ������ �޸𸮰����� �����ϴ� �ν��Ͻ��̹Ƿ� c1�� ���� �����ص� c2�� ������ ��ġ�� �ʴ´�.
  
  
  **�ν��Ͻ��� �����ҋ��� 2���� ������ �����ؾ��Ѵ�.
  		1.Ŭ����- � Ŭ������ �ν��Ͻ��� ������ ���ΰ�?
  		2.������- ������ Ŭ������ � �����ڷ� �ν��Ͻ��� ������ ���ΰ�?
  
 */

class Car3{
	String color; //����
	String gearType; // ���ӱ� ���� -auto , manual
	int door; //���� ����

	Car3(){
		this("white","auto",4);
	}

	//�ν��Ͻ� ���縦 ���� ������
	Car3(Car3 c){
		color = c.color;
		gearType=c.gearType;
		door=c.door;
	}
	

	Car3(String color){
	this(color,"auto",4);	
	}
	
	//car Ŭ���� ������ ����
	Car3(String c, String g , int d){
		color = c;
		gearType=g;
		door = d;
	}







}
public class CarTest3 {
 public static void main(String[] args)	{
	 
	Car3 c1 = new Car3();
		
		
		//�����ڸ� �̿��� �ʱ�ȭ
		Car3 c2 = new Car3(c1);   //c1�� ���纻 c2�� �����Ѵ�.
		
		System.out.println("c1�� color: "+c1.color+" c1�� gearType:"+c1.gearType+" c1�� door:"+c1.door);
		System.out.println("c2�� color: "+c2.color+" c2�� gearType:"+c2.gearType+" c2�� door:"+c2.door);
	}

	 
	 
	 
	 
 }

