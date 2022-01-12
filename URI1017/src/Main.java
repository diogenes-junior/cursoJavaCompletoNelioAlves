import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int consumo = 12;
		int tempoGasto, velocidadeMedia, distanciaPercorrida;
		double qtdeCombustivel;
		
		tempoGasto = sc.nextInt(); 
		velocidadeMedia = sc.nextInt();
		
		distanciaPercorrida = tempoGasto * velocidadeMedia;
		qtdeCombustivel = (double) distanciaPercorrida/consumo;
		
		System.out.printf("%.3f", qtdeCombustivel);
		
		sc.close();
	}

}
