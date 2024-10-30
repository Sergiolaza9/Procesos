package Ud2;

public class Tic extends Thread {
	public void run() {
		while (true) {
			System.out.println("Tic");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
