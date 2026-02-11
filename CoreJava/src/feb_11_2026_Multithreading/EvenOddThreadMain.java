package feb_11_2026_Multithreading;

public class EvenOddThreadMain {
	public static void main(String[] args) throws InterruptedException {
		OddThread odd = new OddThread();
		EvenThread even = new EvenThread();
		even.start();
		even.join();

		odd.start();
		odd.join();
	}
}
