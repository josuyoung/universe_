package day06;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ar1 = new int[5]; 			//���̰� 5�� int�� �迭
		double [] ar2 = new double[5];		//���̰� 5�� double�� �迭
		float [] ar3 = new float[5];		// ���̰� 5�� float�� �迭
		
		ar1[0] = 10;
		ar1[1] = 20;
		ar1[2] = 30;
		int num = ar1[0] + ar1[1]+ ar1[2];
	
		System.out.println(ar1.length + ar1.length + ar1.length + num);// ��������� ���� ���� �� �� �ִ�
		
		Box[] ar = new Box[3];
		ar[0] = new Box("first");
		ar[1] = new Box("second");
		ar[2] = new Box("Third");	//��ü���� ��� �ִ� �ּҸ� �迭�� �־� �ش�. 
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		
		String[] sr = new String[5];
		sr[0] = new String("java");
		sr[1] = new String("python");
		sr[2] = new String("CLaugauge");
		sr[3] = new String("javascript");
		sr[4] = new String("php");
		int sum = 0;
		for(int i = 0; i < sr.length; i++) {
			sum += sr[i].length();
			
// ===========================================================
			int[] arr = new int[5]; // 1��° ���
			int[] arr2 = new int[] {1,2,3}; // 2��° ���
			int[] arr3 = {1,2,3};	//3�� �� �� ����� �� ȿ�� �־� ���̳׿�
		}
	}

}
