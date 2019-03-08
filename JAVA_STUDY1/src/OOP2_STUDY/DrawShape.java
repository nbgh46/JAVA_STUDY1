package OOP2_STUDY;
/*
 	클래스간의 관계 정리하기
 	
 	상속관계 - ~은 ~이다(is-a)
 	포함관계 - ~은 ~을 가지고 있다.(has-a)
  
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
		return "("+x+","+y+")";   //x와 y의 값을 문자열로 반환
	}
}

class Circle extends shape{
	Point center; //원의 원점 좌표
	int r; //반지름
	
	Circle(){
		this(new Point(0,0),100); //circle(Point center , int r) 를 호출
	}
	Circle(Point center,int r){
		this.center = center;
		this.r = r;
	
	}

	void draw() {  //원을 그리는 대신에 원의 정보를 출력하도록 함
		System.out.printf("[center=(%d,%d) , r=%d , color=%s%n",center.x,center.y,r,color);
	}
}

class Triangle extends shape{
	point[] p = new point[3]; // 3개의 point 인스턴스를 담을 배열을 생성
	
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
