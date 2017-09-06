import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema247 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		int cantidad = Integer.parseInt(entrada.readLine());

		while (cantidad > 0) {

			String linea = entrada.readLine();
			String PartsOfLine[] = linea.split(" ");

			boolean crecimiento = true;
			for (int i = 0; i < cantidad - 1; i++) {

				int before = Integer.parseInt(PartsOfLine[i]);
				int after = Integer.parseInt(PartsOfLine[i + 1]);

				if (before >= after) {
					crecimiento = false;
					break;
				}

			}

			if (crecimiento) {
				System.out.println("SI");
			} else {
				System.out.println("NO");
			}

			cantidad = Integer.parseInt(entrada.readLine());
		}

	}
}
