package veiculo.main;

import veiculo.model.Veiculo;

public class Main {
	
	public static void main(String[] args) {
		Veiculo veiculo = new Veiculo();
		
		veiculo.ligar();
		veiculo.acelerar();
		veiculo.acelerar();
		veiculo.acelerar();
		veiculo.pintar("Bord�");
		veiculo.frear();
		veiculo.acelerar();
		veiculo.frear();
		veiculo.acelerar();
		veiculo.acelerar();
		veiculo.abastecer(40);
		veiculo.frear();
		veiculo.setMarca("ford");
		veiculo.setKm(500);
		veiculo.acelerar();
		veiculo.acelerar();
		
		System.out.println("o carro tem " + veiculo.getLitrosCombustivel() + " gasolina");
		System.out.println("o carro est� a " + veiculo.getVelocidade() + " KM/h");
		System.out.println("a carro est� na cor " + veiculo.getCor());
		System.out.println("a marca do carro �: " + veiculo.getMarca());

	}
}
