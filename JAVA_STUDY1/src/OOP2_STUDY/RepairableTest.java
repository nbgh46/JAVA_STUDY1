package OOP2_STUDY;
/*
 	인터페이스의장점
 	1.개발시간 단축 - 다른분야 동시개발 가능
 	2.표준화 가능 -일관되고 정형화된 프로그래밍 가능
 	3.서로 관계가 없는 클래스들에게 관계를 맺어줄수있다.
 	4.독립적인 프로그래밍 가능 -클래스와 클래스의 직접적인 관계를 인터페이스를 이용해서 간접적인 관계로 변경하면 , 한클래스의 변경이 관련된 다른 클래스에 영향을
 	미치지 않는 독립적인 프로그래밍이 가능하다.
 	
 */
public class RepairableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tank tank = new Tank();
		DropShip2 dropship = new DropShip2();
		Marine2 marine = new Marine2();
		SCV scv = new SCV();
		
		scv.repair(dropship);
		scv.repair(tank);
	//	scv.repair(marine);
	}

}

interface Repairable{}

class Unit2{
	int hitpoint;
	final int MAX_HP;
	Unit2(int hp){
		MAX_HP =hp;
	}
}

class GroundUnit extends Unit2{
	public GroundUnit(int hp) {
		// TODO Auto-generated constructor stub
		super(hp);
	}
}


class AirUnit extends Unit2{
	public AirUnit(int hp) {
		// TODO Auto-generated constructor stub
		super(hp);
	}
}

class Tank extends GroundUnit implements Repairable{
	public Tank() {
		// TODO Auto-generated constructor stub
		super(150);
		hitpoint = MAX_HP;
	}
	public String toString() {
		return "Tank";
	}
}

class DropShip2 extends AirUnit implements Repairable{
	public DropShip2() {
		// TODO Auto-generated constructor stub
		super(125);
		hitpoint = MAX_HP;
	}
	public String toString() {
		return "DropShip2";
	}
}

class Marine2 extends GroundUnit{
	public Marine2(){
		super(40);
		hitpoint = MAX_HP;
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return "Marine2";
	}
}



class SCV extends GroundUnit implements Repairable{
	public SCV(){
		super(40);
		hitpoint = MAX_HP;
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		return "SCV";
	}

	void repair(Repairable r) {
		if(r instanceof Unit2) {
			Unit2 u = (Unit2)r;
			while(u.hitpoint !=u.MAX_HP) {
				u.hitpoint++;
			}
			System.out.println(u.toString()+"의 수리가 끝났습니다.");
		}
	}

}


