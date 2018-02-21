package prob03;

public class CurrencyConverterTest {

	public static void main(String[] args) {
		//  환율을 세팅 합니다.
		CurrencyConverter.setRate(1076.20);
		
		//백만원 환전
		double dollar=CurrencyConverter.toDollar(1000000);
		System.out.println("백만원은 "+dollar+"달러입니다.");
		
		//백달러 환전
		double krw=CurrencyConverter.toKRW(100);
		System.out.println("백달러는 "+krw+"원입니다.");
		
	}

}
