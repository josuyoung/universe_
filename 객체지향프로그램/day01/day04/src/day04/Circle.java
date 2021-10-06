package day04;



public class Circle {
	final double pi = 3.14;
	private double rad;

	
	public Circle(double r) {
		setRad(r);
	}
	public void setRad(double r) {
		if(r<=0) {
			rad = 0;
			return;
		}
		rad = r;
	}
	public double getArea() {
		return (rad*rad)*pi;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle n = new Circle(4.2);
		System.out.println(n.getArea());
		n.setRad(2.3);
		System.out.println(n.getArea());
		n.rad = -4.5;
		System.out.println(n.getArea());


		
	}

}
