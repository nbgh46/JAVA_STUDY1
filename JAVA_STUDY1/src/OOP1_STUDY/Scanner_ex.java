package OOP1_STUDY;
import java.util.*;//scanner�� ����ϱ� ���� �߰�
public class Scanner_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("���ڸ� ���츦 �ϳ� �Է����ּ���.");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input); //�Է¹��� ���ڿ��� ���ڷ� ��ȯ
		
		System.out.printf("�Է³���: %d", num);
		
		
	}

}
