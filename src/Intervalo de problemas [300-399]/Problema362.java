import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema362 {
	public static void main(String[] args) throws IOException {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

		int casos = Integer.parseInt(teclado.readLine());

		for (int i = 0; i < casos; i++) {

			if (teclado.readLine().equals("25 12")) {
				System.out.println("SI");
			} else {
				System.out.println("NO");
			}
		}

	}
}