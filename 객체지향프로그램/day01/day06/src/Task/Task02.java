package Task;
import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		while(true) {
			System.out.println("�ѱ� �ܾ�?");
			String kor = scanner.nextLine();
			if(kor.equals("�׸�"))
				break;
			String eng = Dictionary.kor2Eng(kor);
			if(eng == null) {
				System.out.println(kor + "�� ���� ������ �����ϴ�");
			
			}else
				System.out.println(kor + "�� " + eng);
		}
	}
}
