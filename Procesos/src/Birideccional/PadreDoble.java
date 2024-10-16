package Birideccional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class PadreDoble {
public static void main(String[] args) {
	ProcessBuilder pb=new ProcessBuilder();
	Process proceso;
	InputStream is;
	InputStreamReader isr;
	BufferedReader br;
	// los creamos para controlar la entrada estandar del hijo
	OutputStream os;
	OutputStreamWriter osw;
	PrintWriter pw;
	String line;
	Scanner sc= new Scanner(System.in);
	System.out.println("Dame numero que quieras calcular doble");
	int num=sc.nextInt();
	try {
		proceso=pb.start();
		//lee la entrada estandar del padre y la vuelca en el buffer que leera el hijo con System.in
		
		os=proceso.getOutputStream();
		osw=new OutputStreamWriter(os);
		pw=new PrintWriter(osw);
		
		pw.println(num);
		pw.flush();
		
		is=proceso.getInputStream();
		isr=new InputStreamReader(is);
		br=new BufferedReader(isr);
		
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
		is.close();
		isr.close();
		br.close();
		pw.close();
		osw.close();
		os.close();
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	sc.close();
	
	
}
}
