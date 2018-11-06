package zadania;

public class Char {

	public static void main(String[] args) {
		char napis[] = {'W', 'i', 't','a','j'};
		char informatyka[]={'I','n','f','o','r','m','a','t','y','k','a'};
		System.out.print(napis);
		System.out.print("\nPionowo: \n");
		//oddzielne linie
		for(char znak:informatyka){
			System.out.println(znak);
			System.out.println();
		}
		
		System.out.println("\nPoziomo: \n");
		//spacje
		for(char odstep:informatyka){
			System.out.print(odstep);
			System.out.print(" ");
			
		}
		
		System.out.println("\nWielkie Litery: \n");
		for(char litery:informatyka){
			System.out.print(Character.toUpperCase(litery));
		}
		System.out.println("\nMale Litery: \n");
		for(char male:informatyka){
			System.out.print(Character.toLowerCase(male));
		}
	}

}
