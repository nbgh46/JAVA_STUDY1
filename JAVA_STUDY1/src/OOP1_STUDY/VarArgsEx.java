package OOP1_STUDY;
/*
  �������� 
  -�Ű������� �������� �������ټ� �ִ�.
  -�������ڸ� �Ű������� ���� �������� �����ؾ��Ѵ�.
  -�������ڴ� ���������� �迭�� �̿��ϴ°��̴�.
 */
public class VarArgsEx {    //���ڿ��� �ϳ��� �������ִ� ���α׷�

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr = { "100", "200","300"};
		
		System.out.println(concatenate("", "100","200","300"));
		System.out.println(concatenate("-", strArr));
		System.out.println(concatenate(",", new String[]{"1","2","3"}));
		System.out.println("["+concatenate(",", new String[0])+"]");
		System.out.println("["+concatenate(",")+"]");
	}


	static String concatenate(String delim , String... args) {  //������ ���̿� ���� ���ڸ� ���ļ� ��ȯ�Ѵ�.��
		String result ="";
		
		for(String str : args) {
			result += str + delim;
		}
		return result;
	}
	
}

