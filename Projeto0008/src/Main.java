import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double custoPlanoBasico = 50.00;
		int minutosPlanoBasico = 100;
		double custoMinutoExcedente = 2.00;
		int qtdeMinutosConsumida;
		double valorPagar;
		
		qtdeMinutosConsumida = sc.nextInt();
		
		valorPagar = custoPlanoBasico;
		if (qtdeMinutosConsumida > minutosPlanoBasico) {
			int qtdeMinutosExcedente = qtdeMinutosConsumida-minutosPlanoBasico;
			double valorPagarMinutosExcedente = qtdeMinutosExcedente * custoMinutoExcedente;
			valorPagar += valorPagarMinutosExcedente;
		}
		
		System.out.printf("Valor a Pagar: %.2f%n", valorPagar);
		
		sc.close();
	}

}
