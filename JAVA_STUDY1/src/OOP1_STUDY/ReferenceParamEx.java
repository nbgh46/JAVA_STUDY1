package OOP1_STUDY;
class Data {int x;}

public class ReferenceParamEx {  //������ �ŰԺ��� ���� 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d = new Data();
		d.x=10;
		System.out.println("main() : x ="+d.x);
		
		change(d);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = "+d.x);
	}
	static void change(Data d) { //������ �Ű�����
		d.x=1000;
		System.out.println("change() : x ="+d.x);
	}
}
