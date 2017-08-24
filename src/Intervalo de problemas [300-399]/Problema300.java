import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problema300 {
	public static void main(String[] args) throws Exception {

		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		int length = 0;
		char character = ' ';

		length = Integer.parseInt(entrada.readLine());

		boolean vocales[] = new boolean[5];

		String palabras[] = new String[length];

		for (int i = 0; i < length; i++) {
			palabras[i] = entrada.readLine();
		}

		for (int i = 0; i < length; i++) {
			for (int j = 0; j < palabras[i].length(); j++) {
				character = palabras[i].charAt(j);
				switch (character) {
				case 'a':
					vocales[0] = true;
					break;
				case 'e':
					vocales[1] = true;
					break;
				case 'i':
					vocales[2] = true;
					break;
				case 'o':
					vocales[3] = true;
					break;
				case 'u':
					vocales[4] = true;
					break;
				default:
					break;
				}
			}

			if (vocales[0] && vocales[1] && vocales[2] && vocales[3] && vocales[4]) {

				System.out.println("SI");

			} else {

				System.out.println("NO");
			}

			for (int j = 0; j < 5; j++) {
				vocales[j] = false;
			}
		}
	}
}