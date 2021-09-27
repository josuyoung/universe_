package ch03;

public class Rectangle {
	private int x, y, width ,height;
	
	public Rectangle(int a, int b, int c, int d) {
		x = a; y = b; width = c; height = d;
	}
	
	public int square() {
		return width * height;
	}
	public void show() {
		System.out.println("("+x+y+")"+"���� ũ�Ⱑ"+width+"x"+height+"�� �簢��");
	}
	
	public boolean contains(Rectangle b) {
		if((x < b.x)&&(y < b.y)&&(width+x > b.width+b.x)&&(height+y > b.height+b.y))
			return true;
		else
			return false;
	}
	public static void main(String args[]) {
		
		 Rectangle r = new Rectangle(2, 2, 8, 7);
		 Rectangle s = new Rectangle(5, 5, 6, 6);
		 Rectangle t = new Rectangle(1, 1, 10, 10);
		 r.show();
		 System.out.println("s�� ������ " + s.square());
		 if (t.contains(r))
		 System.out.println("t�� r�� �����մϴ�.");
		 if (t.contains(s))
		 System.out.println("t�� s�� �����մϴ�.");
		}


}
