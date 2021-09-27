package ch03;

public class TV {
	private String brand;
	private int birth,size;
	

	public TV(String t,int b, int s) {
		brand = t;
		birth = b;
		size = s;
	}
	public void show() {
		System.out.println(brand+"에서 만든 "+birth+"년형 "+size+"인치 TV");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV myTv = new TV("Lg",2017,32);
		myTv.show();
	}


}
