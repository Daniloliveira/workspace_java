import java.util.Scanner;

public class BancoPI {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);	
	
		
		DadoContaPI cliente1 = new DadoContaPI("João","123.456.789-0",1234,10000.00f);	
		DadoContaPI cliente2 = new DadoContaPI("Maria","098.765.432-1",1235,2000.00f);
		DadoContaPI cliente3 = new DadoContaPI("Jose","456.789.012-3",1236,15000.00f);
		DadoContaPIespec cliente4 = new DadoContaPIespec("Danilo","456.789.012-3",1236,8000.00f,1000.00f);
		
		cliente1.exibirDadosContaPI();
		cliente2.exibirDadosContaPI();
		cliente3.exibirDadosContaPI();
		cliente4.exibirDadosContaPI();
	
		cliente1.creditarPI(100);
		cliente2.creditarPI(100);
		cliente3.creditarPI(100);
		cliente4.creditarPI(100);
		
		cliente1.exibirDadosContaPI();
		cliente2.exibirDadosContaPI();
		cliente3.exibirDadosContaPI();
		cliente4.exibirDadosContaPI();
		
		System.out.println(cliente1.debitarPI(10000));
		System.out.println(cliente2.debitarPI(10000));
		System.out.println(cliente3.debitarPI(10000));
		System.out.println(cliente4.debitarPI(9000));
		
		cliente1.exibirDadosContaPI();
		cliente2.exibirDadosContaPI();
		cliente3.exibirDadosContaPI();
		cliente4.exibirDadosContaPI();

	
	}
	
}
