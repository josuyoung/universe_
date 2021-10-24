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
		System.out.print("��¥(1~" + nDays + ")?");
		int day = scanner.nextInt();
		day--;
		if(day < 0 || day>= nDays) {
			System.out.println("��¥�� �߸� �Է��ϼ̽��ϴ�");
			return;
		}
		if(days[day].get() !=null) {
			System.out.println("������ �̹� �ֽ��ϴ�");
			return;
		}
		System.out.print("����? (��ĭ���� �Է�) :");
		String work = scanner.next();
		
		days[day].set(work);
		
	}
	public void finish() {
		System.out.println("���α׷��� �����մϴ�");
		return;
	}
	public void view() {
		System.out.print("��¥(1~" + nDays + ")?");
		int day = scanner.nextInt();
		day--;
		if(day < 0 || day>= nDays) {
			System.out.println("��¥�� �߸� �Է��ϼ̽��ϴ�");
			return; 
		}
		System.out.print(day+1 + "���� �� ���� ");
		days[day].show();
	
	}
}
