package OOP2_STUDY;
/*
 	�������̽�
 	-������ �߻�Ŭ����
 	-�߻�Ŭ�������� �߻�ȭ ������ ���Ƽ� �߻�Ŭ������ �޸� ������ ���� �Ϲ� �޼��� �Ǵ� ��������� ���������� ������ ����.
 	
 	�������̽��� �ۼ�
 	interface �������̽��̸�{
 		public static final Ÿ�� ����̸� =��;
 		public abstract �޼����̸�(�Ű��������);
 		}
 	-��� ��������� public static final �̾�� �ϸ�, �̸� �����Ҽ��� �ִ�
 	-��� �޼���� public abstract �̾�� �ϸ� , �̸� �����Ҽ��� �ִ�.(�� static�޼���� ����Ʈ �޼���� ����)
 	
 	�������̽��� �������̽��κ��͸� ��ӹ��� �� ������ Ŭ������ �޸� ���߻���� �����ϴ�.
 	
 */
public class FighterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fighter f = new Fighter();
		
		if(f instanceof Unit)
			System.out.println("f�� Unit�� �ڼ��Դϴ�.");
		
		if(f instanceof Fightable) {
			System.out.println("f�� Fightable�������̽��� �����߽��ϴ�.");
		}
		if(f instanceof Moveable) {
		System.out.println("f�� Moveable �������̽��� �����߽��ϴ�.");
		}
		if(f \7578/695689/+instanceof Attackable) {
			\System.out.println("f�� Attackable�������̽��� �����߽��ϴ�.");
		}
		if(f instanceof Object) {
			System.out.println("f�� Object Ŭ������ �ڼ��Դϴ�.");
		}
		
	}

}

//�������̽� ����
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


