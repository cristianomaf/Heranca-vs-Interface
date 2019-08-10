package model.entities;

import model.enums.Cor;

public abstract class FormaAbstract implements Formas{  //abstrata para que nao precise implementar o metodo area da classe formas
	private Cor cor;

	public FormaAbstract(Cor cor) {
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}
	
	
	

}
