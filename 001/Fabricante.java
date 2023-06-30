package ooCarros;
import ooCarros.Carro;

public class Fabricante {

	public static void main(String[] args) {
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		Carro carro3 = new Carro();
		Carro carro4 = new Carro();
		
		carro1.marcaVículo = "Fiat";
		carro1.modeloVeículo = "Palio";
		carro2.marcaVículo = "BMW";
		carro2.modeloVeículo = "320";
		
		carro1.ligar();
		carro2.ligar();
		carro2.acelerar();
		carro2.pesoVeículo = 500;
		
		System.out.println("Modelo -> " + carro1.modeloVeículo);
		System.out.println("Marca -> " + carro1.marcaVículo);
		System.out.println("Marca -> " + carro2.marcaVículo);
		System.out.println("Modelo -> " + carro2.modeloVeículo);
		System.out.println("Quantidade gasolina do " + carro1.modeloVeículo +
				": " + carro1.quantidadeCombustivel() + " litros");
	}

}
