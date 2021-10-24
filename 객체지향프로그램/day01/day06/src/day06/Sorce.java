package day06;
import java.util.Scanner;
public class Sorce {
	
	public static void main(String[]args) {
		String source = "1 2 3";
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		System.out.printf("%d + %d + %d =%d",num1,num2,num3,num1+num2+num3);
		
		
		Scanner se = new Scanner(System.in);
		System.out.println("원하는 문자열 하나 입력하세요:  ");
		String str1 = se.nextLine();
		System.out.println("원하는 문자열울 입력하세요");
		String str2 = se.nextLine();
		System.out.printf("%s 와 %s를 출력합니다",str1,str2);
		
		
	}
}
