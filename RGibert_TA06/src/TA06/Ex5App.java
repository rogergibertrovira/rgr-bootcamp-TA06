package TA06;

import javax.swing.JOptionPane;

public class Ex5App {

	public static void main(String[] args) {
		String numeroS = JOptionPane.showInputDialog(null, "Introduce un numero");
		int numero = Integer.parseInt(numeroS);

		JOptionPane.showMessageDialog(null, numero + " en binario es " + conversorBinario(numero));
	}

	public static String conversorBinario(int num) {
		String numBin = "";

		while (num > 0) {
			numBin = num % 2 + numBin;
			num = num / 2;

		}

		return numBin;
	}
}
