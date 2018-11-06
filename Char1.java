/*Utwórz tablic zawierajc znaki sowa programowanie. Napisz program zmieniajcy zawarto tablicy i wywietlajcy efekty tych zmian (plik 	ródowy: Programowanie.java): a) zamie pierwsz liter na wielk, b) zamie wszystkie litery na wielkie.
*/
package zadania;

public class Char1 {

	public static void main(String[] args) {
		char znak[] = {'p', 'r', 'o', 'g', 'r', 'a', 'm', 'o', 'w', 'a', 'n', 'i', 'e'};
		System.out.println("Pierwsza litera du¿a: \n");
		//zmiana pierwszej litery na duza
		znak[0]=Character.toUpperCase(znak[0]);
		System.out.println(znak);
		System.out.print("\nZnaki pisane du¿ymi literami: \n");
		for(int i=0; i<znak.length; i++){
			//znaki napisane duzymi literami!
			znak[i]=Character.toUpperCase(znak[i]);
			System.out.print(znak[i]);
				
			}
		}

	}
