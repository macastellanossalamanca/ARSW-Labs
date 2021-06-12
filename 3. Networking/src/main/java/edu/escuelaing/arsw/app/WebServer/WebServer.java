package edu.escuelaing.arsw.app.WebServer;

import java.net.*;
import java.io.*;
import java.io.ObjectInputStream.GetField;
public class WebServer {
	private static WebServer _instance = new WebServer();
	
	private WebServer() {
	}
	
	private static WebServer getInstance() {
		return _instance;
	}
	
	public static void main(String[] args) throws IOException{
		WebServer.getInstance().iniciarServidor(args);
	}
	
	static boolean ejecutando = true;
	
	public void iniciarServidor(String[] args) throws IOException {
		
		
		while(ejecutando)
		{
			ServerSocket serverSocket = null;
	        try {
	            serverSocket = new ServerSocket(35000);
	        } catch (IOException e) {
	            System.err.println("Could not listen on port: 35000.");
	            System.exit(1);
	        }
	        Socket clientSocket = null;
	        try {
	            System.out.println("Listo para recibir ...");
	            clientSocket = serverSocket.accept();
	        } catch (IOException e) {
	            System.err.println("Accept failed.");
	            System.exit(1);
	        }
	        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
	        BufferedReader in = new BufferedReader(
	                new InputStreamReader(clientSocket.getInputStream()));
	        String inputLine, outputLine;
	        while ((inputLine = in.readLine()) != null) {
	            System.out.println("Received: " + inputLine);
	            if (!in.ready()) {
	                break;
	            }
	        }

	        outputLine = createResponse();

	        out.println(outputLine);

	        out.close();

	        in.close();

	        clientSocket.close();

	        serverSocket.close();
		}
		
	}
	
	public String createResponse() {
		return "HTTP/1.1 200 OK\r\n"
                + "Content-Type: text/html\r\n"
                + "\r\n"
                + "<!DOCTYPE html>"
                + "<html>"
                + "<head>"
                + "<meta charset=\"UTF-8\">"
                + "<title>Title of the document</title>\n" + "</head>"
                + "<body>"
                + "My Web Site"
                +"<img src='https://www.motofichas.com/images/phocagallery/Kawasaki/ninja-zx-6r-2020/01-kawasaki-ninja-zx-6r-2020-estudio-verde.jpg'"
                + "</body>"
                + "</html>" ;
	}
}