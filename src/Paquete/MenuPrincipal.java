package Paquete;

import java.util.*;

public class MenuPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String[][] cuadricula = new String[10][10];

			System.out.println("   1 2 3 4 5 6 7 8 9 10");
			for(int i=0; i<cuadricula.length; i++){				
				System.out.print((i+1)+" ");
				for(int j=0; j<cuadricula.length;j++){		
					if((i+1)==10){
						System.out.print("~ ");
						continue;
					}
					System.out.print(" ~");
				}
				System.out.println();
			}

		

	}
}
