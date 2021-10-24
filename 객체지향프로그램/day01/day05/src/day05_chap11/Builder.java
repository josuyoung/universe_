package day05_chap11;

public class Builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder str = new StringBuilder("123");
		str.append(456);
		System.out.println(str);
		str.delete(0, 2);
		System.out.println(str);
		str.replace(0, 3, "AB");
		System.out.println(str);
		System.out.println(str.reverse());
		System.out.println(str.substring(0,2));
	}

}
