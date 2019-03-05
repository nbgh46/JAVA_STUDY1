package OOP1_STUDY;

public class FactorialTest {  //재귀호출 예제

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result = Factorial(20);
		System.out.println(result);
	}

	static int Factorial(int n) {
		int result = 0;
		if(n==1) 
			result=1;
		else
			result= n * Factorial(n-1);
			
		return result;
		
		
	}
}

