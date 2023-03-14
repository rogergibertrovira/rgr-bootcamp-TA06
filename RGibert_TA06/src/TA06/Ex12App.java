package TA06;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ex12App {

	public static void main(String[] args) {
		final int MIN = 1;
		final int MAX = 300;

		String tamañoS = JOptionPane.showInputDialog(null, "Introduce tamaño del array");
		int tamaño = Integer.parseInt(tamañoS);

		int array1[] = new int[tamaño];

		int digitoAcabado = digitoAcabado();

		rellenarArray(array1, MIN, MAX);

		int array2[] = filtrarArray(array1, digitoAcabado);

		mostrarArray(array1);
		mostrarArray(array2);
	}

	public static int digitoAcabado() {
		int digito;

		do {
			String digitoS = JOptionPane.showInputDialog(null, "Introduce un digito entre 0 y 9");
			digito = Integer.parseInt(digitoS);
		} while (digito < 0 && digito > 9);

		return digito;
	}

	public static int numeroAleatorio(int min, int max) {
		return (int) (Math.random() * (max - min + 1) + min);
	}

	public static void rellenarArray(int array[], int min, int max) {
		for (int i = 0; i < array.length; i++) {
			array[i] = numeroAleatorio(min, max);
		}
	}

	public static int[] filtrarArray(int array1[], int digitoAcabado) {
		int numeroAcabado = 0;
		for (int i = 0; i < array1.length; i++) {
			if(array1[i] % 10 == digitoAcabado)
				numeroAcabado++;
		}

		int array[] = new int[numeroAcabado];
		int pos = 0;
		
		for (int i = 0; i < array1.length; i++) {
			if(array1[i] % 10 == digitoAcabado) {
				array[pos] = array1[i];
				pos++;
			}
		}

		return array;
	}

	public static void mostrarArray(int array[]) {
		JOptionPane.showMessageDialog(null, "Array: " + Arrays.toString(array));
	}
}
