package servidor;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import cliente.Cliente;

public class Servidor {
	
	private ArrayList<Socket> lista;
	
	public Servidor(int puerto) {
		int i = 0;
		lista = new ArrayList<Socket>();
		
		try {
			ServerSocket servidor = new ServerSocket(puerto);
			
			System.out.println("Servidor en Linea...");
			while(i < 100) {
				Socket cliente = servidor.accept();
				lista.add(cliente);
				new ServidorHilo(cliente, lista).start();
				i++;
			}
			
			servidor.close();
			System.out.println("El Servidor se ha cerrado");
			
		} catch (Exception e) {
			System.err.println("Ocurrio un problema con el Servidor");
		}
	}

	public static void main(String[] args) {
		
		new Servidor(40000);
	}
	
}

