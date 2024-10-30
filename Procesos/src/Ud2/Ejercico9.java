package Ud2;

public class Ejercico9 {
	public static void main(String[] args) {
		String[] nombres = { "Papá", "pitufo", "Pitufina", "Filósofo", "Pintor", "Gruñón", "Bromista", "Dormilón",
				"Tímido", "Tontín", "Bonachón", "Romántico" };
		for (String nombre : nombres) {
			new Thread(new Pitufo(nombre)).start();
		}
	}
}

class Pitufo implements Runnable{
	private String nombre;
	
	public Pitufo(String nombre) {
		this.nombre=nombre;
	}
	
	public void run() {
		for (int i=0; i<=3;i++) {
			System.out.println(nombre+" come el "+i+" pan con queso");
		}System.out.println(nombre+" termino de comer");
	}
}
