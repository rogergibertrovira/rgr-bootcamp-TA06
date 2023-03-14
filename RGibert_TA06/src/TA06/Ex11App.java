package TA06;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ex11App {

	public static void main(String[] args) {
		final int MIN = 1;
		final int MAX = 100;

		String tamañoS = JOptionPane.showInputDialog(null, "Introduce tamaño del array");
		int tamaño = Integer.parseInt(tamañoS);

		int array1[] = new int[tamaño];
		int array2[] = new int[tamaño];
		int array3[] = new int[tamaño];

		rellenarArray(array1, MIN, MAX);
		rellenarArrayConArray(array1, array2);

		array3 = multiplicacionArrays(array1, array2);
		mostrarArrays(array1, array2, array3);

	}

	public static int numeroAleatorio(int min, int max) {
		return (int) (Math.random() * (max - min + 1) + min);
	}

	public static void rellenarArray(int array[], int min, int max) {
		for (int i = 0; i < array.length; i++) {
			array[i] = numeroAleatorio(min, max);
		}
	}

	public static void rellenarArrayConArray(int array1[], int array2[]) {
		for (int i = 0; i < array1.length; i++) {
			int numAleatorio = numeroAleatorio(0, array1.length - 1);
			array2[i] = array1[numAleatorio];
		}
	}

	public static void mostrarArrays(int array1[], int array2[], int array3[]) {
		JOptionPane.showMessageDialog(null, "Array 1: " + Arrays.toString(array1));
		JOptionPane.showMessageDialog(null, "Array 2: " + Arrays.toString(array2));
		JOptionPane.showMessageDialog(null, "Array 3: " + Arrays.toString(array3));
	}

	public static int[] multiplicacionArrays(int array1[], int array2[]) {
		int array[] = new int[array1.length];

		for (int i = 0; i < array1.length; i++) {
			array[i] = array1[i] * array2[i];
		}

		return array;
	}
}
