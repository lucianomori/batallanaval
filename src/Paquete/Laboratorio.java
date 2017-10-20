package Paquete;

import java.util.*;

import java.util.Random; ///

public class Laboratorio {

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
			
			Jugador j = new Jugador();
			Tablero t = new Tablero();
			Barco b = new Barco();
			t.Inicializar();
			b.Generar();
			
			for (int x = 0; x < t.getTamaño(); x++) {
				System.out.print((x + 1) + " ");
				for (int y = 0; y < t.getTamaño(); y++) {
					if(b.getPosicionBarco(x, y)=="B"){
						System.out.print(b.getPosicionBarco(x, y) + " ");
					}else
						System.out.print(t.toString(x, y) + " ");
				}
				System.out.println();
			}
			
			int i = 461012;
			System.out.format("The value of i is: %d5%n", i);

//			/**
//			 * Create a random number that is greater than or equal to 0,
//			 * and less than 100. (It is set to run 20 tests.)
//			 */
//		
//			    // run 20 random examples
//			    int numTests = 20;
//
//			    // create a new Java Random object
//			    Random random = new Random();
//			    for ( int i=0; i<numTests; i++ )
//			    {
//			      // get the next random int
//			      int randomInt = random.nextInt(100);
//			      System.out.format("test %2d, randomInt = %d\n", i+1, randomInt ); //******UTIL PARA ALINEAR
//			    }
			

	}
}