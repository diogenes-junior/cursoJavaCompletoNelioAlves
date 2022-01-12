import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo, qtde;
		double totalPagar=0.0;
		
		codigo = sc.nextInt();
		qtde   = sc.nextInt();
		
		if(codigo == 1)
			totalPagar = qtde * 4.00;
		else if(codigo == 2)
			totalPagar = qtde * 4.50;
		else if(codigo == 3)
			totalPagar = qtde * 5.00;
		else if(codigo == 4)
			totalPagar = qtde * 2.00;
		else if(codigo == 5)
			totalPagar = qtde * 1.50;
		
		System.out.printf("Total: R$ %.2f%n", totalPagar);
		
		sc.close();
	}

}
