import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n;
		int inteiro;
		double fracao;
		int quociente, resto;

		
		n = sc.nextDouble();
	    inteiro = (int)n;
	    fracao = (n-(int)n);
		
		quociente= inteiro/100;
		resto=inteiro%100;
		System.out.println("NOTAS:");
		System.out.printf("%d nota(s) de R$ 100.00%n", quociente);

		inteiro = resto;
		quociente= inteiro/50;
		resto=inteiro%50;
		System.out.printf("%d nota(s) de R$ 50.00%n", quociente);
		
		inteiro = resto;
		quociente= inteiro/20;
		resto=inteiro%20;
		System.out.printf("%d nota(s) de R$ 20.00%n", quociente);
		
		inteiro = resto;
		quociente= inteiro/10;
		resto=inteiro%10;
		System.out.printf("%d nota(s) de R$ 10.00%n", quociente);

		inteiro = resto;
		quociente= inteiro/5;
		resto=inteiro%5;
		System.out.printf("%d nota(s) de R$ 5.00%n", quociente);

		inteiro = resto;
		quociente= inteiro/2;
		resto=inteiro%2;
		System.out.printf("%d nota(s) de R$ 2.00%n", quociente);
		
		fracao+=resto;
		System.out.println("MOEDAS:");
		quociente= (int)(fracao/1);
		System.out.printf("%d moeda(s) de R$ 1.00%n", quociente);
		
		fracao = fracao%1;
		quociente= (int)(fracao/0.5);
		System.out.printf("%d moeda(s) de R$ 0.50%n", quociente);

		fracao = fracao%0.5;
		quociente= (int)(fracao/0.25);
		System.out.printf("%d moeda(s) de R$ 0.25%n", quociente);

		fracao = fracao%0.25;
		quociente= (int)(fracao/0.10);
		System.out.printf("%d moeda(s) de R$ 0.10%n", quociente);

		fracao = fracao%0.10;
		quociente= (int)(fracao/0.05);
		System.out.printf("%d moeda(s) de R$ 0.05%n", quociente);
		
		
		fracao = fracao%0.05;
		quociente= (int)Math.round(fracao/0.01);
		System.out.printf("%d moeda(s) de R$ 0.01%n", quociente);
		
		sc.close();		
	}
}
