/*Utw�rz acuch znak�w zawierajcy sowo programowanie. Napisz program, kt�ry znaki zawarte w acuchu bdzie wywietla w kolejnoci odwrotnej, od koca do pocztku (plik 	r�dowy: WspakStr1.java).
*/
package zadania;

public class Lancuch {

	public static void main(String[] args) {
		String napis = "ala ma kota";
		//wypisanie stringa w odwrotnej kolejnosci
		for(int i=napis.length()-1; i>=0; i--){
			System.out.print(napis.charAt(i));
			System.out.println();
		}

	}

}
