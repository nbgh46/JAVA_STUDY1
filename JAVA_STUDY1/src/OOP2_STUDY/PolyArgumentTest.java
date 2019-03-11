package OOP2_STUDY;

import java.util.*; //vector 클래스를 사용하기 위해 추가

/*
 	매개변수의 다형성 
 	
 	vector클래스
 	-내부적으로 object타입의 배열을 가지고 있어서 이 배열에 객체를 추가하거나 제거할 수 있게 작성되어 있다.
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
	//조상클래스의 생성자 product(int price)를 호출한다.
	super(100); //Tv의 가격을 100만원으로 한다.
	}
	
	//object 클래스의 toString()을 오버라이딩 한다.
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

class Buyer{ //고객, 물건을 사는사람
	int money=1000; //소유금액
	int bonusPoint = 0; //보너스 점수
	//product[] item = new product[10]; // 구입한 제품을 저장하기 위한 배열
	Vector item = new Vector(); //구입한 제품을 저장하는데 사용될 vector  객체 
	int i=0; // product배열에 사용될 카운터
	
	
	
	void buy(product p ) {   //매개변수의 다형성
		if(money<p.price) {
			System.out.println("잔액이 부족해서 물건을 살수 없습니다.");
			return;
		}
		
		money -= p.price; //가진돈에서 구입한 제품의 가격을 뺸다.
		bonusPoint += p.bonusPoint; //제품의 보너스 점수를 추가한다.
		//item[i++] = p; //제품을 product[] item 에 저장한다.
		item.add(p); //구입한 제품을 vector 객체에 저장한다.
		System.out.println(p+"을/를 구입하셨습니다.");
		
	}
	
	void refund(product p) { //구입한 제품을 환불한다.
		if(item.remove(p)) {  //제품을 vector 에서 제거한다.
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p+"을 반품하셨습니다.");
		}else {
			System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
		}
		
	}
	
	void summary() { //구매한 물품에 대한 정보를 요약해서 보여 준다.
		int sum =0; //구입한 물품의 가격합계
		String itemList = ""; //구입한 물품목록
		
		//반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
		/*
		for(int i=0; i<item.length;i++) {
			if(item[i] == null)break;
			sum += item[i].price;
			itemList += item[i]+", ";
		}*/
		if(item.isEmpty()) { //vector가 비어있는지 확인한다.
			System.out.println("구입하신 제품이 없습니다.");
			return;
		}
		//반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
		for(int i=0;i<item.size();i++) {
			product p = (product)item.get(i); //vector의 i번쨰에 있는 객체를 얻어온다.
			sum+=p.price;
			itemList += (i==0)? "" +p : ","+p;
		}
		System.out.println("구입하신 물품의 총금액은 "+sum+"만원입니다.");
		System.out.println("구입하신 제품은 "+itemList+"만원입니다.");
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
		 System.out.println("현재 남은 돈은 "+b.money+"만원 입니다.");
		 System.out.println("현재 남은 보너스 점수는 "+b.bonusPoint+"점 입니다.");
		 */
		 b.summary();
		 System.out.println();
		 b.refund(com);
		 b.summary();
		
	}

}
