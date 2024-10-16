package media;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class medialanzador {
	public static void main(String[] args) {
		ProcessBuilder pb=new ProcessBuilder(args);
		InputStream is; 
		InputStreamReader isr;
		BufferedReader br;
		OutputStream os;
		OutputStreamWriter osr;
		PrintWriter pw;
		
		try {
			Process proceso=pb.start();
			is=proceso.getInputStream();
			isr= new InputStreamReader(is);
			br= new BufferedReader(isr);
			
			os=proceso.getOutputStream();
			osr= new OutputStreamWriter(os);
			pw= new PrintWriter(osr);
			
			Scanner sc=new Scanner(System.in);
			int total=0, numero, cont=0;
			System.out.println("Padre: Dime un numero");
			numero=sc.nextInt();
			while(numero!=0) {
				pw.println(numero);
				pw.flush();
				System.out.println("Dame otro numero");
				numero=sc.nextInt();
			}
			pw.println(numero);
			pw.flush();
			String linea;
			while((linea=br.readLine())!=null){
				System.out.println(linea);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
