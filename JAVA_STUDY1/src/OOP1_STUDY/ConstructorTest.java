package OOP1_STUDY;
/*
 	������
 	-�ν��Ͻ� �ʱ�ȭ �޼���
 	-�������� �̸��� Ŭ������ �̸��� ���ƾ��Ѵ�.
 	-�����ڴ� ���ϰ��� ����.
 	
 	�⺻������
 	-�����Ϸ����� �ڵ������� �������ִ� ������
 	-�Ű������� ���� �ƹ��� ������ ����.
 	
 */
public class ConstructorTest {

	//Ŭ���� 1 ����
	class Data1{
		int value;
	}
	//Ŭ���� 2 ����
	class Data2{
		int value;
		//������ ����
		Data2(int x){ //�Ű������� �ִ� ������
			value =x;
			
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data1 d1 = new Data1();
		//Data2 d2 = new Data2(); //������ ���� �߻�
		/* ������ ������ �߻��ϴ� ������ �⺻ �����ڰ� ���� �����̴�.
		    �⺻�����ڰ� �����Ϸ��� ���� �����Ǵ� ���� Ŭ������ ���ǵ� �����ڰ� �ϳ��������� ���̴�.
		 */
	}

}
