package day05_chap10;

class ClassVarAccess{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accessway way = new Accessway();
		way.num++;	//�ܺο��� �μ��Ͻ��� �̸��� ���� ����
		Accessway.num++;	//�ܺο��� Ŭ�������� ���� ����		�� ����� ���� ���� �ֳ��ϸ� Ŭ�����̸����� �����ؾ� 
														// static���� �˼� �ִ� �ֳ��ϸ� Ŭ���������⿡ Ŭ���������� ����
		System.out.println("num����"+Accessway.num);
		
	}
}