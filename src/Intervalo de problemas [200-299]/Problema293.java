import java.util.Scanner;

public class Problema293 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int casos = entrada.nextInt();
		for (int i = 0; i < casos; i++) {

			int resultado = 0;
			int anillos = 0;
			int escalopendras = 0;

			for (int j = 0; j < 5; j++) {
				int n = entrada.nextInt();

				switch (j) {
				case 0:
					resultado += (n * 6);
					break;
				case 1:
					resultado += (n * 8);
					break;
				case 2:
					resultado += (n * 10);
					break;
				case 3:
					escalopendras = n;
					break;
				case 4:
					anillos = n * 2;
					break;

				}

				resultado += (anillos * escalopendras);

			}

			System.out.println(resultado);
		}

		entrada.close();
	}
}
