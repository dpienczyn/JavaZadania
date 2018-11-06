/*Napisz program, który utworzy dziesicioelementow tablic znaków i wypeni j cyframi od 0 do 9 (plik 	ródowy: Cyfry.java).
*/
package zadania;

public class Cyfry {

	public static void main(String[] args) {
		char znak[] = new char[10];
		
		for(int i=0; i<10; i++){
			znak[i]=(char)(i+48);
			System.out.println("Cyfry uk³adu dziesiatkowego: ");
			System.out.println(znak);
		}

	}

}
