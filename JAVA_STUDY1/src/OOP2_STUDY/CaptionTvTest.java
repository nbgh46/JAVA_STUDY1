package OOP2_STUDY;
/*
  상속
  - 상속이란 기존의 클래스를 재사용하여 새로운 클래스를 작성하는 것이다.
  - 재사용성 중복제거 생산성을 높인다.
  -extends
  
  조상클래스 - 부모(parent)클래스 , 상위(super)클래스 ,기반(base)클래스
  자손클래스 - 자식(child)클래스,하위(sub)클래스 , 파생된(derived)클래스
  
  -생성자와 초기화 블럭은 상속되지 않는다. 멤버만 상속된다.
  -자손 클래스의 멤버 개수는 조상 클래스보다 항상 같거나 많다.
  -자손 클래스의 인스턴스를 생성하면 조상 클래스의 멤버와 자손 클래스의 멤버가 합쳐진 하나의 인스턴스로 생성된다.
 */

//tv클래스
class tv{
	boolean power;
	int channel;
	
	void power(){ power =  !power;}
	void channelUp(){++channel;}
	void channelDown() {--channel;}
}

//상속 클래스
class CaptionTv extends tv{
	boolean caption;
	void displaycaption(String text) {
		if(caption)   //caption 상태가 on일떄만 자막을 보여준다.
			System.out.println(text);
	}
}

public class CaptionTvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaptionTv ctv = new CaptionTv();
		ctv.channel=10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.displaycaption("헬로우 월드");
		ctv.caption = true;
		ctv.displaycaption("헬로우 월드");
	}

}
