import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int horaInicial, horaFinal, duracao;
		
		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();
		
		if(horaInicial<horaFinal)
			duracao = horaFinal-horaInicial;
		else if(horaInicial == horaFinal)
			duracao = 24;
		else
			duracao = 24-horaInicial+horaFinal;
		
		System.out.printf("O JOGO DUROU %d HORA(S)%n", duracao);

		sc.close();
	}

}
