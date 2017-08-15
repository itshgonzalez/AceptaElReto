import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AER_HyperPar {
	public static void main(String[] args) throws IOException {

		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

		String numero = teclado.readLine();
		int j = 2;
		while (numero.charAt(0) != '-') {

			boolean equals[] = new boolean[1];

			for (int i = 0; i < numero.length(); i++) {
				if (numero.charAt(i) % j == 0) {
					equals[0] = true;
				} else if (numero.charAt(i) % j != 0) {
					equals[0] = false;
					break;
				}
			}

			if (equals[0]) {
				System.out.println("SI");
			} else {
				System.out.println("NO");
			}

			numero = teclado.readLine();
		}
	}
}