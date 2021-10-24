package Task;

public class Matrix {

	public void addMatrix(int[][] x, int[][] y, int[][] z) {
		// TODO Auto-generated method stub

		for(int i = 0; i <x.length; i++) 
			for(int j = 0; j < x[i].length; j++) 
				z[i][j] = x[i][j] + y[i][j];
			
		
	}
	public static void printMatrix(int[][] n) {
		for ( int i = 0; i < n.length; i++) {
			for(int j = 0; j < n[i].length; j++) 
				System.out.print(n[i][j] + " ");
			System.out.println();
		}
		System.out.println();
		
	}

}
