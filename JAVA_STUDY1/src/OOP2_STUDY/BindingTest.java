package OOP2_STUDY;
/*
 ���������� �ν��Ͻ� ����
 -���� Ŭ�������� ����� ��������� ���� �̸��� �ν��Ͻ� ������ �ڼ� Ŭ������ �ߺ����� ���������� ����Ÿ���� ���������� �ڼ� �ν��Ͻ��� �����ϴ¤� ���� �ڼ�Ÿ���� 
 ���������� �ڼ� �ν��Ͻ��� �����ϴ� ���� ���� �ٸ������ ��´�.
 -��������� ��� ����Ÿ�Կ� ���� �޶�����.
 -���ev  ddev evdevfv vv  v vcc vc vyuuu������ ����Ŭ������ �ڼ�Ŭ������ �ߺ� ���ǵ� ��� ����Ÿ���� ���������� ������� ���� ����Ŭ������ ����� ��������� ���ǰ�
 �ڼ�Ÿ���� ���������� ������ ��쿡�� �ڼ�Ŭ�������� ���� ��� ������ ���ȴ�.
 
 */
public class BindingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		parent2 p = new child2();
		child2 c = new child2();
		
		System.out.println("p.x: "+p.x);
		p.method();
		System.out.println();
		System.out.println("c.x: "+c.x);
		c.method();
	}

}

class parent2{
	int x=100;
	void method() {
		System.out.println("Parent Method");
	}
}

class child2 extends parent2{
	/* bindingTest1
	int x=200;
	void method() {
		System.out.println("child method");
}*/
	//bindingTest3
	int x=200;
	void method() {
		System.out.println("x="+x);
		System.out.println("super.x="+super.x);
		System.out.println("this.x="+this.x);
	}
	
	
}