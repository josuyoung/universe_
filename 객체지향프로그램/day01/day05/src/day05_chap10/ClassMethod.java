package day05_chap10;

public class ClassMethod {

	public static void main(String[] args) {
		
		NumberPrinter.myNum = 10;
		NumberPrinter.showMyNum();
		
		NumberPrinter num1 = new NumberPrinter();
		num1.setMyNum(10);
		num1.showMyNum();
	}
}
