import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema334 {
	public static void main(String[] args) throws IOException {

		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		int casos = Integer.parseInt(entrada.readLine());

		for (int i = 0; i < casos; i++) {

			String nombre = entrada.readLine().toUpperCase();

			boolean picto = false;

			if (nombre.length() >= 3 && nombre.substring(0, 3).equals("MAC")) {
				picto = true;
			}

			if (!picto) {

				if (nombre.length() >= 1 && nombre.substring(nombre.length() - 1).equals("A")) {
					System.out.println("INDIO");
				}

				else if (nombre.length() >= 2 && nombre.substring(nombre.length() - 2).equals("IX")) {
					System.out.println("GALO");
				}

				else if (nombre.length() >= 2 && nombre.substring(nombre.length() - 2).equals("US")
						|| nombre.length() >= 2 && nombre.substring(nombre.length() - 2).equals("UM")) {
					System.out.println("ROMANO");
				}

				else if (nombre.length() >= 2 && nombre.substring(nombre.length() - 2).equals("IC")) {
					System.out.println("GODO");
				}

				else if (nombre.length() >= 2 && nombre.substring(nombre.length() - 2).equals("AS")) {
					System.out.println("GRIEGO");
				}

				else if (nombre.length() >= 2 && nombre.substring(nombre.length() - 2).equals("AF")) {
					System.out.println("NORMANDO");
				}

				else if (nombre.length() >= 2 && nombre.substring(nombre.length() - 2).equals("IS")
						|| nombre.length() >= 2 && nombre.substring(nombre.length() - 2).equals("OS")
						|| nombre.length() >= 2 && nombre.substring(nombre.length() - 2).equals("AX")) {
					System.out.println("BRETON");
				}

				else if (nombre.length() >= 2 && nombre.substring(nombre.length() - 2).equals("EZ")) {
					System.out.println("HISPANO");
				}

				else {
					System.out.println("PLUS ULTRA");
				}

			} else {

				if (nombre.length() >= 1 && nombre.substring(nombre.length() - 1).equals("A")) {
					System.out.println("MULATO");
				}

				else if (nombre.length() >= 2 && nombre.substring(nombre.length() - 2).equals("IX")) {
					System.out.println("MULATO");
				}

				else if (nombre.length() >= 2 && nombre.substring(nombre.length() - 2).equals("US")
						|| nombre.length() >= 2 && nombre.substring(nombre.length() - 2).equals("UM")) {
					System.out.println("MULATO");
				}

				else if (nombre.length() >= 2 && nombre.substring(nombre.length() - 2).equals("IC")) {
					System.out.println("MULATO");
				}

				else if (nombre.length() >= 2 && nombre.substring(nombre.length() - 2).equals("AS")) {
					System.out.println("MULATO");
				}

				else if (nombre.length() >= 2 && nombre.substring(nombre.length() - 2).equals("AF")) {
					System.out.println("MULATO");
				}

				else if (nombre.length() >= 2 && nombre.substring(nombre.length() - 2).equals("IS")
						|| nombre.length() >= 2 && nombre.substring(nombre.length() - 2).equals("OS")
						|| nombre.length() >= 2 && nombre.substring(nombre.length() - 2).equals("AX")) {
					System.out.println("MULATO");
				}

				else if (nombre.length() >= 2 && nombre.substring(nombre.length() - 2).equals("EZ")) {
					System.out.println("MULATO");
				}

				else {
					System.out.println("PICTO");
				}
			}

		}
	}
}