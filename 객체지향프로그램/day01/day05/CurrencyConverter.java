package day05;


public class CurrencyConverter{
	private static double rate;
	
	public static double toDollar(int money) {
		return money/rate;
	}
	public static double toKW(int dollar) {
		return dollar * rate;
	}
	public static void setRate(double r) {
		rate = r;
	}
	public static double getRate() {
		return rate;
	}
}