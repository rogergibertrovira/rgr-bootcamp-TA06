package TA06;

import javax.swing.JOptionPane;

public class Ex8App {

	public static int valores[] = new int[10];

	public static void main(String[] args) {
		rellenarValores();
		mostrarValores();
	}

	public static void rellenarValores() {
		for (int i = 0; i < valores.length; i++) {
			String numS = JOptionPane.showInputDialog(null, "Introduce un numero");
			int num = Integer.parseInt(numS);
			valores[i] = num;
		}
	}

	public static void mostrarValores() {
		for (int i = 0; i < valores.length; i++)
			JOptionPane.showMessageDialog(null, "Indice: " + (i + 1) + " / Valor: " + valores[i]);
	}
}
