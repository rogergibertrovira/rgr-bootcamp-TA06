package TA06;

import javax.swing.JOptionPane;

public class Ex3App {

	public static void main(String[] args) {
		String numeroS = JOptionPane.showInputDialog(null, "Introduce un numero");
		int numero = Integer.parseInt(numeroS);

		if (esPrimo(numero))
			JOptionPane.showMessageDialog(null, "El numero " + numero + " es primo");
		else
			JOptionPane.showMessageDialog(null, "El numero " + numero + " no es primo");
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
