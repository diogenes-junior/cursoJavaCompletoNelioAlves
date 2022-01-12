import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A,B, media;
		double PESOA = 3.5, PESOB = 7.5;
		double PESOTOTAL = PESOA + PESOB;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		
		media = A*PESOA/PESOTOTAL + B*PESOB/PESOTOTAL;
		
		System.out.printf("MEDIA = %.5f%n", media);
		
		sc.close();
	}

}
