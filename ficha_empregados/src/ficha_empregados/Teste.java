package ficha_empregados;

public class Teste {
	
	public static void main(String[] args) {
		
	Empregado func1 = new Empregado();
	Empregado func2 = new Empregado();
	Empregado func3 = new Empregado();
	
	func1.nome = "LISARB";
	func1.cargo = "COORDENADOR";
	func1.salario = 10000.00;
	
	func2.nome = "DUNHA";
	func2.cargo = "Gerente";
	func2.salario = 20000.00;

	func3.nome = "JÃO";
	func3.cargo = "SUPERINTENDENTE";
	func3.salario = 30000.00;
	
	
	func1.imprimir();
	func2.imprimir();
	func3.imprimir();
	
	System.out.println("                                     ");
	System.out.println("                                     ");
	System.out.println("-------------------------------------");
	System.out.println("    Executando Reajuste de 10% ...   ");
	System.out.println("-------------------------------------");
	System.out.println("                                     ");
	System.out.println("                                     ");
	
	
	func1.aumentarSalario(10);
	func2.aumentarSalario(10);
	func3.aumentarSalario(10);
	
	
	func1.imprimir();
	func2.imprimir();
	func3.imprimir();
	
	}
}
