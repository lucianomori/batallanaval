package Paquete;

import java.util.Random;

public class Barco {
	private int tamañoBarco = 2;
	private String[][] posicionBarco = new String[tamañoBarco][tamañoBarco];
	Random random = new Random();
	int randomInt1 = random.nextInt(2);
	int randomInt2 = random.nextInt(2);
	int X;
	int Y;
	
	public void Generar(){
		for(int i=0; i<posicionBarco.length; i++){
			for(int j=0; j<posicionBarco.length; j++){
				posicionBarco[randomInt1][randomInt2]= "B";	
				if(posicionBarco[1][0] == "B" || posicionBarco[0][1] == "B" || posicionBarco[1][1] == "B" ||posicionBarco[0][0] == "B"){					
					setPosicionBarco(randomInt1, randomInt2);
					break;	
				}
			}							
		}	
	}	
	
	public void setPosicionBarco(int x, int y) {
		this.posicionBarco[x][y] = posicionBarco[x][y];
	}
	
	public String getPosicionBarco(int x, int y){
		return posicionBarco[x][y];
	}

	public int getX() {
		return X;
	}

	public void setX(int x) {
		X = x;
	}

	public int getY() {
		return Y;
	}

	public void setY(int y) {
		Y = y;
	}
	
}
