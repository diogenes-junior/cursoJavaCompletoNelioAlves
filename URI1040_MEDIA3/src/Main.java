import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, n3, n4, notaExame;
		int PESO1=2, PESO2=3, PESO3=4, PESO4=1, 
			PESOTOTAL=PESO1+PESO2+PESO3+PESO4;
		double media;
		
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		n3 = sc.nextDouble();
		n4 = sc.nextDouble();
		
		media = n1*(double)PESO1/PESOTOTAL
				+n2*(double)PESO2/PESOTOTAL
				+n3*(double)PESO3/PESOTOTAL
				+n4*(double)PESO4/PESOTOTAL;
		
		media = Math.round(media*100.0)/100.0;
		
		System.out.println("Media: "+new DecimalFormat("0.0").format(media));
		
		if(media < 5.0)
			System.out.println("Aluno reprovado.");
		else if(media >= 7.0)
			System.out.println("Aluno aprovado.");
		else {
			System.out.println("Aluno em exame.");
			notaExame = sc.nextDouble();
			System.out.printf("Nota do exame: %.1f%n", notaExame);
			media = (media + notaExame) / 2;
			if(media >= 5.0)
				System.out.println("Aluno aprovado.");
			else
				System.out.println("Aluno reprovado.");
			System.out.printf("Media final: %.1f%n", media);
		}
		
		sc.close();
	}

}
