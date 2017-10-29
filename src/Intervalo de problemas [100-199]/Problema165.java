import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema165 {
	
	static final BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	static final int j = 2;
	
	public static void main(String[] args) throws IOException {

		String numero = entrada.readLine();
		
		while (numero.charAt(0) != '-') {

			boolean equals = true;

			for (int i = 0; i < numero.length(); i++) {
				if (numero.charAt(i) % j != 0) {
					equals = false;
					break;
				}
			}

			if (equals) {
				System.out.println("SI");
			} else {
				System.out.println("NO");
			}

			numero = entrada.readLine();
		}
		entrada.close();
	}
}