package day05;

public class Task04 {

	public static void main(String[] args) {
		 Circle a = new Circle(2, 3, 30);
		 Circle b = new Circle(5);
		 Circle c = new Circle(2, 3);
		 System.out.println("원 a : " + a);
		 System.out.println("원 b : " + b);
		 System.out.println("원 c : " + c);
		 if (a.equals(b))
		 System.out.println("같은 원");
		 else
		 System.out.println("서로 다른 원");
		 if (a.equals(c))
		 System.out.println("같은 원");
		 else
		 System.out.println("서로 다른 원");
		 }


}
