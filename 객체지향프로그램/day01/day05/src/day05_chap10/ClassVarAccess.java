package day05_chap10;

class ClassVarAccess{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accessway way = new Accessway();
		way.num++;	//외부에서 인서턴스의 이름을 통한 접근
		Accessway.num++;	//외부에서 클래스명을 통한 접근		이 방법이 제일 적절 왜냐하면 클래스이름으로 접근해야 
														// static인줄 알수 있다 왜냐하면 클래스변수기에 클래스명으로 접근
		System.out.println("num값은"+Accessway.num);
		
	}
}