package day05;

public class ExId {

	private static int count = 0;
	private static int step = 1;
	private int id;
	
	public ExId() {
		count += step;
		id = count;
	}
	
	public int getId() { return id;}
	public static int getStep() {return step;}
	public static void setStep(int s) {step = s;}
	public static int getMaxId() {return count;}
}

