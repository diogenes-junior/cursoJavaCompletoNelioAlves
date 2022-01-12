import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a, b, c, r1, r2, delta;
		int possivelCalcular;
		
		r1 = 0.0;
		r2 = 0.0;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		possivelCalcular = -1;
		
		if (a != 0.0) {
			delta = b*b-4*a*c;
			possivelCalcular = 1;
			if (delta > 0.0 ) { //duas raízes distintas
				r1 = (-1 * b + Math.sqrt(delta))/(2*a);
				r2 = (-1 * b - Math.sqrt(delta))/(2*a);
			}
			else if (delta == 0.0) { //apenas uma raiz
				r1 = (-1 * b + Math.sqrt(delta))/(2*a);
				r2 = r1;
			}			
			else possivelCalcular = -1;
		}
		
		if (possivelCalcular == -1)
			System.out.println("Impossivel calcular");
		else {
			System.out.printf("R1 = %.5f%n", r1);
			System.out.printf("R2 = %.5f%n", r2);
		}
		
		sc.close();
	}

}
