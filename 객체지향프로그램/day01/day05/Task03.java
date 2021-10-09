package day05;

public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "eW";
		String text2 = "LOVE";
		String text3 = "C++";
		String text4 = "		programming.";
		
		StringBuilder sb = new StringBuilder(text1);
		sb.reverse(); 
		sb.append(' ').append(text2.toLowerCase());
		sb.append(' ').append(text3);
		sb.replace(8, 11, "JAVA");
		sb.append(' ').append(text4.trim());
		
		System.out.println(sb.toString());
		

	}

}
