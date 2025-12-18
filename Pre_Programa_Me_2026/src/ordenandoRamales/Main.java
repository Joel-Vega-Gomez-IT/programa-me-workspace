package ordenandoRamales;

//EMPEZADO: EL 17/12/25

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		while (true) {

			int num_ramales = Integer.parseInt(input.readLine());

			if (num_ramales == 0) { break; }

			Ramales[] array_ramales = new Ramales[num_ramales];

			for (int i = 0; i < num_ramales; i++) {

				String[] user_input = input.readLine().split(" ");
				array_ramales[i] = new Ramales(user_input[0], user_input[1], Integer.parseInt(user_input[2]));

			}
			
			for (int i = 0; i < array_ramales.length; i++) {

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
