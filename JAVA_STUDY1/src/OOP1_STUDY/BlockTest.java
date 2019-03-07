package OOP1_STUDY;

/*
 초기화 블럭
 	
 	인스턴스 초기화 블럭 - 인스턴스 변수의 복잡한 초기화에 사용된다.
 		-클래스 내에 블럭{}을 만들고 그안에 코드를 작성하기만 하면된다.
 		-생성자와 같이 인스턴스를 생성할떄 마다 수행된다.
 		-인스턴스 변수의 초기화는 주로 생성자를 사용하고 , 인스턴스 블럭은 모든 생성자에서 공통으로 수행돼야 하는 코드를 넣는데 사용한다.
 		
 		
 	클래스 초기화 블럭 - 클래스 변수의 복잡한 초기화에 사용된다.
 		-클래스 초기화 블럭은 인스턴스 초기화 블럭 앞에 단순히 static 을 붙여서 사용한다.
 		-클래스가 메모리에 처음 로딩될 떄 한번만 수행된다
 	
 	초기화 블럭의 장점
 	- 중복을 제거 , 신뢰성을 높임, 오류의 발생가능성을 줄이고 재사용성을 높인다.
 */



public class BlockTest {

	static int arr[]  = new int[10];
	
	static{    //클래스 초기화 블럭
		System.out.println("static () ");
		
		for(int i=0;i<arr.length;i++)
			//1과 10 사이의 임의의 값을 배열 arr에 저장한다.
			arr[i] = (int)(Math.random()*10) +1;
		
	}
	
	//////////////////////////////////////////////////////
	{
		System.out.println(" { }");  //인스턴스 초기화 블럭
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
