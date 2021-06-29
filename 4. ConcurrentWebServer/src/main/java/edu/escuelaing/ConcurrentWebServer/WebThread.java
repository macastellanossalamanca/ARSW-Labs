package edu.escuelaing.ConcurrentWebServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class WebThread implements Runnable {
	Socket clientSocket = null;

	public WebThread(Socket clientSocket) {
		this.clientSocket = clientSocket;
	}

	@Override
	public void run() {
		System.out.println("Corriendo");
		try {
			
			PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
			BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
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
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				clientSocket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Cerrado");
		}
	}

	public String createResponse() {
		return "HTTP/1.1 200 OK\r\n" + "Content-Type: text/html\r\n" + "\r\n" + "<!DOCTYPE html>" + "<html>" + "<head>"
				+ "<meta charset=\"UTF-8\">" + "<title>Title of the document</title>\n" + "</head>" + "<body>"
				+ "My Web Site"
				+ "<img src='https://www.motofichas.com/images/phocagallery/Kawasaki/ninja-zx-6r-2020/01-kawasaki-ninja-zx-6r-2020-estudio-verde.jpg'"
				+ "</body>" + "</html>";
	}
}
