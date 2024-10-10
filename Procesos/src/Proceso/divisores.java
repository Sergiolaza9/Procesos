package Proceso;

public class divisores {
	public static void main(String[] args) {
		int divisor = 0;
		int num = 0;
		if (args.length == 0) {
			System.out.println("No se han pasado argumentos");
		} else {
			num = Integer.parseInt(args[0]);
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					divisor++;
				}
			}

		}
		System.out.println(num + " Tiene " + divisor + " divisores");

	}
}
