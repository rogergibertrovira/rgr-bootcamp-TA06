package TA06;

import javax.swing.JOptionPane;

public class Ex10App {

	public static void main(String[] args) {
		String tamañoS = JOptionPane.showInputDialog(null, "Introduce tamaño del array");
		int tamaño = Integer.parseInt(tamañoS);

		int valores[] = new int[tamaño];

		String minimoS = JOptionPane.showInputDialog(null, "Introduce el valor minimo que se puede generar");
		int minimo = Integer.parseInt(minimoS);

		String maximoS = JOptionPane.showInputDialog(null, "Introduce el valor maximo que se puede generar");
		int maximo = Integer.parseInt(maximoS);

		rellenarValores(valores, minimo, maximo);
		mostrarMayor(valores);
	}

	public static void mostrarMayor(int valores[]) {
		int max = 0;

		for (int i = 0; i < valores.length; i++) {
			if (valores[i] > max)
				max = valores[i];
		}

		JOptionPane.showMessageDialog(null, "El numero mayor del array es: " + max);
	}

	public static void rellenarValores(int valores[], int min, int max) {
		for (int i = 0; i < valores.length; i++) {
			valores[i] = numeroAleatorioPrimo(min, max);
		}
	}

	public static int numeroAleatorioPrimo(int min, int max) {
		int numAleatorio = (int) (Math.random() * (max - min + 1) + min);

		while (!esPrimo(numAleatorio)) {
			numAleatorio = (int) (Math.random() * (max - min + 1) + min);
		}

		return numAleatorio;
	}

	public static boolean esPrimo(int num) {
		boolean esPrimo = true;

		if (num <= 1)
			esPrimo = false;
		else {
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					esPrimo = false;
				}
			}
		}
		return esPrimo;
	}
}
