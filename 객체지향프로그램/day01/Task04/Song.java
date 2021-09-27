package ch03;

public class Song {
	private String title,artist,country;
	private int year;
	
	public Song(String t, String a , String c,int y) {
		title = t; artist = a;  country = c; year = y;
	}
	public void show() {
		System.out.println(year+"년 "+ country+"국정의 "+artist+"가 부른 "+title);
	}
	
	public static void main(String[] args) {
		Song abba = new Song("Dancing Queen","ABBA","스웨덴",1978);
		abba.show();
		
	}

}
