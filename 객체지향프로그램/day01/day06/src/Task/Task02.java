package Task;
import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("한영 단어 검색 프로그램입니다.");
		while(true) {
			System.out.println("한글 단어?");
			String kor = scanner.nextLine();
			if(kor.equals("그만"))
				break;
			String eng = Dictionary.kor2Eng(kor);
			if(eng == null) {
				System.out.println(kor + "는 저의 사전에 없습니다");
			
			}else
				System.out.println(kor + "는 " + eng);
		}
	}
}
