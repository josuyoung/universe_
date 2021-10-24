package day05_chap10;

public class NumberPrinter {
	
	static int myNum = 0;
	
	static void printNum(int n) {System.out.println(n);}
	static void doubleNum(double n) { System.out.println(n);}
	
	void setMyNum(int n) {
		myNum = n;
	}
	public static void showMyNum() {
		printNum(myNum);
	}

}
