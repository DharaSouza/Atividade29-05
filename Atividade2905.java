package Vetor;

import java.util.ArrayList;

public class Atividade2905 {

	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<Integer>();
		//Adicionando elementos ao ArrayList
		int soma = 0;
		int a[] = new int [5];

		numeros.add(10);
		numeros.add(10);
		numeros.add(10);
		numeros.add(10);
		numeros.add(10);

		for(int numero : numeros ) {
			soma = soma +  numero; 

		}
		System.out.println(soma);
	}

}

