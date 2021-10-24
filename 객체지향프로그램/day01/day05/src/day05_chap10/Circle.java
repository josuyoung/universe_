package day05_chap10;

public class Circle {
	static final double PI = 3.1415;	//멤버변수 사용예. 1.인스턴스별로 값을 가지고 있을 필요가 없을 경우 즉 모두 공유
										// - 값의 참조가 목적이거나 값의 공유가 목적인 변수
	private double radius;
	
	Circle(double red){
		radius = red;
	}
	void showPerimeter() {
		double peri = (radius * 2) * PI;
		System.out.println("둘레 :"+ peri);
	}
	void showArea() {
		double area = (radius * radius) * PI;
		System.out.println("넓이:" + area);
	}

}
