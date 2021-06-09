package edu.escuelaing.arsw.app;

import java.io.*;
import java.net.*;

/**
 * Miguel Castellanos!
 * Desarrollado en clase
 */
public class URLFile {

	public static void main(String[] args) throws Exception {
		URL google = new URL("http://www.google.com/");
		try (BufferedReader reader
				= new BufferedReader(new InputStreamReader(google.openStream()))) {
			String inputLine = null;
			while ((inputLine = reader.readLine()) != null) {
				System.out.println(inputLine);
			}
		} catch (IOException x) {
			System.err.println(x);
		}
	}
}
