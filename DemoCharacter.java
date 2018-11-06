package zadania;

public class DemoCharacter {

	public static void main(String[] args) {  
		 /* Informacje o metodzie */        
		 System.out.println("Klasa: java.lang.Character");        
		 System.out.println("Metoda statyczna: digit\n");        
		 System.out.println("static int digit(int ch, int radix)");        
		 System.out.println("Returns the numeric value of the character ch in the specified radix.");        
		 System.out.println();        /* Przykadowa tablica znaków */        
		 char znak[] = {'E', 'u', 'r', 'o', ' ', '2', '0', '1', '2'};        /* Demonstracja dziaania metody */        
		 System.out.println("Wartosc znaku jako cyfry w ukladzie dziesiatkowym(radix = 10)");        
		 for(char z : znak)            
			 System.out.println("Znak: "+z+" Cyfra: "+Character.digit(z, 10));        
		 System.out.println("Uwaga: -1 oznacza, ze znak nie jest cyfra w tym ukladzie liczbowym.");        
		 System.out.println();        
		 System.out.println("Wartosc znaku jako cyfry w ukadzie szesnastkowym(radix = 16)");        
		 for(char z : znak)            
			 System.out.println("Znak: "+z+"  Cyfra: "+Character.digit(z, 16));        
		 System.out.println("Uwaga: -1 oznacza, ze znak nie jest cyfra w tym ukladzie liczbowym.");    
		 } 
	 }
