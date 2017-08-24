import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema140 {
	public static void main(String[] args) throws IOException {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		String numero = teclado.readLine();
		while (numero.charAt(0) != '-') {
			String array[] = new String[numero.length()];
			int resultado = 0;
			int sum = 0;
			for (int i = 0; i < array.length; i++) {
				sum = Integer.parseInt("" + numero.charAt(i));
				resultado += sum;
			}
			for (int j = 0; j < array.length; j++) {
				System.out.print(numero.charAt(j));
				if (j != numero.length() - 1) {
					System.out.print(" + ");
				} else {
					System.out.print(" = ");
				}
			}
			System.out.println(resultado);
			numero = teclado.readLine();
		}
	}
}