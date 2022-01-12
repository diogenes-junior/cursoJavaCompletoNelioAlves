import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int valor1, valor2, prod;
		
		valor1 = sc.nextInt();
		valor2 = sc.nextInt();
		prod = valor1 * valor2;
		
		System.out.println("PROD = " + prod);
		
		sc.close();
	}

}
