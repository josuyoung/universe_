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
		System.out.println("���ϴ� ���ڿ� �ϳ� �Է��ϼ���:  ");
		String str1 = se.nextLine();
		System.out.println("���ϴ� ���ڿ��� �Է��ϼ���");
		String str2 = se.nextLine();
		System.out.printf("%s �� %s�� ����մϴ�",str1,str2);
		
		
	}
}
