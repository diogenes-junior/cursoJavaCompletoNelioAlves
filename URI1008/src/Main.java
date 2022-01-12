import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigoFuncionario, numeroHorasTrabalhadas;
		double valorPorHora, salario;

		codigoFuncionario = sc.nextInt();
		numeroHorasTrabalhadas = sc.nextInt();
		valorPorHora = sc.nextDouble();
		
		salario = numeroHorasTrabalhadas*valorPorHora;
		
		System.out.println("NUMBER = " + codigoFuncionario);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();
	}

}
