/*Utwórz acuch zawierajcy napis Dzie dobry. Napisz aplikacj (plik 	ródowy: WitajStr. java), która wywietli napis w konsoli: a) pionowo — kady znak w odrbnym wierszu,
b) poziomo — znaki rozdzielone dodatkowymi odstpami (tzw. spacjowanie lub rozstrzelenie tekstu), c) poziomo — wielkimi literami, d) poziomo — maymi literami.
*/
package zadania;

public class String1 {

	public static void main(String[] args) {
		String napis = "Ala ma kota";
	
		System.out.println("Wyswietlanie znakow w osobnych wierszach: \n");
		for(int i=0; i<napis.length(); i++){
			System.out.print(napis.charAt(i));
			System.out.println();
		}
		
		System.out.println("Wyswietlanie znakow w poziomie: \n");
		for(int i=0; i<napis.length(); i++){
			System.out.print(napis.charAt(i));
		}
		
		System.out.println("\nDuze litery: \n");
		System.out.print(napis.toUpperCase());
		
		System.out.println("\nMale litery: ");
		System.out.print(napis.toLowerCase());
	}
}
