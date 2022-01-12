import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigoPeca1, qtdePeca1;
		int codigoPeca2, qtdePeca2;
		double valorUnitarioPeca1, valorUnitarioPeca2, valorAPagar;
		
		codigoPeca1 = sc.nextInt();
		qtdePeca1 = sc.nextInt();
		valorUnitarioPeca1 = sc.nextDouble();
		
		codigoPeca2 = sc.nextInt();
		qtdePeca2 = sc.nextInt();
		valorUnitarioPeca2 = sc.nextDouble();

		valorAPagar = qtdePeca1*valorUnitarioPeca1+qtdePeca2*valorUnitarioPeca2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", valorAPagar);
		
		sc.close();
	}

}
