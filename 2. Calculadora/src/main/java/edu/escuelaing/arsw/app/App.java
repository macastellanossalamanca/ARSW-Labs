package edu.escuelaing.arsw.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.DecimalFormat;

import edu.escuelaing.arsw.lista.Lista;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {
        try {
            Lista<Double> elementos;
            String sCadena;
            BufferedReader bf = new BufferedReader(new FileReader("prueba.txt"));
            double n;
            while ((sCadena = bf.readLine())!=null) {
                elementos = new Lista<Double>();
                String[] lista = sCadena.split(" ");
                for (String elemento: lista){
                    n = Double.parseDouble(elemento);
                    elementos.add(n);
                }
                calcular(elementos);
            }
            bf.close();
        }catch (Exception  e){
            
        }   
    }
    
    public static void calcular(Lista<Double> elementos){
        DecimalFormat formato = new DecimalFormat("#.##");
        double mean = Calculadora.mean(elementos);
        double deviation = Calculadora.deviation(elementos);
        System.out.println("Mean: " + formato.format(mean) + " Deviation: "+ formato.format(deviation));
    }
}
