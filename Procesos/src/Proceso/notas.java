package Proceso;

import java.io.IOException;

public class notas {
	public static void main(String[] args) {

		try {
			Runtime.getRuntime().exec("notepad.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Fin ejecuccion");

	}
}
