package TA06;

import javax.swing.JOptionPane;

public class Ex6App {

	public static void main(String[] args) {
		int numero = -1;

		while (numero <= 0) {
			String numeroS = JOptionPane.showInputDialog(null, "Introduce un numero");
			numero = Integer.parseInt(numeroS);

			if (numero <= 0)
				JOptionPane.showMessageDialog(null, "El numero debe ser un entero positivo");
		}

		JOptionPane.showMessageDialog(null, "Numero de cifras en " + numero + ": " + cuentaCifras(numero));
	}

	public static int cuentaCifras(int num) {
		int numCifras = 0;

		while (num > 0) {
			num = num / 10;
			numCifras++;
		}

		return numCifras;
	}

}
