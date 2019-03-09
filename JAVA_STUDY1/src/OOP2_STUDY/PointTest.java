package OOP2_STUDY;

/*
  this() -  같은 클래스내에 다른 생성자를 호출
  super() - 조상클래스의 생성자를 호출
  
  -Object 클래스를 제외한 모든 클래스의 생성자 첫 줄에 생성자 this() 또는 super() 를 호출해야한다. 그렇지 않으면 컴파일러가 자동적으로
  super()  를 생성자 첫 줄에 생성한다.
  
  
  
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
		super(x,y); //조상 클래스의 멤버변수는 이처럼 조상의 생성자에 의해 초기화 시켜줘야한다.
		//생성자 첫 줄에서 다른 새성자를 호출하지 않기 떄문에 컴파일러가 "super()"를 여기에 삽입한다. super()는 point3d의 조상인 point 클래스의 기본 생성자인 
		//point()를 의마힌다.
		
		
		
		//this.x=x;
		//this.y=y;
		this.z=z;
	
	}
	
	
	
	
	String getLocation() { //오버로딩
		return " x:" + x +  "  y:"+ y+ "  z:"+ z ;
	}
}
	
	
	
	
	