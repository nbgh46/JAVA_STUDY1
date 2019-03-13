package OOP2_STUDY;
/*
 인터페이스를 이용한 다형성
 -다형성은 자손클래스의 인스턴스를 조상타입의 참조변수로 참조하는것
 -인터페이스는 해당 인터페이스 타입의 참조변수로 이를 구현한 클래스의 인스턴스를 참조할 수 있으며 , 인터페이스 타입으로 형변환도 가능하다.
 -리턴타입이 인터페이스라는 것은 메서드가 해당 인터페이스를 구현한 클래스의 인스턴스를 반환한다는것을 의미한다.
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

interface Parseable{//구문 분석 잡업을 수행한다.
	public abstract void parse(String fileName);
}


class ParserManager{ //리턴타입이 Parseable인터페이스이다.
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
		 //구문 분석 작업을 수행하는 코드를 적는다.
	System.out.println(fileName+"-xmlparser completed");
	}
}

class HTMLParser implements Parseable{

	@Override
	public void parse(String fileName) {
		// 구문 분석작업을 수행하는 코드를 적는다.
		System.out.println(fileName+"-HTMLParser completed");
	}
}


