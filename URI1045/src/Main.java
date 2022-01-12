import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A,B,C, aux;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		if(A<B) {
			aux=A;
			A=B;
			B=aux;
		}
		if(A<C) {
			aux=A;
			A=C;
			C=aux;
		}
		if(B<C) {
			aux=B;
			B=C;
			C=aux;
		}
	
		if(A>=B+C)
			System.out.println("NAO FORMA TRIANGULO");
		else {
			if(A*A==B*B+C*C)
				System.out.println("TRIANGULO RETANGULO");
			else if(A*A>B*B+C*C)
				System.out.println("TRIANGULO OBTUSANGULO");
			else if(A*A<B*B+C*C)
				System.out.println("TRIANGULO ACUTANGULO");
	
			if(A==B && B==C)
				System.out.println("TRIANGULO EQUILATERO");
			else if(A==B || B==C || A==C)
				System.out.println("TRIANGULO ISOSCELES");
		}
		sc.close();
	}

}
