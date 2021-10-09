package day05;

public class Task02 {

	public static void main(String[] args) {
		 CurrencyConverter.setRate(1121);
		 System.out.println("환율1달러 : " + CurrencyConverter.getRate());
		 System.out.println("백만원은 $" +
		CurrencyConverter.toDollar(1000000) + "입니다.");
		 System.out.println("$120는 " +
		CurrencyConverter.toKW(120) + "원 입니다.");
		 }

}
