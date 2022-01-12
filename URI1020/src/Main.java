import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, ano, mes, dias, resto;
		
		n = sc.nextInt();
		
		ano = n/365;
		resto = n%365;
		mes = resto/30;
		dias = resto%30;
		
		System.out.printf("%d ano (s)%n", ano);
		System.out.printf("%d mes (es)%n", mes);
		System.out.printf("%d dia (s)%n", dias);
		
		sc.close();
	}

}
