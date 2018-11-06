/*Napisz program, który wywietli na ekranie liczb argumentów wywoania aplikacji oraz podane argumenty. Kady argument powinien by wywietlony w odrbnym wierszu (plik 	ródowy: Argumenty.java).
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
