package day04;


public class Good_method {
	String accNumber;
	String ssNumber;
	int balance = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int COLOR_RAINBOW = 7;
		System.out.println(COLOR_RAINBOW);
	}
	// 생성자 이름은 클래스와 같아야한다!!
	public Good_method(String acc, String ss, int bal) {
		accNumber = acc;
		ssNumber = ss;
		balance = bal;

	}
	
//	초기값을 넣어보리기
	Good_method yoon = new Good_method("12-34-56","990404-102022",10000);
	


	
//	BackAccountPO 클래스 내부에서 선언하면 됌!
//	BackAccountPO yoon = new BackAccountPO();
//	yoon.initAccount("12-34-56","989420-129412",10000);

}
