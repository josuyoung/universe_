package day05;

public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "I Love you";
		int len = text.length();
		for(int i = 0; i<len; i++) {
			
			String first = text.substring(0,1);
			String last = text.substring(1);
			text = last + first;
			System.out.println(text);
		}
	}

}
