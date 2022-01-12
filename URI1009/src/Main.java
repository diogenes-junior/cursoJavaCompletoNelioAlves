import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String nomeVendedor;
		double salarioFixo, totalVendasNoMes, valorComissao, salarioTotalBruto;
		double COMISSAO = 0.15;
		
		nomeVendedor = sc.nextLine();
		salarioFixo = sc.nextDouble();
		totalVendasNoMes = sc.nextDouble();
		
		valorComissao = totalVendasNoMes * COMISSAO;
		salarioTotalBruto = salarioFixo + valorComissao;
		
		System.out.printf("TOTAL = R$ %.2f%n", salarioTotalBruto);
		
		sc.close();
	}

}
