package Task;
import java.util.Scanner;

public class MonthSchedule {

	private int nDays;
	private Day[] days;
	private Scanner scanner;
	
	
	public MonthSchedule(int nDays) {
		this.nDays = nDays;
		this.days = new Day [nDays];
		for(int i = 0; i < nDays; i++)
			days[i] = new Day();
		scanner = new Scanner(System.in);
	}
	
	public void input() {
		System.out.print("날짜(1~" + nDays + ")?");
		int day = scanner.nextInt();
		day--;
		if(day < 0 || day>= nDays) {
			System.out.println("날짜를 잘못 입력하셨습니다");
			return;
		}
		if(days[day].get() !=null) {
			System.out.println("할일이 이미 있습니다");
			return;
		}
		System.out.print("할일? (빈칸없이 입력) :");
		String work = scanner.next();
		
		days[day].set(work);
		
	}
	public void finish() {
		System.out.println("프로그램을 종료합니다");
		return;
	}
	public void view() {
		System.out.print("날짜(1~" + nDays + ")?");
		int day = scanner.nextInt();
		day--;
		if(day < 0 || day>= nDays) {
			System.out.println("날짜를 잘못 입력하셨습니다");
			return; 
		}
		System.out.print(day+1 + "일의 할 일은 ");
		days[day].show();
	
	}
}
