package OOP2_STUDY;
/*
 �������̽��� �̿��� ������
 -�������� �ڼ�Ŭ������ �ν��Ͻ��� ����Ÿ���� ���������� �����ϴ°�
 -�������̽��� �ش� �������̽� Ÿ���� ���������� �̸� ������ Ŭ������ �ν��Ͻ��� ������ �� ������ , �������̽� Ÿ������ ����ȯ�� �����ϴ�.
 -����Ÿ���� �������̽���� ���� �޼��尡 �ش� �������̽��� ������ Ŭ������ �ν��Ͻ��� ��ȯ�Ѵٴ°��� �ǹ��Ѵ�.
 */
public class ParsetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parseable parser = ParserManager.getParser("XML");
		parser.parse("document.xml");
		parser = ParserManager.getParser("HTML");
		parser.parse("document.html");
	}+

}

interface Parseable{//���� �м� ����� �����Ѵ�.
	public abstract void parse(String fileName);
}


class ParserManager{ //����Ÿ���� Parseable�������̽��̴�.
	public static Parseable getParser(String type) {
		if(type.equals("XML")) {
			return new XMLParser();
		}
		else {
			Parseable p = new HTMLParser();
			return p;
			//return new HTMLParser
		}
	}
}

class XMLParser implements Parseable{

	@Override
	public void parse(String fileName) {
		// TODO Auto-generated method stub
		 //���� �м� �۾��� �����ϴ� �ڵ带 ���´�.
	System.out.println(fileName+"-xmlparser completed");
	}
}

class HTMLParser implements Parseable{

	@Override
	public void parse(String fileName) {
		// ���� �м��۾��� �����ϴ� �ڵ带 ���´�.
		System.out.println(fileName+"-HTMLParser completed");
	}
}


