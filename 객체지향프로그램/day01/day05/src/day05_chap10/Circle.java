package day05_chap10;

public class Circle {
	static final double PI = 3.1415;	//������� ��뿹. 1.�ν��Ͻ����� ���� ������ ���� �ʿ䰡 ���� ��� �� ��� ����
										// - ���� ������ �����̰ų� ���� ������ ������ ����
	private double radius;
	
	Circle(double red){
		radius = red;
	}
	void showPerimeter() {
		double peri = (radius * 2) * PI;
		System.out.println("�ѷ� :"+ peri);
	}
	void showArea() {
		double area = (radius * radius) * PI;
		System.out.println("����:" + area);
	}

}
