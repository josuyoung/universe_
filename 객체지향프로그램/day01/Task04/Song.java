package ch03;

public class Song {
	private String title,artist,country;
	private int year;
	
	public Song(String t, String a , String c,int y) {
		title = t; artist = a;  country = c; year = y;
	}
	public void show() {
		System.out.println(year+"�� "+ country+"������ "+artist+"�� �θ� "+title);
	}
	
	public static void main(String[] args) {
		Song abba = new Song("Dancing Queen","ABBA","������",1978);
		abba.show();
		
	}

}
