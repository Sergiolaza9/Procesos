package media;

import java.util.Scanner;

public class media {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int numero, total=0, contador=0;
	numero=sc.nextInt();
	while(numero!=0) {
		total+=numero;
		if(numero!=0) {
			numero=sc.nextInt();
			contador++;
			
		}
	}System.out.println(total/contador);
	sc.close();
}
}

