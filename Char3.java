/*Utw�rz tablic zawierajc znaki sowa programowanie. Napisz program odwracajcy kolejno znak�w w tablicy (plik 	r�dowy: Wspak2.java).
Przestawiaj kolejno pary element�w tablicy: pierwszy z ostatnim, drugi z przedostatnim � a dojdziesz do rodka tablicy.
*/
package zadania;

public class Char3 {

	public static void main(String[] args) {
	        char dane[] = {'p', 'r', 'o', 'g', 'r', 'a', 'm', 'o',
	           'w', 'a', 'n', 'i', 'e'};
	        System.out.print("Normalna kolejno znak�w: ");
	        System.out.println(dane);
	        for(int i = 0, j = dane.length-1; i < j ; ++i, --j) {
	            char tmp = dane[i];
	            dane[i] = dane[j];
	            dane[j] = tmp;
	        }
	        System.out.print("Odwrotna kolejno znak�w: ");
	        System.out.println(dane);
	    }
	}
