package day06;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ar1 = new int[5]; 			//길이가 5인 int형 배열
		double [] ar2 = new double[5];		//길이가 5인 double형 배열
		float [] ar3 = new float[5];		// 길이가 5인 float형 배열
		
		ar1[0] = 10;
		ar1[1] = 20;
		ar1[2] = 30;
		int num = ar1[0] + ar1[1]+ ar1[2];
	
		System.out.println(ar1.length + ar1.length + ar1.length + num);// 멤버변수를 통해 값을 알 수 있다
		
		Box[] ar = new Box[3];
		ar[0] = new Box("first");
		ar[1] = new Box("second");
		ar[2] = new Box("Third");	//객체들을 담고 있는 주소를 배열의 넣어 준다. 
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
			int[] arr = new int[5]; // 1번째 방법
			int[] arr2 = new int[] {1,2,3}; // 2번째 방법
			int[] arr3 = {1,2,3};	//3번 재 이 방법이 젤 효율 있어 보이네요
		}
	}

}
