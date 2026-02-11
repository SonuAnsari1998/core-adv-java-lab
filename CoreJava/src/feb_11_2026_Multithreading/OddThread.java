package feb_11_2026_Multithreading;

public class OddThread extends Thread{
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		String threadNAme=t.getName();
		for(int i=1; i<=100; i++) {
			if (i % 2 != 0) {
				System.out.println(i + " by : " + threadNAme);
			}
		}
	}
}
