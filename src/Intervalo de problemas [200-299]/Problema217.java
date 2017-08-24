import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema217 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		int numero = Integer.parseInt(entrada.readLine());

		while (numero > 0) {

			if (numero % 2 == 0) {
				System.out.println("DERECHA");
			} else {
				System.out.println("IZQUIERDA");
			}
			
			numero = Integer.parseInt(entrada.readLine());
		}
	}
}