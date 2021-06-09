package edu.escuelaing.arsw.app.Calculadora;

import java.net.*;
import java.io.*;

public class CalculateServer {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(35000);
		} catch (IOException e) {
			System.err.println("Could not listen on port: 35000.");
			System.exit(1);
		}
		Socket clientSocket = null;
		try {
			clientSocket = serverSocket.accept();
		} catch (IOException e) {
			System.err.println("Accept failed.");
			System.exit(1);
		}
		PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
		BufferedReader in = new BufferedReader(
				new InputStreamReader(
						clientSocket.getInputStream()));
		String inputLine, outputLine;
		String OpActual = "Cos";
		while ((inputLine = in.readLine()) != null) {
			System.out.println("Mensaje:" + inputLine);
			if(inputLine.startsWith("fun")) {
				String[] datos = inputLine.split(":");
				OpActual = datos[1].toLowerCase();
				outputLine = "La operación ha sido cambiada con éxito";
			}
			else {
				outputLine = "El " + OpActual + " de " + inputLine + " es: "+String.valueOf(Math.cos(Double.parseDouble(inputLine))) ;
				if (OpActual.equals("sin"))
				{
					outputLine = "El " + OpActual + " de " + inputLine + " es: "+String.valueOf(Math.sin(Double.parseDouble(inputLine))) ;
				}
				else if (OpActual.equals("tan"))
				{
					outputLine = "El " + OpActual + " de " + inputLine + " es: "+String.valueOf(Math.tan(Double.parseDouble(inputLine))) ;
				}

				
			}
			out.println(outputLine);
		}
		out.close();
		in.close();
		clientSocket.close();
		serverSocket.close();
	}
}
