package day05_chap11;

class Park {
	private int passNum;
	private int resiNum;
	
	// �޼ҵ� ������ �������̵�
	Park(int pNum, int rNum){
		passNum = pNum;
		resiNum = rNum;
	}
//	PerSon(int rNum){
//		passNum = 0;
//		resiNum = rNum;
//	}
	//���� ���
	Park(int rNum){
		this(0,rNum);
	}
	
	public void printNum() {
		System.out.println("passNum" + "resiNum");
	}
	
}


public class Person{
	
	public static void main(String[] args) {
		//�ֹι�ȣ ���ǹ�ȣ ��� �ִ°��
		Park a = new Park(123123,123123);
		// �ֹι�ȣ�� �ִ°��
		Park b = new Park(125123);
		b.printNum();
		//concat �ٿ��ֱ�
		//substirng(2,4) 2���ε������� 4��������
		String birth = (new StringBuilder("<��>").append('.').append(18).append("������")).toString();

		System.out.println(birth);
	}
	
}