package com.epn;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Aplicacion {

	public static void main(String[] args) {
		 
	Lista lista = new Lista();
	Integer DatoB,DatoI;
	          
	String tecla = null;
	Scanner Teclado = new Scanner(System.in);	//ingreso de datos
	Scanner scanner = new Scanner (System.in);
	do {
		System.out.println("Menu de opciones");
		System.out.println("1.insertar al inicio ");
		System.out.println("2.insertar al final ");
		System.out.println("3.Eliminar");
		System.out.println("4.Buscar");
		System.out.println();
		System.out.println("Ingresar opcion:");
		
		int opcion = scanner.nextInt();
		boolean opc = (opcion <= 4);
			
		if (opc) {	
		switch (opcion) {
		
		case 1: System.out.println ("Que dato quieres insertar al frente de la Lista:  ");
         DatoI = new Integer(Teclado.nextInt());
         lista.insertarAlFrente(DatoI);
        break;
		case 2:System.out.println ("Que dato quieres insertar Atras de la Lista:  ");
         DatoI = new Integer(Teclado.nextInt());
         lista.insertarAtras(DatoI);
        break;
		case 3:System.out.println ("Que dato quieres Eliminar de la Lista: ");
         DatoB = new Integer(Teclado.nextInt());
         lista.eliminarNodo(DatoB);
        break;      
		case 4: System.out.println ("Que dato quieres buscar: ");
         DatoB = new Integer(Teclado.nextInt());
         System.out.println(lista.buscar(DatoB));
        break;
		}				
		System.out.print("\n¿Quiere seguir?\n");
		tecla = new Scanner(System.in).nextLine();
		}
		} while (tecla.equals("") || tecla.equals(""));
		}
	}