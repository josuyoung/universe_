package day05_chap10;

public class SimpleCalculation {
	static final double PI = 3.141592;

	static double add(double num1 , double num2) {
		return num1 + num2;
	}
	static double min(double n1, double n2) {
		return n1 - n2;
	}
	
	static double getArea(double r) {		//static�� �׳� ���� �����Ҽ� �ְ� ���ش� ��������
											// ������ ��Ƽ���� ��� ������ ������ �����ڳ� �ν��Ͻ�ȭ �� �ʿ� ���� �׳� �����ϰ� �ϴ� ���� �Ǵ�!~
		return (r*r)*PI;
	}
	static double getPeri(double r) {
		return (r*2)*PI;
	}
}
