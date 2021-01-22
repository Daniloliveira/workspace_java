import java.util.Scanner;

public class CaixaPosto {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int menu;
		int bombadig;
		double litros, reais, total;
			
		Bombas bomba1 = new Bombas(1, "Gasolina", 4.40);	
		Bombas bomba2 = new Bombas(2, "Alcool", 2.81);
		Bombas bomba3 = new Bombas(3, "Diesel", 3.14);
		
		do {
			System.out.println("\n-------------------------------------------------------------");
			System.out.println("--------------       POSTO ISIDROCORP       -------------------");
			System.out.println("---------------------------------------------------------------");
			System.out.println("1 - Abastecer com Litros");
			System.out.println("2 - Abastecer com Reais R$");
			System.out.println("3 - Sair");
			menu = teclado.nextInt();
			
			switch(menu){
			case 1:
				System.out.print("Informe o número da Bomba : ");
				bombadig = teclado.nextInt();
				System.out.print("\nInforme  quantos Litro(s) deseja abastecer : ");
				litros = teclado.nextDouble();
				if(bombadig == bomba1.getId_bomba()) {
					total = bomba1.calculaTotal(litros);
					System.out.println("----------- -------------------------- --------");
					System.out.println("----------- Segue Recibo da  Transação --------");
					System.out.println("----------- -------------------------- --------\n");
					System.out.println("----------- Total abastecido na Bomba de " + bomba1.getCombustivel() + " --------\n");
					System.out.print("Valor do(a) " + bomba1.getCombustivel() + " : ");
					System.out.print(bomba1.getValorlitro());
					System.out.println(" R$/L ");
					System.out.println("Total de Litros Abastecido : " + litros + " L ");
					System.out.printf("Valor Total : R$ %.2f%n",total);
					System.out.println("----------- -------------------------- --------");
				}
				else if (bombadig == bomba2.getId_bomba()){
					total = bomba2.calculaTotal(litros);
					System.out.println("----------- -------------------------- --------");
					System.out.println("----------- Segue Recibo da  Transação --------");
					System.out.println("----------- -------------------------- --------\n");
					System.out.println("----------- Total abastecido na Bomba de " + bomba2.getCombustivel() + " --------\n");
					System.out.print("Valor do(a) " + bomba2.getCombustivel() + " : ");
					System.out.print(bomba2.getValorlitro());
					System.out.println(" R$/L ");
					System.out.println("Total de Litros Abastecido : " + litros + " L ");
					System.out.printf("Valor Total : R$ %.2f%n",total);
					System.out.println("----------- -------------------------- --------");
				}
				else if (bombadig == bomba3.getId_bomba()) {
					total = bomba3.calculaTotal(litros);
					System.out.println("----------- -------------------------- --------");
					System.out.println("----------- Segue Recibo da  Transação --------");
					System.out.println("----------- -------------------------- --------\n");
					System.out.println("----------- Total abastecido na Bomba de " + bomba3.getCombustivel() + " --------\n");
					System.out.print("Valor do(a) " + bomba3.getCombustivel() + " : ");
					System.out.print(bomba3.getValorlitro());
					System.out.println(" R$/L ");
					System.out.println("Total de Litros Abastecido : " + litros + " L ");
					System.out.printf("Valor Total : R$ %.2f%n",total);
					System.out.println("----------- -------------------------- --------");
				}
				else {
					System.out.println("ID da Bomba digitado está incorreto");
				}
				break;
			case 2:
				System.out.print("Informe o número da Bomba : ");
				bombadig = teclado.nextInt();
				System.out.print("\nInforme  O Valor que deseja abastecer : R$ ");
				reais = teclado.nextDouble();
				if(bombadig == bomba1.getId_bomba()) {
					litros = bomba1.calculaLitros(reais);
					total = reais;
					System.out.println("----------- -------------------------- --------");
					System.out.println("----------- Segue Recibo da  Transação --------");
					System.out.println("----------- -------------------------- --------\n");
					System.out.println("----------- Total abastecido na Bomba de " + bomba1.getCombustivel() + " --------\n");
					System.out.print("Valor do(a) " + bomba1.getCombustivel() + " : ");
					System.out.print(bomba1.getValorlitro());
					System.out.println(" R$/L ");
					System.out.println("Total de Litros Abastecido : " + litros + " L ");
					System.out.printf("Valor Total : R$ %.2f%n",total);
					System.out.println("----------- -------------------------- --------");
				}
				else if(bombadig == bomba2.getId_bomba()) {
					litros = bomba2.calculaLitros(reais);
					total = reais;
					System.out.println("----------- -------------------------- --------");
					System.out.println("----------- Segue Recibo da  Transação --------");
					System.out.println("----------- -------------------------- --------\n");
					System.out.println("----------- Total abastecido na Bomba de " + bomba2.getCombustivel() + " --------\n");
					System.out.print("Valor do(a) " + bomba2.getCombustivel() + " : ");
					System.out.print(bomba2.getValorlitro());
					System.out.println(" R$/L ");
					System.out.println("Total de Litros Abastecido : " + litros + " L ");
					System.out.printf("Valor Total : R$ %.2f%n",total);
					System.out.println("----------- -------------------------- --------");
				}
				else if(bombadig == bomba3.getId_bomba()) {
					litros = bomba3.calculaLitros(reais);
					total = reais;
					System.out.println("----------- -------------------------- --------");
					System.out.println("----------- Segue Recibo da  Transação --------");
					System.out.println("----------- -------------------------- --------\n");
					System.out.println("----------- Total abastecido na Bomba de " + bomba3.getCombustivel() + " --------\n");
					System.out.print("Valor do(a) " + bomba3.getCombustivel() + " : ");
					System.out.print(bomba3.getValorlitro());
					System.out.println(" R$/L ");
					System.out.println("Total de Litros Abastecido : " + litros + " L ");
					System.out.printf("Valor Total : R$ %.2f%n",total);
					System.out.println("----------- -------------------------- --------");
				}
				else {
					System.out.println("ID da Bomba digitado está incorreto");
				}
				break;
			case 3:
				break;			
			default:
				System.out.print("\n Opção Incorreta, Digite uma das opções do Menu !!!!\n");
				break;
			}
		}while(menu != 3);
	}
}
