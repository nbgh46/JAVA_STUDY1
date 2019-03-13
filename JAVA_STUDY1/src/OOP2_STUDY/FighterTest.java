package OOP2_STUDY;
/*
 	인터페이스
 	-일종의 추상클래스
 	-추상클래스보다 추상화 정도가 높아서 추상클래스와 달리 몸통을 갖춘 일반 메서드 또는 멤버변수를 구성원으로 가질수 없다.
 	
 	인터페이스의 작성
 	interface 인터페이스이름{
 		public static final 타입 상수이름 =값;
 		public abstract 메서드이름(매개변수목록);
 		}
 	-모든 멤버변수는 public static final 이어야 하며, 이름 생략할수도 있다
 	-모든 메서드는 public abstract 이어야 하며 , 이를 생략할수도 있다.(단 static메서드와 디폴트 메서드는 예외)
 	
 	인터페이스는 인터페이스로부터만 상속받을 수 있으면 클래스와 달리 다중상속이 가능하다.
 	
 */
public class FighterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fighter f = new Fighter();
		
		if(f instanceof Unit)
			System.out.println("f는 Unit의 자손입니다.");
		
		if(f instanceof Fightable) {
			System.out.println("f는 Fightable인터페이스를 구성했습니다.");
		}
		if(f instanceof Moveable) {
		System.out.println("f는 Moveable 인터페이스를 구현했습니다.");
		}
		if(f \7578/695689/+instanceof Attackable) {
			\System.out.println("f는 Attackable인터페이스를 구현했습니다.");
		}
		if(f instanceof Object) {
			System.out.println("f는 Object 클래스의 자손입니다.");
		}
		
	}

}

//인터페이스 구현
interface Moveable{ void move(int x, int y );}
interface Attackable{void attack(Unit u);}
interface Fightable extends Moveable,Attackable{}

class Unit{
	int currentHP;
	int x;
	int y;
}

class Fighter extends Unit implements Fightable{

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack(Unit u) {
		// TODO Auto-generated method stub
		
	}
	
}


