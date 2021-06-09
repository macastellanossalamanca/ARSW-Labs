package edu.escuelaing.arsw.app;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Miguel Castellanos!
 * Desarrollado en clase
 */
public class URLReader 
{
    public static void main( String[] args ) throws MalformedURLException
    {
        URL url = new URL("https://ldbn.is.escuelaing.edu.co:80/there?name=ferret");
        System.out.println("Protocolo: " + url.getProtocol());
        System.out.println("Authority: " + url.getAuthority());
        System.out.println("Host: " + url.getHost());
        System.out.println("Port: " + url.getPort());
        System.out.println("Path: " + url.getPath());
        System.out.println("Query: " + url.getQuery());
        System.out.println("File: " + url.getFile());
        System.out.println("Ref: " + url.getRef());
    }
}
