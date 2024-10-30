package Ud2;

public class DentroFuera {

	public static void main(String[] args) {
		HiloFor h1 = new HiloFor();
		h1.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Estoy fuera del hilo");
		}
	}
	

}
