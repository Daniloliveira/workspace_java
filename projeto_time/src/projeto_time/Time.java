package projeto_time;

public class Time {
	// Estrutura da Hora
	private int hora;
	private int minuto;
	private int segundo;
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getMinuto() {
		return minuto;
	}
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}
	public int getSegundo() {
		return segundo;
	}
	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}
	
	void exibirHoraUniversal(){
		System.out.println("Hora Universal: " + FormataNum(hora) + ":" + FormataNum(minuto) + ":" + FormataNum(segundo));	
	}
	
	void exibirHoraPadrao(){
		if (hora == 12) {
		    //hora = hora - 12;
			System.out.println("Hora Padrao: " + FormataNum(hora) + ":" + FormataNum(minuto) + ":" + FormataNum(segundo) + " AM");
		}
		else if(hora > 12) {
			hora = hora - 12;
			System.out.println("Hora Padrao: " + FormataNum(hora) + ":" + FormataNum(minuto) + ":" + FormataNum(segundo) + " PM");
		}
		else {
			System.out.println("Hora Padrao: " + FormataNum(hora) + ":" + FormataNum(minuto) + ":" + FormataNum(segundo) + " AM");
		}
	}
	
	public String FormataNum(int numero){
		String res = "";
		if (numero < 10){
			res = "0" +  numero;
		}
		else {
			res = ""+numero ;
		}
		return res;
	}
}
