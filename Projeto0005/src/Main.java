import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura, comprimento, valorMetroQuadrado;
		double valorArea, valorPrecoTerreno;

		largura = sc.nextDouble();
		comprimento = sc.nextDouble();
		valorMetroQuadrado = sc.nextDouble();
		
		valorArea = largura*comprimento;
		valorPrecoTerreno = valorArea*valorMetroQuadrado;
		
		System.out.printf("%nAREA = %.2f%n", valorArea);
		System.out.printf("PRECO = %.2f%n", valorPrecoTerreno);
		
		
		sc.close();
	}

}
