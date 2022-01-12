import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario=0.0, novoSalario=0.0, reajusteGanho=0.0;
		int reajustePercentual=0;
		
		salario = sc.nextDouble();
		
		if(salario>0.0 && salario<=400.0)
			reajustePercentual = 15;
		else if(salario>400.0 && salario<=800.0)
			reajustePercentual = 12;
		else if(salario>800.0 && salario<=1200.0)
			reajustePercentual = 10;
		else if(salario>1200.0 && salario<=2000.0)
			reajustePercentual = 7;
		else if(salario>2000.0)
			reajustePercentual = 4;
		
		reajusteGanho = salario * reajustePercentual / 100.0;
		novoSalario = salario + reajusteGanho;
			
		System.out.printf("Novo salario: %.2f%n", novoSalario);
		System.out.printf("Reajuste ganho: %.2f%n", reajusteGanho);
		System.out.printf("Em percentual: %d %%%n", reajustePercentual);
		
		sc.close();
	}

}
