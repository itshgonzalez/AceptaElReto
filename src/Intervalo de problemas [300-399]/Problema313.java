import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema313 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

		int numero = Integer.parseInt(teclado.readLine());

		for (int i = 0; i < numero; i++) {

			String ingresos[] = teclado.readLine().split(" ");

			int resultado = Integer.parseInt(ingresos[0]) + Integer.parseInt(ingresos[1]);

			if (resultado >= 0) {
				System.out.println("SI");
			} else {
				System.out.println("NO");
			}
		}
	}
}