package day04;

class SinivelCap {

	int num = 1;
	public static void main(String[] args) {
		ColdPatient suf = new ColdPatient();
		suf.takemedicine(new SinicelCap());

	}

}
class SinicelCap{
	void take() {
		System.out.println("콧물 ㅂㅇ");
	}
}
class SneezelCap{
	void take() {
		System.out.println("재체기 ㅂㅇ");
	}
}
class SnuffleCap{
	void take() {
		System.out.println("코막힘 ㅂㅇ");
	}
}
class ColdPatient{
	
	void takemedicine(SinicelCap cap) {
		cap.take();

	}

	void takemedicine(SneezelCap cap) {
		cap.take();
	}

	void takemedicine(SnuffleCap cap) {
		cap.take();

	}
}