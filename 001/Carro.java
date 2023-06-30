package ooCarros;

public class Carro {

public String marcaVículo;
public String modeloVeículo;
public int anoFabricacaoVeículo;
public double pesoVeículo;
public int quantidadeMarchaVeículo;
public int quantidadePortaVeículo;


public void ligar() {
	System.out.println("Ligar o carro");
}

public void desligar() {
	System.out.println("Desligar o carro");
}

public void acelerar() {
	System.out.println("Acelerar o carro");
}

public void freiar() {
	System.out.println("Freiar o carro");
}

public int quantidadeCombustivel() {
	return 25;
	}
}
