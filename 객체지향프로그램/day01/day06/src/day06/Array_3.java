package day06;
import java.util.Arrays;


public class Array_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar1 = new int[10];
		int[] ar2 = new int[10];
		
		Arrays.fill(ar1, 7);	// �迭 ar1�� 7�� �ʱ�ȭ
		System.arraycopy(ar1, 0, ar2, 3, 4);	//ar1�� 0idx���� ar2�� 3 idx���� 4�� ����
		
		for(int i = 0; i < ar1.length; i++) 
			System.out.print(ar1[i] + " ");
		System.out.println();
		for(int i = 0 ; i < ar2.length; i++) {
			System.out.print(ar2[i]+ " ");
			
//		// main�Լ� ���ڿ� String[] �� �ִ� ����
//		String[] arr = new String[] {"coffe","bread"};
//		main(arr);// �̷������� �� �� �ֱ⿡ args�� �Ű�����		//run configuration���� argument�� �־� �ָ��
//		
		for(i = 0; i < args.length; i++ ) {
			System.out.print(args[i]);
		}
	}
		
}
}

