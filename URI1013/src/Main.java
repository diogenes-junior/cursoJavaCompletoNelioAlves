import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A, B, C, maiorAB, maiorABC;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		
		maiorAB = (A+B+Math.abs(A-B))/2;
		maiorABC = (maiorAB+C+Math.abs(maiorAB-C))/2; 
		
		System.out.printf("%d eh o maior%n", maiorABC);
		
		sc.close();
	}

}
