import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, n3, aux, x1, x2, x3;
		
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		x1=n1;
		x2=n2;
		x3=n3;
		
		if(n1>n2) {
			aux=n1;
			n1=n2;
			n2=aux;
		}
		if(n1>n3) {
			aux=n1;
			n1=n3;
			n3=aux;
		}
		if(n2>n3) {
			aux=n2;
			n2=n3;
			n3=aux;			
		}
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		
		System.out.println();
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		
		sc.close();
	}

}
