package model.entities;

import model.enums.Cor;

public abstract class Formas {
	Cor cor;	
	
	public Formas() {
		
	}
	public Formas(Cor cor) {
		this.cor = cor;
	}
	
	//get e sets 
	public Cor getCor() {
		return cor;
	}
	public void setCor(Cor cor) {
		this.cor = cor;
	}


	public abstract double area();

}
