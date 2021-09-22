
public class Task08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int result = factorial(n);
		System.out.println("답은!"+result);
	}
	public static int factorial(int num1) {
		if(num1 == 0) {
			return 1;
		}else
			return 2*factorial(num1-1)+1;
	}

}
