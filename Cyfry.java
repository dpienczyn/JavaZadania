/*Napisz program, kt�ry utworzy dziesicioelementow tablic znak�w i wypeni j cyframi od 0 do 9 (plik 	r�dowy: Cyfry.java).
*/
package zadania;

public class Cyfry {

	public static void main(String[] args) {
		char znak[] = new char[10];
		
		for(int i=0; i<10; i++){
			znak[i]=(char)(i+48);
			System.out.println("Cyfry uk�adu dziesiatkowego: ");
			System.out.println(znak);
		}

	}

}
