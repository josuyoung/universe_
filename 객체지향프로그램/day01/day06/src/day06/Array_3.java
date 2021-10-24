package day06;
import java.util.Arrays;


public class Array_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar1 = new int[10];
		int[] ar2 = new int[10];
		
		Arrays.fill(ar1, 7);	// 배열 ar1은 7로 초기화
		System.arraycopy(ar1, 0, ar2, 3, 4);	//ar1의 0idx값을 ar2에 3 idx부터 4개 진행
		
		for(int i = 0; i < ar1.length; i++) 
			System.out.print(ar1[i] + " ");
		System.out.println();
		for(int i = 0 ; i < ar2.length; i++) {
			System.out.print(ar2[i]+ " ");
			
//		// main함수 인자에 String[] 이 있는 이유
//		String[] arr = new String[] {"coffe","bread"};
//		main(arr);// 이런식으로 쓸 수 있기에 args는 매개변수		//run configuration에서 argument에 넣어 주면됌
//		
		for(i = 0; i < args.length; i++ ) {
			System.out.print(args[i]);
		}
	}
		
}
}

