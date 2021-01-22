package userinterface;

import core.Funcionario;
import core.Chefe;
import core.Comissionado;
import core.Empreiteiro;
import core.Horista;

public class GeraHolerite {
	
	public static void main(String[] args) {
		
//		float salario;
		
		// definindo o tamanho da lista
		Funcionario listaFuncionario[] = new Funcionario[4]; // 4 Tipos de Funcionarios
	
		listaFuncionario[0] = new Empreiteiro(10001 , "Joao Empreiteiro" , 10000.00f);
		listaFuncionario[1] = new Horista(10002 , "Jose Horista" , 200 , 100.00f);
		listaFuncionario[2] = new Comissionado(10003 , " Maria Comissionada" , 10000.00f , 10);
		listaFuncionario[3] = new Chefe(10004 , "Lucas Chefe" , 15000.00f , 10 , 3500.00f);
		
		for (Funcionario f : listaFuncionario) {
			
			System.out.println(f.geraRecibo(f.calcularSalario()));
			
		}
	}
}
