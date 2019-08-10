package model.entities;

import model.enums.Cor;

public class Retangulo extends Formas {
	private Double base;
	private Double altura;
	
	public Retangulo() {
		
	}		
	public Retangulo(Double base, Double altura,Cor cor) {
		super(cor); // cor vem da superclasse Formas
		this.base = base;
		this.altura = altura;
	}
	
	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	//metodo sobrescrito da classe abstrata formas 
	@Override
	public double area() {
	
		return base*altura;
	}
	@Override
	public String toString() {
		return "Retangulo "+ cor+" [base= " + base + ", altura=" + altura + " tem area de : "+ String.format("%.2f",area()) ;
	}
	

}
