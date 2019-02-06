package cenfotec.kata.Romanos;

import java.io.*;

public class KataRomanos {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintStream out = System.out;
	static ProcesadorRomano PC = new ProcesadorRomano();
	public static void main(String[] args) throws IOException {
		mostrarMenu();
		
	}
	//
	public static void mostrarMenu() throws java.io.IOException {
			        int opcion;
			        opcion = -1;
			        do {
			            out.println("---MENU PRINCIPAL---");
			            out.println("1. Ingresar números romanos");
			            out.println("Digite la opcion");
			            opcion = Integer.parseInt(in.readLine());
			            procesarOpcion(opcion);
			            out.println("La opcion ingresada fue: " + opcion);
			        } while (opcion != 9);
			    }
	
	public static void procesarOpcion(int pOpcion) throws IOException {
		
			        switch (pOpcion) {
		            case 1:
			            ingresarRomanos();
			                break;
		
		
			            default:
			                out.println("Opción inválida");
			        }
	}
	
	public static void ingresarRomanos () throws IOException {
		String num_romano;
		
		System.out.println("Ingrese un número romano, para ver su valor con numeros normales:");
		 num_romano = in.readLine();
		 
			
		 System.out.println("El valor del número romano es: " + num_romano + " = " + PC.logicaRomanosaNumeros(num_romano));
		 
		 
		
	}
	
}

