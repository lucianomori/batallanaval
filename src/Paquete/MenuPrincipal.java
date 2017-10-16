package Paquete;

import java.util.*;

public class MenuPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leerstr = new Scanner(System.in);
		Scanner leerint = new Scanner(System.in);
		Jugador j = new Jugador();
		Tablero t = new Tablero();
		Barco b = new Barco();
		t.Inicializar();
		b.Generar();

		do{   
			System.out.println("Bienvenido a la Batalla Naval\n\t Elija la dificultad:\n\t\t1 - Baja  (5 bombas)\n\t\t2 - Media (3 bombas)\n\t\t3 - Alta  (2 bombas)");
		}while(!j.setDificultad(leerint.nextInt())); //Valida 1, 2 o 3
		
		System.out.println("Comenzas con "+j.getBombas()+" bombas.\n\tGanás al hundir los 4 barcos.\n\t\tSUERTE!");
	
	//Comienzan los turnos
		do{ 
			//Imprimir tablero
			System.out.println("  1 2");
			for (int x = 0; x < t.getTamaño(); x++) {
				System.out.print((x + 1) + " ");
				for (int y = 0; y < t.getTamaño(); y++) {
					if(b.getPosicionBarco(x, y)=="B"){
						b.setX(x);
						b.setY(y);
						System.out.print(b.getPosicionBarco(x, y) + " ");
					}else
						System.out.print(t.toString(x, y) + " ");
				}
				System.out.println();
			}
			
			do{
			System.out.println("Ingrese coordenadas (X,Y) de ataque");
			}while(!j.setAtaque((leerint.nextInt()-1),(leerint.nextInt()-1)));
			//j.setAtaqueY(leerint.nextInt());	
			
			if((j.getX()==b.getX())&&(j.getY()==b.getY())){
				j.setBarcoshundidos(true);
				System.out.println("GANASTE!");
			}
			j.restarBombas();
			System.err.println("Te quedan "+j.getBombas()+" bombas");
			//java.awt.Toolkit.getDefaultToolkit().beep(); //sonidito
			
		}while(!j.getBarcoshundidos() && j.getBombas()!=0);
		//}while(!j.getBarcoshundidos() || (j.getBombas()!=0));
		
		System.out.println("-GAME OVER-");
	}

}
