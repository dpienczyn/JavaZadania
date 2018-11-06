/*Utwórz tablic zawierajc znaki sowa programowanie. Napisz program wywietlajcy znaki zawarte w tablicy w kolejnoci odwrotnej — od koca do pocztku (plik	ródowy: Wspak1.java).
*/
package zadania;

public class Char2 {

	public static void main(String[] args) {
		char znak[] = {'p', 'r', 'o', 'g', 'r', 'a', 'm', 'o', 'w', 'a', 'n', 'i', 'e'};
		
		System.out.println("Normalna kolejnosc znakow: ");
		
		System.out.print(znak);
		
		System.out.println("\nOdwrocona kolejnosc znakow: ");
		
		for(int i=znak.length-1; i>=0; i--){
			System.out.print(znak[i]);
		}

	}

}
