import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int value1, value2, soma;
		
		value1 = sc.nextInt();
		value2 = sc.nextInt();
		
		soma = value1 + value2;
		
		System.out.println("SOMA = " + soma);
		
		sc.close();
	}

}
