package TA06;

import javax.swing.JOptionPane;
import java.util.*;

public class Ex2App {

	public static void main(String[] args) {
		String cantidadNumerosS = JOptionPane.showInputDialog(null,
				"Introduce cuantos numeros aleatorios quieres generar");
		int cantidadNumeros = Integer.parseInt(cantidadNumerosS);

		String minimoS = JOptionPane.showInputDialog(null, "Introduce el valor minimo que se puede generar");
		int minimo = Integer.parseInt(minimoS);

		String maximoS = JOptionPane.showInputDialog(null, "Introduce el valor maximo que se puede generar");
		int maximo = Integer.parseInt(maximoS);

		int numerosAleatorios[] = new int[cantidadNumeros];

		for (int i = 0; i < cantidadNumeros; i++) {
			numerosAleatorios[i] = numeroAleatorio(minimo, maximo);
		}
		JOptionPane.showMessageDialog(null, "Los numeros aleatorios son: " + Arrays.toString(numerosAleatorios));
	}

	public static int numeroAleatorio(int min, int max) {
		return (int) (Math.random() * (max - min + 1) + min);
	}
}
