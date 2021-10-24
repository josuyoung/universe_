package day05_chap11;

class Park {
	private int passNum;
	private int resiNum;
	
	// 메소드 생성자 오버라이딩
	Park(int pNum, int rNum){
		passNum = pNum;
		resiNum = rNum;
	}
//	PerSon(int rNum){
//		passNum = 0;
//		resiNum = rNum;
//	}
	//좋은 방법
	Park(int rNum){
		this(0,rNum);
	}
	
	public void printNum() {
		System.out.println("passNum" + "resiNum");
	}
	
}


public class Person{
	
	public static void main(String[] args) {
		//주민번호 여권번호 모두 있는경우
		Park a = new Park(123123,123123);
		// 주민번호만 있는경우
		Park b = new Park(125123);
		b.printNum();
		//concat 붙여주기
		//substirng(2,4) 2번인덱스부터 4직전까지
		String birth = (new StringBuilder("<양>").append('.').append(18).append("축하해")).toString();

		System.out.println(birth);
	}
	
}