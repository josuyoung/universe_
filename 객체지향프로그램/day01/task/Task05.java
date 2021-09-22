package ch02;

public class Task05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 0; i<6; i++) {
			System.out.println("f("+i+") = "+factorial(i));
		}
	}
	public static int factorial(int num1) {
		if(num1 == 0) {
			return 1;
		}else
			return 2*factorial(num1-1)+1;
	}
}
