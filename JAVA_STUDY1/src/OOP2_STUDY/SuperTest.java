package OOP2_STUDY;
/*
 �������̵�
 -���� Ŭ�������� ��ӹ��� �޼����� ������ ���� �ϴ°� 
 
�������̵��� ����
- �޼����� ���븸�� ���� �ۼ��ϴ� ���̹Ƿ� �޼����� ����δ� �����ǰͰ� ��ġ�ؾ��Ѵ�.
- �̸��� ���ƾ� �Ѵ�.
- �ްԺ����� ���ƾ� �Ѵ�.
-��ȯŸ���� ���ƾ� �Ѵ�.

���� Ŭ������ �޼��带 �ڼ� Ŭ�������� �������̵� �� �� 
-���� �����ڴ� ���� Ŭ������ �޼��庸�� ���� ������ ���� �� �� ����.
-���� Ŭ������ �޼��庸�� ���� ���� ���ܸ� ������ �� ����.
-�ν��Ͻ��޼��带 static�޼���� �Ǵ� �� �ݴ�� �����Ҽ� ����.

super
-�ڼ� Ŭ�������� ����Ŭ�����κ��� ��ӹ��� ����� �����ϴµ� ���Ǵ� ���������̴�.
-���� Ŭ�����κ��� �󺹹��� ����� �ڼ� Ŭ���� �ڽ��� ����̹Ƿ� super ��� this�� ����Ҽ��ִ�.
-���� Ŭ������ ����� �ڼ�Ŭ������ ����� �ߺ� ���ǵǾ� ���� �����ؾ� �ҋ� ����Ѵ�.
 */



public class SuperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		child c = new child();
		c.method();
	}

}

class parent{
	int x =10; //super
	
}

class child extends parent{
	int x = 20; //this
	void method() {
		System.out.println("x="+x);
		System.out.println("this.x="+this.x);
		System.out.println("super.x="+super.x);
		
		
		
	}
}