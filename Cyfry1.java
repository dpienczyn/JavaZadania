/*Napisz program, kt�ry utworzy szesnastoelementow tablic znak�w i wypeni j cyframi ukadu szesnastkowego (plik 	r�dowy: Cyfry16.java).
*/
package zadania;

public class Cyfry1 {

	public static void main(String[] args) {
	        char[] cyfry = new char[16];
	        for(int i = 0; i < 10; ++i)
	            cyfry[i] = (char)(i+48);
	        for(int i = 10; i < 16; ++i)
	            cyfry[i] = (char)(i+55);
	        System.out.print("Cyfry ukladu szesnastkowego: ");
	        System.out.println(cyfry);
	    }
	}