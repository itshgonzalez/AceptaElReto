import java.util.Scanner;

public class Problema155 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int a = entrada.nextInt();
		int b = entrada.nextInt();

		while (a >= 0 && b >= 0) {

			int resultado = 0;

			resultado += (a * 2 + b * 2);

			System.out.println(resultado);

			a = entrada.nextInt();
			b = entrada.nextInt();
		}

		entrada.close();
	}
}
