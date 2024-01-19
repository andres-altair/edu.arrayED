package Servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz {
	Scanner scan = new Scanner(System.in);
	@Override
	public int menu() {
		System.out.println("0. cerrar menu");
		System.out.println("1. crear paciente");
		int elegida = scan.nextInt();
		return elegida;
	}
	
}
