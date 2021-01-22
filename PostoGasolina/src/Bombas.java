
public class Bombas {
	
	private int id_bomba ;
	private String combustivel;
	private double valorlitro ;
	
	
	public Bombas(int id_bomba, String combustivel, double valorlitro) {
		super();
		this.id_bomba = id_bomba;
		this.combustivel = combustivel;
		this.valorlitro = valorlitro;
	}

	public double calculaTotal(double litros){
		double total = valorlitro * litros;
		return total;
	}
	
	public double calculaLitros(double reais){
		double litros = reais / valorlitro ;
		return litros;
	}
	
	

	public int getId_bomba() {
		return id_bomba;
	}


	public void setId_bomba(int id_bomba) {
		this.id_bomba = id_bomba;
	}


	public String getCombustivel() {
		return combustivel;
	}


	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}


	public double getValorlitro() {
		return valorlitro;
	}


	public void setValorlitro(double valorlitro) {
		this.valorlitro = valorlitro;
	}

}
