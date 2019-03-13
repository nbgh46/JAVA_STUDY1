package OOP2_STUDY;
/*
 	�������̽�������
 	1.���߽ð� ���� - �ٸ��о� ���ð��� ����
 	2.ǥ��ȭ ���� -�ϰ��ǰ� ����ȭ�� ���α׷��� ����
 	3.���� ���谡 ���� Ŭ�����鿡�� ���踦 �ξ��ټ��ִ�.
 	4.�������� ���α׷��� ���� -Ŭ������ Ŭ������ �������� ���踦 �������̽��� �̿��ؼ� �������� ����� �����ϸ� , ��Ŭ������ ������ ���õ� �ٸ� Ŭ������ ������
 	��ġ�� �ʴ� �������� ���α׷����� �����ϴ�.
 	
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
			System.out.println(u.toString()+"�� ������ �������ϴ�.");
		}
	}

}


