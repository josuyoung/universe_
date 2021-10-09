package day05;

public class Circle {

	private int x,y,radius;
	public Circle(int radius) { this(0,0,radius);}
	public Circle(int x, int y) {this(x,y,5);}
	public Circle(int x, int y , int radius) {
		this.x = x; this.y = y; this.radius = radius;
	}
	
	public String toString() {
		return "Circle(" + x + "," + y + ")" + "반지름" + radius;
		
	}
	public boolean equals(Circle b) {
		if(x == b.x && y == b.y) return true;
		else return false;
	}
}
