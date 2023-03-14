package TA06;

import javax.swing.JOptionPane;

public class Ex9App {

	public static void main(String[] args) {
		String tamañoS = JOptionPane.showInputDialog(null, "Introduce tamaño del array");
		int tamaño = Integer.parseInt(tamañoS);

		int valores[] = new int[tamaño];

		String minimoS = JOptionPane.showInputDialog(null, "Introduce el valor minimo que se puede generar");
		int minimo = Integer.parseInt(minimoS);

		String maximoS = JOptionPane.showInputDialog(null, "Introduce el valor maximo que se puede generar");
		int maximo = Integer.parseInt(maximoS);

		rellenarValores(valores, minimo, maximo);
		mostrarValoresSuma(valores);
	}

	public static int numeroAleatorio(int min, int max) {
		return (int) (Math.random() * (max - min + 1) + min);
	}

	public static void rellenarValores(int valores[], int min, int max) {
		for (int i = 0; i < valores.length; i++) {
			valores[i] = numeroAleatorio(min, max);
		}
	}

	public static void mostrarValoresSuma(int valores[]) {
		int sumaValores = 0;
		for (int i = 0; i < valores.length; i++) {
			JOptionPane.showMessageDialog(null, "Indice: " + (i + 1) + " / Valor: " + valores[i]);
			sumaValores += valores[i];
		}
		JOptionPane.showMessageDialog(null, "Suma de los valores: " + sumaValores);
	}

}
