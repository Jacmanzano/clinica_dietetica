import javax.swing.JOptionPane;

public class clinicaDietetica {
	public static void main(String[] args) {
		
		int num_pacientes = Integer.parseInt(JOptionPane.showInputDialog("Introduce el num de pacientes: "));
		Paciente[] pac_clinica= new Paciente[num_pacientes];
		
		for(int x= 0; x < num_pacientes; x++) {
			pac_clinica[x] = new Paciente();
			
			pac_clinica[x].obtenDatos();
			pac_clinica[x].calculaDatos();
			pac_clinica[x].muestraDatos(x);
		}
		
		//⬇️ SACAMOS LA MEDIA DE EDAD Y ESTATURA ⬇️
		double sumaPeso = 0;
		double sumaEstatura = 0;
		int edadMax = 0;
		int edadMin = 0;
		
		for(int x= 0; x < num_pacientes; x++) {
			sumaPeso += pac_clinica[x].peso;
			sumaEstatura += pac_clinica[x].estatura;
			
			if(pac_clinica[x].edad > edadMax) {
				pac_clinica[x].edad = edadMax;
			} else if (pac_clinica[x].edad < edadMax) {
				pac_clinica[x].edad = edadMin;
			}
			
		}
		double mediaPeso = sumaPeso / pac_clinica.length;
		double mediaEstatura = sumaEstatura / pac_clinica.length;
		
		JOptionPane.showMessageDialog(null,"RESULTADO FINAL:" + "\nLa media de Peso es: " + mediaPeso + "\nLa media de estatura es: " + mediaEstatura);
	}
}

//CARLOS MANZANO REGALADO 1º DAM
