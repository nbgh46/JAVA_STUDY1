package OOP1_STUDY;
import java.util.*;//scanner를 사용하기 위해 추가
public class Scanner_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("두자리 저우를 하나 입력해주세요.");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input); //입력받은 문자열을 숫자로 반환
		
		System.out.printf("입력내용: %d", num);
		
		
	}

}
