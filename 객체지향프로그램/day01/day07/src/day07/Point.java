package day07;

public class Point{
	private int x,y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() { return x;}
	public int getY() { return y;}
	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class ColorPoint extends Point{
	String color;
	public ColorPoint(int x, int y, String color) {
		super(x,y);
		this.color = color;
		
	}
	public void setXY(int x, int y) {
		move(x, y);
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String toString() {
		return color + "색의 (" + getX() + "," + getY()+") 의 점";
	}

}

class Point3D extends Point{
	private int z;
	public Point3D(int x, int y, int z){
		super(x,y);
		this.z = z;
	}
	public String toString() {
		return "("+getX()+","+getY()+","+z+")의 점";
	}
	public void moveUp() {z++;}
	public void moveDown() {z--;}
	public void move(int x, int y,int z) {
		move(x,y);
		this.z = z;
		
	}
}













