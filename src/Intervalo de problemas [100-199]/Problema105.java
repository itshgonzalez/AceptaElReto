import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema105 {
	
	static final BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {

		String in = entrada.readLine(); 

		String mayor = "", menor = "", total = "";
		float suma = 0, domingo = 0, minimo = Float.parseFloat(in), maximo = Float.parseFloat(in), ventas = 0;
		short counter = 0;

		while (in.charAt(0) != '-') {

			ventas = Float.parseFloat(in);

			if (ventas == maximo && counter != 0) {
				mayor = "EMPATE";
			} else if (ventas > maximo || ventas == maximo && counter == 0) {
				maximo = ventas;
				switch (counter) {
				case 0:
					mayor = "MARTES";
					break;
				case 1:
					mayor = "MIERCOLES";
					break;
				case 2:
					mayor = "JUEVES";
					break;
				case 3:
					mayor = "VIERNES";
					break;
				case 4:
					mayor = "SABADO";
					break;
				case 5:
					mayor = "DOMINGO";
					break;
				}
			}

			if (ventas == minimo && counter != 0) {
				menor = "EMPATE";
			} else if (ventas < minimo || ventas == minimo && counter == 0) {
				minimo = ventas;
				switch (counter) {
				case 0:
					menor = "MARTES";
					break;
				case 1:
					menor = "MIERCOLES";
					break;
				case 2:
					menor = "JUEVES";
					break;
				case 3:
					menor = "VIERNES";
					break;
				case 4:
					menor = "SABADO";
					break;
				case 5:
					menor = "DOMINGO";
					break;
				}
			}

			suma += ventas;

			if (counter == 5) {
				domingo = ventas;
				if (domingo > (suma / 6)) {
					total = "SI";
				} else {
					total = "NO";
				}

				System.out.println(mayor + " " + menor + " " + total);

				in = entrada.readLine();
				suma = 0;
				minimo = Float.parseFloat(in);
				maximo = Float.parseFloat(in);
				counter = 0;
			} else {
				in = entrada.readLine();
				counter++;
			}
		}
		entrada.close();
	}
}