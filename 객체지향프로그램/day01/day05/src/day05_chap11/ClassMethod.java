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
	int num = 0;	// �ν��Ͻ� ���� (�ֳ� static�� ���⿡)
	static void addNum(int n) {	// static�� �پ����� ��ü�� ���� �� �ϰ� ���� ����
								
		int num = n;	// ���� �ֳ� �ν��Ͻ� ������ ��ü�� ������ ������ ��
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