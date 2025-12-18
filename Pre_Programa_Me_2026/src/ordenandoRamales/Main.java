package ordenandoRamales;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		while (true) {

			int casosDePrueba = Integer.parseInt(entrada.readLine());

			if (casosDePrueba == 0)

				break;

			Ramales[] ramalesArr = new Ramales[casosDePrueba];

			for (int i = 0; i < casosDePrueba; i++) {

				String entradaUsuario = entrada.readLine();

				String[] entradaArr = entradaUsuario.split(" ");

				ramalesArr[i] = new Ramales(entradaArr[0], entradaArr[1], Integer.parseInt(entradaArr[2]));

			}

			for (int i = 0; i < ramalesArr.length; i++) {

			}

		}

	}

	public static class Ramales {

		private String nombre;

		private int distancia;

		private String tipo;

		public Ramales(String nombre, String tipo, int distancia) {

			this.nombre = nombre;

			this.distancia = distancia;

			this.tipo = tipo;

		}

		@Override

		public String toString() {

			return nombre;

		}

	}

}
