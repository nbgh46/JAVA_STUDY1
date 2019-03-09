package OOP2_STUDY;

/*
  this() -  ���� Ŭ�������� �ٸ� �����ڸ� ȣ��
  super() - ����Ŭ������ �����ڸ� ȣ��
  
  -Object Ŭ������ ������ ��� Ŭ������ ������ ù �ٿ� ������ this() �Ǵ� super() �� ȣ���ؾ��Ѵ�. �׷��� ������ �����Ϸ��� �ڵ�������
  super()  �� ������ ù �ٿ� �����Ѵ�.
  
  
  
 */`


public class PointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point3d2 p3 = new Point3d2(3, 4, 5);
		System.out.println(p3.getLocation());
	}

}

class point2{
	int x,y;
	
	point2(int x , int y){
	this.x = x;
	this.y = y;
	}
	
	String getLocation() {
		return "x : " +x + "y: " + y; 
	}
}


class Point3d2 extends point2{
	int z;
	
	
	
	public Point3d2(int x , int y, int z) {
		super(x,y); //���� Ŭ������ ��������� ��ó�� ������ �����ڿ� ���� �ʱ�ȭ ��������Ѵ�.
		//������ ù �ٿ��� �ٸ� �����ڸ� ȣ������ �ʱ� ������ �����Ϸ��� "super()"�� ���⿡ �����Ѵ�. super()�� point3d�� ������ point Ŭ������ �⺻ �������� 
		//point()�� �Ǹ�����.
		
		
		
		//this.x=x;
		//this.y=y;
		this.z=z;
	
	}
	
	
	
	
	String getLocation() { //�����ε�
		return " x:" + x +  "  y:"+ y+ "  z:"+ z ;
	}
}
	
	
	
	
	