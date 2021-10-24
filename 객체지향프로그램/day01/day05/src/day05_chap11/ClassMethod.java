package day05_chap11;

class NumberPrinter{
	private static int mynum = 0;
	
	static void numberPrint(int a) { System.out.println(a);}
	static void doublePrint(double b) { System.out.println(b);}
	
	void setNumber(int a) {
		mynum = a;
		
	}
	void showMyNum() {
		numberPrint(mynum);
	}
}

class AAA{
	int num = 0;	// 인스턴스 변수 (왜냐 static이 없기에)
	static void addNum(int n) {	// static이 붙었으니 객체를 생성 안 하고 접근 가능
								
		int num = n;	// 오류 왜냐 인스턴스 변수는 객체를 만들어야 생성이 됌
	}
}

class ClassMethod{
	public static void main(String[] args) {
		
		NumberPrinter.numberPrint(89);
		NumberPrinter n1 = new NumberPrinter();
		n1.setNumber(60);
		n1.showMyNum();
		char a = 67;
		System.out.println(a);
		
		
	}
	
}