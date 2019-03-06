package OOP1_STUDY;
/*
  가변인자 
  -매개변수를 동적으로 지정해줄수 있다.
  -가변인자를 매개변수중 가장 마지막에 선언해야한다.
  -가변인자는 내부적으로 배열을 이용하는것이다.
 */
public class VarArgsEx {    //문자열을 하나로 결합해주는 프로그램

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr = { "100", "200","300"};
		
		System.out.println(concatenate("", "100","200","300"));
		System.out.println(concatenate("-", strArr));
		System.out.println(concatenate(",", new String[]{"1","2","3"}));
		System.out.println("["+concatenate(",", new String[0])+"]");
		System.out.println("["+concatenate(",")+"]");
	}


	static String concatenate(String delim , String... args) {  //구분자 사이에 껴서 문자를 합쳐서 반환한다.ㅛ
		String result ="";
		
		for(String str : args) {
			result += str + delim;
		}
		return result;
	}
	
}

