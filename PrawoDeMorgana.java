package zadania;

public class PrawoDeMorgana {

	public static void main(String[] args) {
		boolean [] bool = {true, false};
		
		System.out.println("Prawa De Morgana: ");
		
		System.out.println("I prawo De Morgana: ");
		System.out.println("p\tq\tp&&q\t!(p&&q)\t!p\t!q\t!p||!q\t!(p&&q)<=>(!p||!q)");

		for(boolean p:bool){
			for(boolean q:bool){
				System.out.println(p+"\t"+q+"\t"+(p&&q)+"\t"+!(p&&q));
				System.out.println(!p+"\t"+!q+"\t"+(!p||!q));
				System.out.println("\t"+(!(p&&q)==(!p||!q)));
			}
		}
		System.out.println("II prawo De Morgana: ");
		for(boolean p:bool){
			for(boolean q:bool){
				System.out.println(p+"\t"+q+"\t"+(!(p||q))+"\t"+!(p||q));
				System.out.println(!p+"\t"+!q+"\t"+(!p&&!q));
				System.out.println("\t"+(!(p||q)==(!p&&!q)));
			}
		}
	}

}
