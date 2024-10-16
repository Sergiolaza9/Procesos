package media;

import java.util.Scanner;

public class media {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int numero, total=0, contador=0;
	System.out.println("Hijo: Dame un numero");
	numero=sc.nextInt();
	System.out.println(numero);
	while(numero!=0) {
		total+=numero;
		System.out.println("Dime otro numero");
		if(numero!=0) {
			numero=sc.nextInt();
			System.out.println(numero);
			contador++;
			
		}
	}System.out.println(total/contador);
}
}

