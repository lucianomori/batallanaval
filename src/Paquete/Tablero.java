package Paquete;

public class Tablero {

	//public static void main(String[] args) { //No es MAIN ************************
		// TODO Auto-generated method stub

		private int tamaño = 10;
		private String[][] cuadricula = new String[tamaño][tamaño];
		
		public void Inicializar(){
			for(int i=0; i<cuadricula.length; i++){
				for(int j=0; j<cuadricula.length; j++)
					cuadricula[i][j] = "~";						
			}
		}
		public String toString(int x, int y){
			return cuadricula[x][y];
		}
		
		public int getTamaño(){
			return this.tamaño;
		}
			
}

