package Task;
import java.util.Scanner;
public class Task03 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("�̹� �� �ϼ� �Է�(ex. 30 or 31) :");
		 int day = scanner.nextInt();
		 MonthSchedule ms = new MonthSchedule(day);
		 System.out.println("�̹��� ������ ���� ���α׷�.");
		 while (true) {
			 
			 System.out.print("����(�Է�:1, ����:2, ������:3) ");
			 int menu = scanner.nextInt();
			 switch (menu) {
			 case 1: ms.input(); break;
			 case 2: ms.view(); break;
			 case 3: ms.finish(); return;
			 default: System.out.println("�߸��Է��Ͽ����ϴ�.");
			 }
		 System.out.println();
		 }
	}


}
