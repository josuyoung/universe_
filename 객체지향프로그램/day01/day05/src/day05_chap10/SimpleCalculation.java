package day05_chap10;

public class SimpleCalculation {
	static final double PI = 3.141592;

	static double add(double num1 , double num2) {
		return num1 + num2;
	}
	static double min(double n1, double n2) {
		return n1 - n2;
	}
	
	static double getArea(double r) {		//static은 그냥 공유 접근할수 있게 해준다 생각하자
											// 간단한 유티릴리 기능 제공일 때에는 생성자나 인스턴스화 할 필요 없이 그냥 접근하게 하는 것이 옳다!~
		return (r*r)*PI;
	}
	static double getPeri(double r) {
		return (r*2)*PI;
	}
}
