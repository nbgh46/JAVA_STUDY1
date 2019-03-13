package OOP2_STUDY;

public class exabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		unit[] unit = new unit[4];
		
		unit[0] = new Marine();
		unit[1] = new TANK();
		unit[2] = new DropShip();
		
	}

}
abstract class unit {
	int x,y;
	abstract void move(int x , int y);
	void stop() {/* 현재 위치에서 정지*/}
}

class Marine extends unit{
	void move(int x ,int y) {this.x=x; this.y=y;}
	void stimPack() {};
}

class TANK extends unit{
	void move(int x ,int y) {this.x=x; this.y=y;}
	void changeMode() {};
}

class DropShip extends unit{
	void move(int x ,int y) {this.x=x; this.y=y;}
	void load() {};
	void unload() {};
}
