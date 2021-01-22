import java.util.Scanner;

public class Banco {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);	
		int menu, contadig, dvdig;
		
		
		DadoConta cliente1 = new DadoConta("256.345.778-90", 1234, 6, 3459.87);	
		DadoConta cliente2 = new DadoConta("764.009.109-52", 4567, 6, 10000.50);
		DadoConta cliente3 = new DadoConta("877.999.777-00", 8901, 6, 8769.00);
	
		do {
		System.out.println("\n----------------------------------------------------");
		System.out.println("--------------       BANCO       -------------------");
		System.out.println("----------------------------------------------------");
		System.out.println("1 - Exibir informações das Conta");
		System.out.println("2 - Creditar Valor em Conta");
		System.out.println("3 - Debitar Valor em Conta");
		System.out.println("4 - Sair");
		System.out.print("Selecione a Opção:");
		menu = teclado.nextInt();
			switch (menu) {
			case 1:
				System.out.println("\n\n");
				System.out.println("-----------------------------------------------------------------");
				System.out.println("      Exibindo informações da conta Corrente     ");
				System.out.println("-----------------------------------------------------------------");
				System.out.print("Digite o numero da conta a ser creditada e Digito Verificador: ");
				contadig = teclado.nextInt();
				dvdig = teclado.nextInt();
				if(contadig == cliente1.getNumero() && dvdig == cliente1.getDv()) {
					cliente1.exibirDadosConta();
					break ;
				}
				else if (contadig == cliente2.getNumero() && dvdig == cliente2.getDv()) {
					cliente2.exibirDadosConta();
					break ;
				}
				else if (contadig == cliente3.getNumero() && dvdig == cliente3.getDv()) {
					cliente3.exibirDadosConta();
					break ;
				}
				else {
					System.out.println("\n !! Conta informada não existe !! \n");
					break ;
				}				

			case 2:
				System.out.print("Digite o numero da conta a ser creditada e Digito Verificador: ");
				contadig = teclado.nextInt();
				dvdig = teclado.nextInt();
				if(contadig == cliente1.getNumero() && dvdig == cliente1.getDv()) {
					System.out.print("\nDigite o Valor a ser Creditado : ");
					cliente1.creditar(teclado.nextDouble());
					break ;
				}
				else if (contadig == cliente2.getNumero() && dvdig == cliente2.getDv()) {
					System.out.print("\nDigite o Valor a ser Creditado : ");
					cliente2.creditar(teclado.nextInt());
					break ;
				}
				else if (contadig == cliente3.getNumero() && dvdig == cliente3.getDv()) {
					System.out.print("\nDigite o Valor a ser Creditado : ");
					cliente3.creditar(teclado.nextInt());
					break ;
				}
				else {
					System.out.print("Conta informada não existe\n");
					break ;
				}
			case 3:
				System.out.print("Digite o numero da conta a ser Debitada e Digito Verificador: ");
				contadig = teclado.nextInt();
				dvdig = teclado.nextInt();
				if(contadig == cliente1.getNumero() && dvdig == cliente1.getDv()) {
					System.out.print("\nDigite o Valor a ser Debitado : R$");
					if(cliente1.debitar(teclado.nextDouble())) {
						System.out.print("\nDebito efetuado com sucesso\n");
					}
					else {
						System.out.println("\nSaldo insuficiente !!\n");
					}
					break ;
				}
				else if (contadig == cliente2.getNumero() && dvdig == cliente2.getDv()) {
					System.out.print("\nDigite o Valor a ser Debitado : R$");
					if(cliente2.debitar(teclado.nextDouble())) {
						System.out.print("\nDebito efetuado com sucesso\n");
					}
					else {
						System.out.print("\nSaldo insuficiente\n");
					}
					
					break ;
				}
				else if (contadig == cliente3.getNumero() && dvdig == cliente3.getDv()) {
					System.out.print("\nDigite o Valor a ser Debitado : R$");
					if(cliente3.debitar(teclado.nextDouble())) {
						System.out.print("\nDebito efetuado com sucesso\n");
					}
					else {
						System.out.print("\nSaldo insuficiente\n");
					}
					break ;
				}
				else {
					System.out.print("\\nConta informada não existe\n");
					break ;
				}
			case 4:
				break;
			default:
				System.out.print("\n Opção Invalida\n ");
			}
			
		
		} while (menu != 4);
	


	}
}
	
