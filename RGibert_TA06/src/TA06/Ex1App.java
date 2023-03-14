package TA06;

import javax.swing.JOptionPane;

public class Ex1App {

	public static void main(String[] args) {
		String figura = JOptionPane.showInputDialog(null, "Introduce el nombre de la figura para calcular su area");
		double area = 0.0;

		switch (figura) {
		case "circulo":
			area = areaCirculo();
			break;
		case "cuadrado":
			area = areaCuadrado();
			break;
		case "triangulo":
			area = areaTriangulo();
			break;
		}

		JOptionPane.showMessageDialog(null, "El area del " + figura + " es: " + area);
	}

	public static double areaCirculo() {
		double area = 0.0;
		final double PI = 3.14;

		String radioS = JOptionPane.showInputDialog(null, "Introduce el radio del circulo");
		double radio = Double.parseDouble(radioS);

		area = Math.pow(radio, 2) * PI;

		return area;
	}

	public static double areaCuadrado() {
		double area = 0.0;

		String ladoS = JOptionPane.showInputDialog(null, "Introduce el lado del cuadrado");
		double lado = Double.parseDouble(ladoS);

		area = lado * lado;

		return area;
	}

	public static double areaTriangulo() {
		double area = 0.0;

		String baseS = JOptionPane.showInputDialog(null, "Introduce la base del triangulo");
		double base = Double.parseDouble(baseS);

		String alturaS = JOptionPane.showInputDialog(null, "Introduce la altura del triangulo");
		double altura = Double.parseDouble(alturaS);

		area = (base * altura) / 2;

		return area;
	}

}
