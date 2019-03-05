package OOP1_STUDY;

public class ReferenceParamEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {1,5,19,29,6,8};
		
		printArr(arr);
		
		sortArr(arr);
		printArr(arr);
		
		System.out.println("�� :"+sumArr(arr));
	}

	
	static void printArr(int[] arr) {  //�迭�� ����Ҹ� ���
		System.out.print("[");
		for(int i : arr) //���� for��
			System.out.print(i + " ");
		System.out.println("]");
	}
	
	
	static int sumArr(int arr[]) {  //�迭�� ��� ����� ���� ��ȯ
		int sum = 0;
		
		for(int i = 0; i<arr.length;i++) 
			sum+=arr[i];
		return sum;
		
	}
	
	static void sortArr(int [] arr) { //�迭�� ������������ ����
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
				}
			}
		} //sortArr
		
		
	}
}
