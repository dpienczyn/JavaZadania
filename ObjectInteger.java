package zadania;

public class ObjectInteger {

	 public static void main(String args[]) {        
		 System.out.println("Wybrane metody obiekt�w klasy Integer\n"); 
		 /* tworzenie obiekt�w */        
		 Integer a = new Integer(1024);        
		 Integer b = new Integer("02000");        
		 Integer c = Integer.decode("02000");        
		 Integer d = Integer.decode("0x2000");        
		 System.out.println("a = "+a);        
		 System.out.println("b = "+b);        
		 System.out.println("c = "+c);        
		 System.out.println("d = "+d);        
		 /* por�wnania obiekt�w */        
		 System.out.println("...? "+a.equals(b));        
		 System.out.println("...? "+a.equals(c));        
		 System.out.println("...? "+a.compareTo(c));        
		 System.out.println("...? "+c.compareTo(d));        
		 System.out.println("...? "+d.compareTo(c));        
		 /* zmiana wartoci obiektu */        
		 a = Integer.valueOf(1000);        
		 b = Integer.valueOf("1000");        
		 c = Integer.valueOf("1000", 2);        
		 d = Integer.valueOf("1000", 16);        
		 System.out.println("a = "+a);        
		 System.out.println("b = "+b);        
		 System.out.println("c = "+c);        
		 System.out.println("d = "+d);    
		 } 
	 }

