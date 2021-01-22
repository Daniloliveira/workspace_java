package ficha_empregados;

public class Empregado {
	// Estrutura dos Empregados
	String nome;
	String cargo;
	Double salario;
	
	
	void imprimir() {
		System.out.println("-------------------------------------");
		System.out.println("         Dados do Funcionario        ");
		System.out.println("-------------------------------------");
		System.out.println("    Nome   : " + nome + "            ");
		System.out.println("    Cargo  : " + cargo + "           ");
		System.out.println("    Salario: " + salario + "         ");
		System.out.println("-------------------------------------");
		System.out.println("                                     ");
	}
	
	void aumentarSalario(double reajuste) {
			salario = salario * ( 1 + (reajuste / 100 ));
	}
	
}
