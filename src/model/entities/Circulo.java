package model.entities;

import model.enums.Cor;

public class Circulo extends Formas{
	private Double raio;
	
	public Circulo () {
		
	}
	public Circulo(Double raio,Cor cor) {
		super(cor);
		this.raio = raio;
	}
	
	//getters e setters	
	public Double getRaio() {
		return raio;
	}
	public void setRaio(Double raio) {
		this.raio = raio;
	}
	
	//metodo area sobrescrito
	@Override
	public double area() {
		return Math.PI * raio * raio;
	}
	@Override
	public String toString() {
		return "Circulo [raio=" + raio + ", cor=" + cor + ", area()=" + area() + "]";
	}
	
	
}
