package Task;
import java.util.Scanner;
public class Task03 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("이번 달 일수 입력(ex. 30 or 31) :");
		 int day = scanner.nextInt();
		 MonthSchedule ms = new MonthSchedule(day);
		 System.out.println("이번달 스케쥴 관리 프로그램.");
		 while (true) {
			 
			 System.out.print("할일(입력:1, 보기:2, 끝내기:3) ");
			 int menu = scanner.nextInt();
			 switch (menu) {
			 case 1: ms.input(); break;
			 case 2: ms.view(); break;
			 case 3: ms.finish(); return;
			 default: System.out.println("잘못입력하였습니다.");
			 }
		 System.out.println();
		 }
	}


}
