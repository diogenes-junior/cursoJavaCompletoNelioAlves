import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, media;
		int PESOA=2, PESOB=3, PESOC=5;
		int PESOTOTAL=PESOA + PESOB + PESOC;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		media = A*PESOA/PESOTOTAL
				+B*PESOB/PESOTOTAL
				+C*PESOC/PESOTOTAL;
		
		System.out.printf("MEDIA = %.1f%n", media);
		
		sc.close();
	}

}
