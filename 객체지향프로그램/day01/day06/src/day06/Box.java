package day06;

public class Box{
	private String cont;
	
	Box(String cont){
		this.cont = cont;
	}
	public String toString() {
		return cont;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder stb = new StringBuilder("12");
		stb.append(34);
		System.out.println(stb.toString());
		System.out.println(stb);
		
		Box box = new Box("camera");
		System.out.println(box.toString());
		System.out.println(box);
		
		
	}
}




