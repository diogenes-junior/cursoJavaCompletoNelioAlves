import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int horaInicial, minutoInicial, horaFinal, minutoFinal, duracaoHoras=0, duracaoMinutos=0;
		
		horaInicial = sc.nextInt();
		minutoInicial = sc.nextInt();
		horaFinal = sc.nextInt();
		minutoFinal = sc.nextInt();
		
		if(horaInicial<horaFinal) {
			if(minutoInicial<=minutoFinal) {
				duracaoHoras = horaFinal-horaInicial;
				duracaoMinutos = minutoFinal-minutoInicial;
			}
			else {
				duracaoHoras = horaFinal-horaInicial-1;
				duracaoMinutos = 60-minutoInicial+minutoFinal;
			}
		}
		else if(horaInicial == horaFinal) {
			if(minutoInicial<minutoFinal) {
				duracaoHoras = horaFinal-horaInicial;
				duracaoMinutos=minutoFinal-minutoInicial;
			}
			else if(minutoInicial==minutoFinal) {
				duracaoHoras = 24;
				duracaoMinutos=0;
			}
		}
		else {
			if(minutoInicial<=minutoFinal) {
				duracaoHoras = 24-horaInicial+horaFinal;
				duracaoMinutos = minutoFinal-minutoInicial;
			}
			else {
				duracaoHoras = 24-horaInicial+horaFinal-1;
				duracaoMinutos = 60-minutoInicial+minutoFinal;				
			}
		}
				
		System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", duracaoHoras, duracaoMinutos);
		
		sc.close();
	}

}
