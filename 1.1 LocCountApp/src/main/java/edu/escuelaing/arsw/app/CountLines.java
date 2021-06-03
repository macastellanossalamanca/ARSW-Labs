package edu.escuelaing.arsw.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * This program counts lines in source code files
 */
public class CountLines 
{
	public static void main( String[] args )
	{
		String typeOfCount = args[0];
		String fileName = args[1];
		String nombreFich = "../1.1 LocCountApp/src/main/java/edu/escuelaing/arsw/app/CountLines.java";
		File fichero = new File(nombreFich);

		try {
			BufferedReader br = new BufferedReader(new FileReader(nombreFich));
			int contadorLoc = 0;
			int contadorPhy = 0;
			String linea = "";

			while((linea = br.readLine()) != null){
				contadorPhy++;
				linea = linea.trim();
				if ("".equals(linea) || linea.startsWith("//")|| linea.startsWith("{") || linea.startsWith("}") || linea.startsWith("/*") || linea.startsWith("*/") || linea.startsWith("*")) 
				{
					contadorLoc++;
				}
			}
			
			if(typeOfCount.toLowerCase().equals("phy"))
			{
				System.out.println( "Type of count: " + typeOfCount );
				System.out.println( "File name: : " + fileName );
				System.out.println( "Lineas físicas: " + String.valueOf(contadorPhy));
			}
			else if(typeOfCount.toLowerCase().equals("loc")){
				System.out.println( "Type of count: " + typeOfCount );
				System.out.println( "File name: : " + fileName );
				System.out.println( "Lineas de código: " + String.valueOf(contadorLoc));
			}
			
			System.out.println(typeOfCount);
		} 
		catch (Exception e) {

		}
	}
}