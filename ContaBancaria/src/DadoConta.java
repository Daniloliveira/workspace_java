
public class DadoConta {
	
	private String cpf;
	private int numero;
	private int dv;
	private double saldo;
	private boolean check;
	
	
	public DadoConta(String cpf, int numero , int dv , double saldo) {
		this.cpf = cpf;
		this.numero = numero;
		this.dv = dv;
		this.saldo = saldo;
	}
	
	public void exibirDadosConta(){
		System.out.println("\n");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("      Exibindo informações da conta : " + numero + "-" + dv +"   ");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("\n");
		System.out.println("     CPF do Cliente : " + cpf );
		System.out.printf("     Saldo em conta : R$%.2f%n",saldo);
		System.out.println("\n");
		
	}
	
	public void creditar(double credito) {
		saldo = saldo + credito;
	}
	
	public boolean debitar(double debito) {
		if(debito > saldo) {
			check = false;
		}
		else {
			saldo = saldo - debito;
			check = true;
		}
		return check;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getDv() {
		return dv;
	}
	public void setDv(int dv) {
		this.dv = dv;
	}
	public double getSaldo() {
		return saldo;
	}

}
