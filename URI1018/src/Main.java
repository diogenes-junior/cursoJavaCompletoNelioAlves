import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, resto, quociente;
		
		n = sc.nextInt();
		
		quociente = n/100;
		resto = n%100;
		System.out.printf("%d nota(s) de R$ 100,00%n", quociente);
		
		n = resto;
		quociente = n/50;
		resto=n%50;
		System.out.printf("%d nota(s) de R$ 50,00%n", quociente);
		
		n = resto;
		quociente = n/20;
		resto=n%20;
		System.out.printf("%d nota(s) de R$ 20,00%n", quociente);
		
		n = resto;
		quociente = n/10;
		resto=n%10;
		System.out.printf("%d nota(s) de R$ 10,00%n", quociente);

		n = resto;
		quociente = n/5;
		resto=n%5;
		System.out.printf("%d nota(s) de R$ 5,00%n", quociente);
		
		n = resto;
		quociente = n/2;
		resto=n%2;
		System.out.printf("%d nota(s) de R$ 2,00%n", quociente);

		n = resto;
		quociente = n/1;
		resto=n%1;
		System.out.printf("%d nota(s) de R$ 1,00%n", quociente);
		
		sc.close();
	}

}
