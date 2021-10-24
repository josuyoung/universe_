package day05_chap10;

import java.time.LocalDate;

public class DateOfExecution {

	static String date;
	static {
		LocalDate nDate = LocalDate.now();
		date = nDate.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(date);
	}

}
