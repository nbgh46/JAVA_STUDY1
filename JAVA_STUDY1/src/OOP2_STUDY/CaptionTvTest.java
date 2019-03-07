package OOP2_STUDY;
/*
  ���
  - ����̶� ������ Ŭ������ �����Ͽ� ���ο� Ŭ������ �ۼ��ϴ� ���̴�.
  - ���뼺 �ߺ����� ���꼺�� ���δ�.
  -extends
  
  ����Ŭ���� - �θ�(parent)Ŭ���� , ����(super)Ŭ���� ,���(base)Ŭ����
  �ڼ�Ŭ���� - �ڽ�(child)Ŭ����,����(sub)Ŭ���� , �Ļ���(derived)Ŭ����
  
  -�����ڿ� �ʱ�ȭ ���� ��ӵ��� �ʴ´�. ����� ��ӵȴ�.
  -�ڼ� Ŭ������ ��� ������ ���� Ŭ�������� �׻� ���ų� ����.
  -�ڼ� Ŭ������ �ν��Ͻ��� �����ϸ� ���� Ŭ������ ����� �ڼ� Ŭ������ ����� ������ �ϳ��� �ν��Ͻ��� �����ȴ�.
 */

//tvŬ����
class tv{
	boolean power;
	int channel;
	
	void power(){ power =  !power;}
	void channelUp(){++channel;}
	void channelDown() {--channel;}
}

//��� Ŭ����
class CaptionTv extends tv{
	boolean caption;
	void displaycaption(String text) {
		if(caption)   //caption ���°� on�ϋ��� �ڸ��� �����ش�.
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
		ctv.displaycaption("��ο� ����");
		ctv.caption = true;
		ctv.displaycaption("��ο� ����");
	}

}
