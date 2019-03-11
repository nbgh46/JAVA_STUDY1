package OOP2_STUDY;

import java.util.*; //vector Ŭ������ ����ϱ� ���� �߰�

/*
 	�Ű������� ������ 
 	
 	vectorŬ����
 	-���������� objectŸ���� �迭�� ������ �־ �� �迭�� ��ü�� �߰��ϰų� ������ �� �ְ� �ۼ��Ǿ� �ִ�.
 */

class product {
	int price;
	int bonusPoint;
	
	product(int price){
		this.price=price;
		bonusPoint=(int)(price/10.0); 
	}
	product(){}
}


class Tv2 extends product{
	Tv2(){
	//����Ŭ������ ������ product(int price)�� ȣ���Ѵ�.
	super(100); //Tv�� ������ 100�������� �Ѵ�.
	}
	
	//object Ŭ������ toString()�� �������̵� �Ѵ�.
	public String toString(){return "TV";}
}

class Computer extends product{
	Computer(){
		super(200);
	}
	
	public String toString() {return "Computer";}
}

class Audio extends product{
	public Audio() {
		super(50);
	}
	public String toString() {return "Audio";}
}

class Buyer{ //��, ������ ��»��
	int money=1000; //�����ݾ�
	int bonusPoint = 0; //���ʽ� ����
	//product[] item = new product[10]; // ������ ��ǰ�� �����ϱ� ���� �迭
	Vector item = new Vector(); //������ ��ǰ�� �����ϴµ� ���� vector  ��ü 
	int i=0; // product�迭�� ���� ī����
	
	
	
	void buy(product p ) {   //�Ű������� ������
		if(money<p.price) {
			System.out.println("�ܾ��� �����ؼ� ������ ��� �����ϴ�.");
			return;
		}
		
		money -= p.price; //���������� ������ ��ǰ�� ������ �A��.
		bonusPoint += p.bonusPoint; //��ǰ�� ���ʽ� ������ �߰��Ѵ�.
		//item[i++] = p; //��ǰ�� product[] item �� �����Ѵ�.
		item.add(p); //������ ��ǰ�� vector ��ü�� �����Ѵ�.
		System.out.println(p+"��/�� �����ϼ̽��ϴ�.");
		
	}
	
	void refund(product p) { //������ ��ǰ�� ȯ���Ѵ�.
		if(item.remove(p)) {  //��ǰ�� vector ���� �����Ѵ�.
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p+"�� ��ǰ�ϼ̽��ϴ�.");
		}else {
			System.out.println("�����Ͻ� ��ǰ �� �ش� ��ǰ�� �����ϴ�.");
		}
		
	}
	
	void summary() { //������ ��ǰ�� ���� ������ ����ؼ� ���� �ش�.
		int sum =0; //������ ��ǰ�� �����հ�
		String itemList = ""; //������ ��ǰ���
		
		//�ݺ����� �̿��ؼ� ������ ��ǰ�� �� ���ݰ� ����� �����.
		/*
		for(int i=0; i<item.length;i++) {
			if(item[i] == null)break;
			sum += item[i].price;
			itemList += item[i]+", ";
		}*/
		if(item.isEmpty()) { //vector�� ����ִ��� Ȯ���Ѵ�.
			System.out.println("�����Ͻ� ��ǰ�� �����ϴ�.");
			return;
		}
		//�ݺ����� �̿��ؼ� ������ ��ǰ�� �� ���ݰ� ����� �����.
		for(int i=0;i<item.size();i++) {
			product p = (product)item.get(i); //vector�� i������ �ִ� ��ü�� ���´�.
			sum+=p.price;
			itemList += (i==0)? "" +p : ","+p;
		}
		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� "+sum+"�����Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� "+itemList+"�����Դϴ�.");
	}
	
	
	
}




public class PolyArgumentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Buyer b = new Buyer();
		 Tv2 tv = new Tv2();
		 Computer com = new Computer();
		 Audio au = new Audio();
		 
		 b.buy(tv);
		 b.buy(com);
		 b.buy(au);
		 
		 /*
		 System.out.println("���� ���� ���� "+b.money+"���� �Դϴ�.");
		 System.out.println("���� ���� ���ʽ� ������ "+b.bonusPoint+"�� �Դϴ�.");
		 */
		 b.summary();
		 System.out.println();
		 b.refund(com);
		 b.summary();
		
	}

}
