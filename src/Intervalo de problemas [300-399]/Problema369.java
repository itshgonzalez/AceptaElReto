import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema369 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		short casos = Short.parseShort(entrada.readLine());

		while (casos > 0) {

			String suma = "";

			for (short i = 0; i < casos; i++) {
				suma += 1;
			}

			System.out.println(suma);
			casos = Short.parseShort(entrada.readLine());
		}
	}
}
