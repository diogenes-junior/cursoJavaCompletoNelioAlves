import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int distanciaTotalPercorrida;
		double totalCombustivelGasto, consumoMedio;
		
		distanciaTotalPercorrida = sc.nextInt();
		totalCombustivelGasto = sc.nextDouble();
		
		consumoMedio = distanciaTotalPercorrida / totalCombustivelGasto;
		
		System.out.printf("%.3f km/l%n", consumoMedio);
		
		sc.close();
	}

}
