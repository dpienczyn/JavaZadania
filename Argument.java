/*Napisz program, kt�ry wywietli na ekranie liczb argument�w wywoania aplikacji oraz podane argumenty. Kady argument powinien by wywietlony w odrbnym wierszu (plik 	r�dowy: Argumenty.java).
*/
package zadania;

public class Argument {

	public static void main(String[] args) {
		System.out.println("Liczba argumentow: "+args.length);
		for(String arg:args){
			System.out.print(arg);
		}
	}
}
