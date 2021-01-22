package core;

public class Horista extends Funcionario{
	private int numeroHoras;
	private float valorHora;
	


	public Horista(int numeroRegistro, String nome, int numeroHoras, float valorHora) {
		super(numeroRegistro, nome);
		this.numeroHoras = numeroHoras;
		this.valorHora = valorHora;
	}


	// cumprindo o "compromisso de implementação"
	public float calcularSalario() {
		return numeroHoras * valorHora;
	}
	
	
	public int getNumeroHoras() {
		return numeroHoras;
	}

	public void setNumeroHoras(int numeroHoras) {
		this.numeroHoras = numeroHoras;
	}

	public float getValorHora() {
		return valorHora;
	}

	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}
	
	
	
}
