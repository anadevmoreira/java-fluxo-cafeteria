package Cafeteria.Atendimento.Cozinha;

public class Almoxarife {
	private void controlarEntrada() {
		System.out.println("CONTROLANDO A ENTRADA DOS ITENS");
	}
	private void controlarSaida() {
		System.out.println("CONTROLANDO A SAIDA DOS ITENS");
	}

	//modificador default 
	void entregarIngredientes() {
		System.out.println("ENTREGANDO INGREDIENTES");
		controlarSaida();
	}

	//modificador default 
	void trocarGas() {
		System.out.println("ALMOXARIFE TROCANDO O GÁS");
	}
}