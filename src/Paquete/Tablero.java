package Paquete;

public class Tablero {

	private String[][] cuadricula = new String[11][11];
	
	System.out.println("Hola");
	
	public void GenerarTablero(){
		for(int i=0; i<cuadricula.length; i++){
			for(int j=0; j<cuadricula.length;j++){				
				System.out.println("~");
			}
		}
			
		
	}
	
}
