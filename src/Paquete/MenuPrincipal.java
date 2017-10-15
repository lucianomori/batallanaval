package Paquete;

import java.util.*;

public class MenuPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String[][] cuadricula = new String[10][10];

			System.out.println(" Y 0 1 2 3 4 5 6 7 8 9");
			System.out.println("X");

			for(int i=0; i<cuadricula.length; i++){
				System.out.print((i)+"  ");
				for(int j=0; j<cuadricula.length;j++){				
					System.out.print("~ ");
				}
				System.out.println();
			}

		

	}
}
