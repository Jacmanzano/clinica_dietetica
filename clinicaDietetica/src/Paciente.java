import javax.swing.JOptionPane;

public class Paciente {
	String nombre;
	String estado_nutricional;
	int edad;
	double peso;
	double estatura;
	double imc;
	
	void obtenDatos() {
		nombre = JOptionPane.showInputDialog("Introduce tu nombre: ");
		edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad: "));
		peso = Double.parseDouble(JOptionPane.showInputDialog("Introduce tu peso: "));
		estatura = Double.parseDouble(JOptionPane.showInputDialog("Introduce tu estatura: "));
	}
	void calculaDatos() {
		imc = peso / (estatura * estatura);
		
		if(imc < 16) {
			estado_nutricional = "D GRADO 3";
		} else if(imc < 17) {
			estado_nutricional = "D GRADO 2";
		} else if(imc < 18.5) {
			estado_nutricional = "D GRADO 1";
		} else if(imc < 25) {
			estado_nutricional = "NORMAL";
		} else if(imc < 30) {
			estado_nutricional = "S GRADO 1";
		} else if(imc < 40) {
			estado_nutricional = "S GRADO 2";
		} else if(imc >= 40) {
			estado_nutricional = "S GRADO 3";
		}
	}
	void muestraDatos(int x) {
		JOptionPane.showMessageDialog(null, "Los datos de el paciente num: " + x + "\n Nombre: " + nombre + " \n IMC: " + imc + "\n ESTADO: " + estado_nutricional);
	}
}

//CARLOS MANZANO REGALADO 1º DAM
