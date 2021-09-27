package ch03;

public class Calc {
	private int num1,num2,res;
	private char sign;
	
//	public Calc() {
//		num1 = n1; num2 = n2; sign = c;
//	}
	public void setValue(int n1,int n2, char c) {
		num1 = n1; num2 = n2; sign = c; 
			
		}
	
		
	
	public void result() {
		switch(sign) {
		case '+':
			System.out.println("result = "+ (num1+num2));
			break;
		case '-':
			System.out.println("result = "+ (num1-num2));
			break;
		case '*':
			System.out.println("result = "+ (num1*num2));
			break;
		case '/':
			System.out.println("result = "+ (num1/num2));
			break;
		default:
			System.out.println("잘못된 연산자 입니다");
			break;
	}
	}
	public int add() {return num1 + num2;}
	public int sub() {return num1 - num2;}
	public int mul() {return num1 * num2;}
	public int div() {return num1 / num2;}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc c = new Calc();
		
		 c.setValue(2, 5, '+');
		 c.result();
		 c.setValue(2, 5, '$');
		 c.result();
		 c.setValue(2, 5, '-');
		 c.result();
		 c.setValue(2, 5, '*');
		 c.result();
		 c.setValue(2, 5, '/');
		 c.result();


	}

}

