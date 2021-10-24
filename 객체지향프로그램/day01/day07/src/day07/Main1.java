package day07;
import java.util.Scanner;
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int e = 0,n = 0,num = 1;
		while(num < 100) {
			if(num % 8 == 0 && num % 9 == 0)
				break;
			else if (num % 8 == 0) 
				e++;
			else if (num % 9 == 0) 
				n++;
			
			num++;
			
		}
		System.out.println(n);
		
	}

}
