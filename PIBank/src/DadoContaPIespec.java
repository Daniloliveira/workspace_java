
public class DadoContaPIespec extends DadoContaPI{
	
	private float limite;
	
	public DadoContaPIespec(String nome, String cpf, int numeroconta, float saldo, float limite) {
		super(nome, cpf, numeroconta, saldo);
		this.setLimite(limite);
		// TODO Auto-generated constructor stub
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	public String debitarPI(float debito) {
		String check;
		float validaLimite;
		if(debito < saldo) {
			saldo = saldo - debito;
			check = "Debito Executado na Conta " + numeroconta;
		}
		else {
			validaLimite = saldo - debito;
			if (validaLimite * -1  < limite) {
				saldo = validaLimite ;
				check = "Debito maior que saldo , você está utilizando seu Limite!!";
			}
			else {
				check = " Saldo e Limite Insuficiente para Operação";
			}
		}
		 return check ; 
		
	}

}

