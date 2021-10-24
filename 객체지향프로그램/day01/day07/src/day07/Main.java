package day07;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ColorPoint cp = new ColorPoint(5,5,"Yellow");
		cp.setXY(10, 20);
		cp.setColor("Red");
		String str = cp.toString();
		System.out.println(str + "입니다");
		
		
		Point3D p = new Point3D(1,2,3);
		System.out.println(p.toString() + "입니다");
		
		p.moveUp();
		System.out.println(p.toString() + "입니다");
		
		p.moveDown();
		p.move(10,10);
		System.out.println(p.toString() + "입니다");
		
		p.move(100,100,100);
		System.out.println(p.toString() + "입니다");
		
		Shape[] arr = { new Circle("Circle",5),
						new Rectangle("Rectangle",3,4),
						new Triangle("Triangle",5,5)
		};
		
		double sum = 0;
		
		for(Shape a : arr) {
			System.out.println(a.getname()+"면적 :" +a.getArea());
			sum += a.getArea();
		}
		System.out.println("면적읜 합은 :" +sum);
		
		long num1 = (long)3.14;
		System.out.println(num1);
		
	}

}

