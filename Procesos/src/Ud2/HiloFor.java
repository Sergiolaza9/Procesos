package Ud2;

public class HiloFor extends Thread {

	public void run() {
		for (int i=0; i<10;i++) {
			System.out.println("Estoy dentro del hilo");
		}
	}

	public static void main(String[] args) {
		HiloFor h1=new HiloFor();
		h1.start();
	}
}
