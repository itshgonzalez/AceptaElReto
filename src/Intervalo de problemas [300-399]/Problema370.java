import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema370 {

	static final BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

	static int ladoIzquierdo;
	static int ladoDerecho;

	public static void main(String[] args) throws NumberFormatException, IOException {

		int casos = Integer.parseInt(entrada.readLine());

		for (int i = 0; i < casos; i++) {
			
			String llave[] = entrada.readLine().split("-");
			ladoIzquierdo = Integer.parseInt(llave[0]);
			ladoDerecho = Integer.parseInt(llave[1]);

			if (ladoDerecho < ladoIzquierdo) {
				int aux = ladoDerecho;
				ladoDerecho = ladoIzquierdo;
				ladoIzquierdo = aux;
			}

			if (ladoIzquierdo % 2 == 0 && (ladoIzquierdo + 1) == ladoDerecho) {
				System.out.println("SI");
			} else {
				System.out.println("NO");
			}

		}
		entrada.close();
	}
}