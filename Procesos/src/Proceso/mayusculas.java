package Proceso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class mayusculas {

    public static void main(String[] args) {
        ProcessBuilder pb;
        Process proceso;
        InputStream is;
        InputStreamReader isr;
        BufferedReader br;
        String line;

        try {
            // Iniciar el proceso con ProcessBuilder (ejecuta el comando pasado en args)
            pb = new ProcessBuilder(args);
            proceso = pb.start();

            // Obtener el InputStream del proceso (lo que el proceso hijo imprime)
            is = proceso.getInputStream();
            // Convertir el InputStream a InputStreamReader para leer texto
            isr = new InputStreamReader(is);
            // Envolver en BufferedReader para leer líneas
            br = new BufferedReader(isr);

            line=br.readLine();
            // Leer y mostrar la salida del proceso hijo
            while ((line = br.readLine()) != null) {
                // Imprimir cada línea de salida
                System.out.println(line);
            }

            // Cerrar recursos
            br.close();
            isr.close();
            is.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
