package day07;

public class Shape {

	String name;
	int x,y;
	
	public Shape(String name, int x) {
		this.name = name;
		this.x = x;
	}
	public Shape(String name, int x, int y) {
		this.name = name;
		this.x = x;
		this.y = y;
	}
	public String getname() {
		return name;
	}
	public double getArea() {
		return 0;
	}
}

class Circle extends Shape{
	public Circle(String name, int x) {
		super(name,x);
	}
	public String getName() {
		return name;
	}
	public double getArea() {
		return (x*x)*3.14;
	}
}
class Rectangle extends Shape{
	public Rectangle(String name, int x, int y) {
		super(name, x, y);
	}
	public String getName() {
		return name;
	}
	public double getArea() {
		return x*y;
	}
}

class Triangle extends Shape{
	public Triangle(String name, int x, int y) {
		super(name, x, y);
	}
	public String getName() {
		return name;
	}
	public double getArea() {
		return x*y/2.0;
	}
}

