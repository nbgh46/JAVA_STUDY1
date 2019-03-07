package OOP1_STUDY;

/*
 �ʱ�ȭ ��
 	
 	�ν��Ͻ� �ʱ�ȭ �� - �ν��Ͻ� ������ ������ �ʱ�ȭ�� ���ȴ�.
 		-Ŭ���� ���� ��{}�� ����� �׾ȿ� �ڵ带 �ۼ��ϱ⸸ �ϸ�ȴ�.
 		-�����ڿ� ���� �ν��Ͻ��� �����ҋ� ���� ����ȴ�.
 		-�ν��Ͻ� ������ �ʱ�ȭ�� �ַ� �����ڸ� ����ϰ� , �ν��Ͻ� ���� ��� �����ڿ��� �������� ����ž� �ϴ� �ڵ带 �ִµ� ����Ѵ�.
 		
 		
 	Ŭ���� �ʱ�ȭ �� - Ŭ���� ������ ������ �ʱ�ȭ�� ���ȴ�.
 		-Ŭ���� �ʱ�ȭ ���� �ν��Ͻ� �ʱ�ȭ �� �տ� �ܼ��� static �� �ٿ��� ����Ѵ�.
 		-Ŭ������ �޸𸮿� ó�� �ε��� �� �ѹ��� ����ȴ�
 	
 	�ʱ�ȭ ���� ����
 	- �ߺ��� ���� , �ŷڼ��� ����, ������ �߻����ɼ��� ���̰� ���뼺�� ���δ�.
 */



public class BlockTest {

	static int arr[]  = new int[10];
	
	static{    //Ŭ���� �ʱ�ȭ ��
		System.out.println("static () ");
		
		for(int i=0;i<arr.length;i++)
			//1�� 10 ������ ������ ���� �迭 arr�� �����Ѵ�.
			arr[i] = (int)(Math.random()*10) +1;
		
	}
	
	//////////////////////////////////////////////////////
	{
		System.out.println(" { }");  //�ν��Ͻ� �ʱ�ȭ ��
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("BlockTest bt = new BlockTest(); ");
		BlockTest bt = new BlockTest();
		
		System.out.println("BlockTest bt2 = new BlockTest(); ");
		BlockTest bt2 = new BlockTest();
	
		for(int i=0; i<arr.length;i++)
			System.out.println("arr["+i+"]"+arr[i]);
	
	}

}
