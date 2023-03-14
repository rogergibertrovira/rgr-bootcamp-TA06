package TA06;

import javax.swing.JOptionPane;

public class Ex7App {

	public static void main(String[] args) {
		String cantidadS = JOptionPane.showInputDialog(null, "Introduce una cantidad de euros");
		double cantidad = Double.parseDouble(cantidadS);

		String divisa = JOptionPane.showInputDialog(null, "Introduce una divisa (dolar / yen / libra)");

		conversorDivisas(cantidad, divisa);
	}

	public static void conversorDivisas(double cant, String div) {
		final double EUROADOLAR = 1.28611;
		final double EUROAYEN = 129.852;
		final double EUROALIBRA = 0.86;

		double cantidadConvertida = 0;

		switch (div) {
			case "dolar":
				cantidadConvertida = cant * EUROADOLAR;
				break;
			case "yen":
				cantidadConvertida = cant * EUROAYEN;
				break;
			case "libra":
				cantidadConvertida = cant * EUROALIBRA;
				break;
		}

		JOptionPane.showMessageDialog(null, cant + " euros son " + cantidadConvertida + " " + div);
	}

}
