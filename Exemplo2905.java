package Vetor;
import java.util.ArrayList;
public class Exemplo2905 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(10);//Adicionando elementos ao ArrayList
		numeros.add(20);
		
		System.out.println(numeros.get(0)); // SAída:10 Acessando elementos ao ArrayList
		System.out.println(numeros.get(1)); // Saída:20
		
		numeros.set(1, 25);
		System.out.println(numeros.get(1)); //Saída: 25 Modificando um elemento ao ArrayList
		
		numeros.remove(0);
		System.out.println(numeros.get(0)); // Saída 25 Removendo elemetos do ArrayList
		
		System.out.println(numeros.size()); // Saída: 2 Obtendo o tamanho do ArrayList 
		
		

	}

}
