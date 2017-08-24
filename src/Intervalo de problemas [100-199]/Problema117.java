import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema117 {

	public static void main(String[] args) throws IOException {

		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

		int numero = Integer.parseInt(teclado.readLine());

		for (int i = 0; i < numero; i++) {
			String partes[] = teclado.readLine().split(" ");
			System.out.println("Hola, " + partes[1] + ".");
		}
	}
}