
public class DadoContaPI {

	protected String nome;
	protected String cpf;
	protected int numeroconta;
	protected float saldo;
	
	
	public DadoContaPI(String nome, String cpf, int numeroconta, float saldo) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.numeroconta = numeroconta;
		this.saldo = saldo;
	}
	
	public void exibirDadosContaPI(){
		System.out.println("-----------------------------------------------------------------");
		System.out.println("      Exibindo informações da conta : " + numeroconta + "   ");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("     Nome e CPF do Cliente : " + nome + " - " + cpf );
		System.out.printf("     Saldo em conta : R$%.2f%n",saldo);
		System.out.println("\n");
	}
		
	public void creditarPI(float credito) {
			saldo = saldo + credito;
	}	
	
	public String debitarPI(float debito) {
		String check;
		if(debito > saldo) {
			check = "Saldo Insuficiente";
		}
		else {
			saldo = saldo - debito;
			check = "Debito Executado na Conta " + numeroconta;
		}
		return check;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getNumeroconta() {
		return numeroconta;
	}
	public void setNumeroconta(int numeroconta) {
		this.numeroconta = numeroconta;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
}


