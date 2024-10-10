package Proceso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class main {
public static void main(String[] args) {
	ProcessBuilder pb=new ProcessBuilder(args);
	Process proceso;
	InputStream is;
	InputStreamReader isr;
	BufferedReader br;
	String lectura;
	
	try {
		proceso=pb.start();
		is=proceso.getInputStream();
		isr=new InputStreamReader(is);
		br=new BufferedReader(isr);
		lectura=br.readLine();
		while (lectura!=null) {
			System.out.println(lectura);
			lectura=br.readLine();
		}
		br.close();
		isr.close();
		is.close();
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
