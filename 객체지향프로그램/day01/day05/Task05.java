package day05;

public class Task05 {

	 public static void main(String args[]) {
		 ExId a = new ExId();
		 ExId b = new ExId();
		 ExId.setStep(3);
		 ExId c = new ExId();
		 ExId d = new ExId();
		 System.out.println("a의 식별 번호 : " + a.getId());
		 System.out.println("b의 식별 번호 : " + b.getId());
		 System.out.println("c의 식별 번호 : " + c.getId());
		 System.out.println("d의 식별 번호 : " + d.getId());
		 ExId.setStep(1);
		 int max = ExId.getMaxId();
		 System.out.println("마지막 부여한 식별 번호 : " + max);
		 System.out.println("다음에 부여할 식별 번호 : " +
		(max+ExId.getStep()));
		 }
}
