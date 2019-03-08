package OOP2_STUDY;
/*
 	Ŭ�������� ���� �����ϱ�
 	
 	��Ӱ��� - ~�� ~�̴�(is-a)
 	���԰��� - ~�� ~�� ������ �ִ�.(has-a)
  
 */

import java.awt.Point;

class shape{
	String color = "black";
	void draw() {
		System.out.printf("[color=%s]%n",color);
	}
}

class point{
	int x;
	int y;
	
	point(int x , int y){
		this.x=x;
		this.y=y;
	}
	point(){}
	
	String getxy() {
		return "("+x+","+y+")";   //x�� y�� ���� ���ڿ��� ��ȯ
	}
}

class Circle extends shape{
	Point center; //���� ���� ��ǥ
	int r; //������
	
	Circle(){
		this(new Point(0,0),100); //circle(Point center , int r) �� ȣ��
	}
	Circle(Point center,int r){
		this.center = center;
		this.r = r;
	
	}

	void draw() {  //���� �׸��� ��ſ� ���� ������ ����ϵ��� ��
		System.out.printf("[center=(%d,%d) , r=%d , color=%s%n",center.x,center.y,r,color);
	}
}

class Triangle extends shape{
	point[] p = new point[3]; // 3���� point �ν��Ͻ��� ���� �迭�� ����
	
	Triangle(point[] p) {
		this.p = p;
	}
	


void draw() {
	System.out.printf("[p1=%s,p2=%s,p3=%s,  color=%s]%n",p[0].getxy(),p[1].getxy(),p[2].getxy(),color);
}

}


public class DrawShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		point[] p = {new point(100,200),new point(140,50),new point(200,100)};
		
		Triangle t = new Triangle(p);
		Circle c = new Circle(new Point(150,150),50);
		
		t.draw();
		c.draw();
	}

}
