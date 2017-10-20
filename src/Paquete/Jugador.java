package Paquete;

public class Jugador {


	// TODO Auto-generated method stub
	private int dificultad;
	private int bombas;
	private int barcoshundidos =0; // debería ser INT. Pero por ahora es BOOLEAN para probar
	private int[][] ataque = new int[2][2];
	int X;
	int Y;
	
	public Jugador(){		
	}

	public Jugador(int dificultad, int bombas, int barcoshundidos) {
		//super();
		this.dificultad = dificultad;
		this.bombas = bombas;
		this.barcoshundidos = barcoshundidos;
	}

	public int getDificultad() {
		return dificultad;
	}

	public boolean setDificultad(int dificultad) {
		if(dificultad>0 && dificultad<4){
			this.dificultad = dificultad;
				switch(this.dificultad){
				case 1:
					setBombas(5);
					 break;
				case 2:
					setBombas(3);
					break;
				case 3:
					setBombas(2);
					break;					 
				}
			return true;
		}else{
			return false;
		}
	}

	public int getBombas() {
		return bombas;
	}
	public void restarBombas(){
		this.bombas = bombas -1;
	}

	public void setBombas(int bombas) {
		this.bombas = bombas;
	}

	public int getBarcoshundidos() {
		//return barcoshundidos;
		return barcoshundidos;
	}

	public void setBarcoshundidos(boolean hundido) {
		if(hundido)
			this.barcoshundidos += barcoshundidos;
	}
	
	public boolean setAtaque(int x, int y) {
		if(x>=0 && x<2 && y>=0 && y<2){
			this.ataque[x][y] = ataque[x][y];
			setX(x);
			setY(y);
			return true;
		}else
			return false;
		
	}
	
	public int getAtaque(int x, int y){
		return ataque[x][y];
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


