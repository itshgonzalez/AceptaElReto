import java.util.Scanner;

public class Problema405 {

	static String texto = "";

	final static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		int num1 = entrada.nextInt();

		while (num1 > 0) {

			int num2 = entrada.nextInt();

			int max = num1;
			int min = num1;

			boolean primera = true;

			while (num2 > 0) {

				if (num1 + (int) 1 == num2) {
					max = num2;
					num1 = num2;
					num2 = entrada.nextInt();

				} else {

					if (!primera) {
						System.out.print(",");

					} else {
						primera = false;
					}

					if (min == max) {
						System.out.print(min);

					} else {
						System.out.print(min + "-" + max);
					}

					num1 = num2;
					max = num1;
					min = num1;
					num2 = entrada.nextInt();
				}
			}

			if (!primera) {
				System.out.print(",");

			} else {
				primera = false;
			}

			if (min == max) {
				System.out.print(min);

			} else {
				System.out.print(min + "-" + max);
			}

			System.out.println();
			num1 = entrada.nextInt();
		}
	}
}
