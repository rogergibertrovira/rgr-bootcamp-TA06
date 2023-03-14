package TA06;

import javax.swing.JOptionPane;

public class Ex4App {

	public static void main(String[] args) {
		String numeroS = JOptionPane.showInputDialog(null, "Introduce un numero");
		double numero = Double.parseDouble(numeroS);

		JOptionPane.showMessageDialog(null, "El factorial de " + numero + " es " + factorial(numero));
	}

	public static double factorial(double num) {
		double fact = num;

		for (int i = (int) num - 1; i >= 1; i--) {
			fact = fact * i;
		}

		return fact;
	}
}
