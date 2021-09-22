package ch02;

public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1 ,count = 0,num = 0;
		
		while(n <= 100) {
			
			if((n%9)==0 && ((n%8)==0)){
				break;
			}
			
			else if((n % 8)==0) {
				count++;
			}
			else if((n % 9)==0){
				num++;
			}
			n++;
		}
		System.out.println("8의배수 :"+count+"\n9의배수 :"+num);
	}

}
