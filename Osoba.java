package zadania;

public class Osoba {

	public static void main(String[] args) {
		System.out.print("Nazwisko: ");
		System.out.println(args[1].substring(0, 1).toUpperCase()+args[1].substring(1).toLowerCase());
		System.out.print("Imie: ");
		System.out.println(Character.toUpperCase(args[0].charAt(0))+args[0].substring(1).toLowerCase());
		System.out.print("Nazwisko i imie: ");
		System.out.println(args[1].toUpperCase()+" ");
		System.out.println(Character.toUpperCase(args[0].charAt(0))+args[0].substring(1).toLowerCase());
		System.out.print("Inicjaly: ");
		System.out.println(Character.toUpperCase(args[0].charAt(0)));
		System.out.println(Character.toUpperCase(args[1].charAt(0)));
		System.out.print("Login: ");
		System.out.println(args[1].substring(0, 2).toUpperCase());
		System.out.println(args[1].substring(0, 3).toLowerCase());
	}

}
