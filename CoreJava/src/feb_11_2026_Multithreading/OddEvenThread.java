package feb_11_2026_Multithreading;

class Odd extends Thread {
	@Override
	public void run() {
		Thread thread = Thread.currentThread();
		String thredName = thread.getName();
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				System.out.println(i + " by " + thredName);
			}
		}
	}
}

public class OddEvenThread {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		String tname = t.getName();
		Odd o = new Odd();
		o.start();
		try {
			o.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " by " + tname);
			}
		}

	}
}
