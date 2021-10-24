package day06;
import java.util.Scanner;


public class Array_2 {
	static int sumOfAry(int[] ar) {
		int sum = 0;
		for(int i = 0; i < ar.length; i++) {
			sum += ar[i];
		}
		return sum;
	}
	
	static int[] makenewart(int len) {
		int[] ar = new int[len];
		return ar;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,5};
		System.out.println( sumOfAry(arr));
		
		Scanner ar = new Scanner(System.in);
		
		
	}

	
}

