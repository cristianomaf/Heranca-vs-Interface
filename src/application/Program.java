package application;

import java.util.Scanner;

import model.entities.Circulo;
import model.entities.Retangulo;
import model.enums.Cor;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre Forma desejada (Digite R para Retangulo e C para Circulo):");
		char escolha = scan.next().charAt(0);
		
				
		if(escolha == 'R' ) {
			System.out.print("Digite a medida da base do retangulo:");
			Double base = scan.nextDouble();
			System.out.print("Digite a medida da altura do retangulo:");
			Double altura = scan.nextDouble();	
			 Retangulo retangulo1 = new Retangulo(base, altura, Cor.PRETO);	
				System.out.println(retangulo1);
			
			}else {
				System.out.print("Digite o raio do circulo: ");
				Double raio = scan.nextDouble();
				 Circulo circulo1 = new Circulo(raio, Cor.BRANCO);
				 System.out.println(circulo1);
			}
		
			

		scan.close();
	}

}
