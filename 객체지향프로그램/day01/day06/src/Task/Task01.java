package Task;

public class Task01 {

	public static void main(String[] args) {
		 int[][] a = { { 1, 2, 3 }, { 4, 5, 6 } };
		 int[][] b = { { 6, 3, 4 }, { 5, 1, 2 } };
		 int[][] c = new int[2][3];
		 Matrix mx = new Matrix();
		 System.out.println("��� a");
		 mx.printMatrix(a);
		 System.out.println("��� b");
		 mx.printMatrix(b);
		 System.out.println("��� c");
		 mx.addMatrix(a, b, c);
		 mx.printMatrix(c);
		 }

}
