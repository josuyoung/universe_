package day04;

public class BankAccountPO {
	static int balance = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//참조변수 생성
		BankAccountPO yoon = new BankAccountPO();
		BankAccountPO park = yoon;
		
		//같은 객체에 추가
		park.deposit(50000);
		
		//객체에 입금
		yoon.deposit(10000);
		//객체 잔액 조회
		yoon.checkMyBalance();
		check(yoon);
		
		deposit(10000);
		checkMyBalance();
		withdraw(3000);
		checkMyBalance();
		
	}
	//동일 인스턴스 가르키는 참조변수 매개변수
	public static void check(BankAccountPO abc) {
		abc.withdraw(4444);
		abc.checkMyBalance();
	}
	public static int deposit(int amount) {
		balance += amount;
		return balance;
	}
	public static int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	public static int checkMyBalance() {
		System.out.println("잔액은 : " + balance);
		return balance;
	}

}
