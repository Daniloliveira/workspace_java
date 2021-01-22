package projeto_time;

import java.util.Scanner;

public class TesteTime {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Time horario = new Time();
		
		System.out.println("Digite a(s) Hora(s)");
		horario.setHora(teclado.nextInt());
		System.out.println("Digite o(s) Minutos(s)");
		horario.setMinuto(teclado.nextInt());
		System.out.println("Digite o(s) Segundos(s)");
		horario.setSegundo(teclado.nextInt());		
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("      Exibindo a Hora nos formatos Universal e Padrão      ");
		System.out.println("-----------------------------------------------------------");
		
		System.out.println("");
		horario.exibirHoraUniversal();
		System.out.println("");
		horario.exibirHoraPadrao();
		
	}
}
