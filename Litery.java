/*Utwórz acuch znaków zawierajcy sowo programowanie. Napisz program zmieniajcy zawarto acucha i wywietlajcy efekty tych zmian (plik 	ródowy: ProgramowanieStr.java): a) zamie pierwsz liter na wielk, b) zamie wszystkie litery na wielkie.
Moemy utworzy	 nowy acuch, speniajcy warunki zadania, i przypisa	 jego warto	 tej samej zmiennej. Dotychczasowa warto	 zostanie usunita z pamici w chwili, gdy nie bdzie ju dalej potrzebna.
*/
package zadania;

public class Litery {

	public static void main(String[] args) {
		String napis = "programowanie";
		System.out.println("Orginalny ³ancuch znakow: \n"+napis);
		//amiana pierwszej litery na duza i polaczenie lancucha znakow od elementu o indexie 1
		napis = Character.toUpperCase(napis.charAt(0))+(napis.substring(1));
		System.out.println("Zamiana pierwszej litery na duza: \n"+napis);
		System.out.println("Zamiana wszystkich liter na duze: "+napis.toUpperCase());

	}

}
