import java.io.IOException;
import java.util.Scanner;

public class Problema380 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Scanner entrada = new Scanner(System.in);
		
		int casos = entrada.nextInt();
		
		while(casos > 0) {
			
			int suma = 0;
			
			for(int i = 0; i < casos; i++) {
				suma += entrada.nextInt();
			}
			
			System.out.println(suma);
			
			casos = entrada.nextInt();
		}

	}
}
