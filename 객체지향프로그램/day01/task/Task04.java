package ch02;

public class Task04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 12321;
		int num2 = 2321;
		int result;
		 
		result = palindrome(num1);
		resultPrint(num1,result);

		result = palindrome(num2);
		resultPrint(num2,result);
	}		
		
		public static void resultPrint(int num1, int num2) {
			if(num1==num2) {
				System.out.println(num1+"는 회문수 입니다");
			}else
				System.out.println(num1+"는 회문수가 아닙니다");
		}
		
		
		public static int palindrome(int num) {
			int result = 0;
			int tmp = num;
			while(tmp!=0) {
				result = (result*10) + tmp%10;
				tmp/= 10;
				
			}
			return result;
		}
		
//		
//		while(t1!=0) {
//			result = (result*10) + t1%10;
//			t1/= 10;
//			
//		}
//		while(t2!=0) {
//			result2 = (result2*10) + t2%10;
//			t2/= 10;
//			
//		}
//		if(num1==result) {
//			System.out.println(num1+"는 회문수 입니다");
//			
//		}else {
//			System.out.println(num1+"는 회문수가 아닙니다");
//		}
//		
//		
//		
//		if(num2==result2) {
//			System.out.println(num2+"는회문수입니다");
//		}
//		else {
//			System.out.println(num2+"는 회문수가 아닙니다");
//		}
	}


