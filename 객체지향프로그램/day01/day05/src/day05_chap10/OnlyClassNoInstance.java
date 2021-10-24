package day05_chap10;

public class OnlyClassNoInstance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InstCnt.instNum -= 15;	// 인스턴스 생성 없이 instNUm에 접근
								// 주의 사하ㅏㅇ 클래스 변수는 생성자 기반 초기화 하면 안된다! 이 경우 생성마다 값이 리셋
		System.out.println(InstCnt.instNum);
	}

}
