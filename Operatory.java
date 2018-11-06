package zadania;

public class Operatory {

	public static void main(String[] args) {
		boolean [] bool = {true, false};
		
		System.out.println("Prawo wylaczonego srodka: ");
		for(boolean p:bool){
			System.out.println(p+"\t"+!p+"\t"+(p||!p));
		}
		
		System.out.println("Prawo niesprzecznosci: ");
		for(boolean p:bool){
			System.out.println(p+"\t"+!p+"\t"+(p&&!p)+"\t"+!(p&&!p));
		}
		
		System.out.println("Prawo podwojnego przeczenia: ");
		for(boolean p:bool){
			System.out.println(!p+"\t"+p+"\t"+!(!p)+"\t"+(!(!p)==p));
		}
	}

}
