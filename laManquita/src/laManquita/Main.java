package laManquita;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		final String[] letras = {"A", "B", "C", "D", "E", "F" ,"G" ,"H", "I", "J", "K", "L", "M" ,"N" ,"O", "P", "Q", "R", "S", "T" ,"U" ,"V", "W", "X", "Y", "Z"};
		
		String entradaUsuario;
//		JIJIJIJAAAA!!!!
		do {
			entradaUsuario = entrada.readLine();
		} while (entradaUsuario.length() > 200);
		
		int llargTotal = entradaUsuario.length()/2;
		
		

		int contadorDeLetraMasRepetida=0;
		int aux=0;
		
		for (int i=0; i < letras.length; i++) {
			aux = 0;
			for (int j=0; j < entradaUsuario.length(); j++) {
				if (letras[i].equals(String.valueOf(entradaUsuario.charAt(j)))) {
					aux += 1;
				}
			}
			
			
			if (contadorDeLetraMasRepetida < aux) {
				contadorDeLetraMasRepetida = aux;
				aux = 0;
			}
		}
		
		
		
		if ((contadorDeLetraMasRepetida+1)==llargTotal) {
			System.out.println("Si");
		} else if (contadorDeLetraMasRepetida==llargTotal) {
			System.out.println("Si");
		} else if ((contadorDeLetraMasRepetida-1)==llargTotal) {
			System.out.println("Si");
		} else {
			System.out.println("No");
		}
		
	}

}