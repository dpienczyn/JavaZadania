package zadania;

public class Operatoryy {
	
	static boolean impl(boolean p, boolean q){
		return(Boolean.valueOf(p).compareTo(q)<1);
	}
	public static void main(String[] args) {
		boolean [] bool = {true, false};
		
		System.out.println("Prawo przechodniosci impikacji: ");
		for(boolean p:bool){
			for(boolean q:bool){
				for(boolean r:bool){
					System.out.println(p+"\t"+q+"\t"+r);
					System.out.println("\t"+impl(p,q)+"\t"+impl(q,r));
					System.out.println("\t"+(impl(p,q)&impl(q,r)));
					System.out.println("\t"+impl(p,r)+"\t");
					System.out.println(impl(impl(p,q)&impl(q,r), impl(p,r)));
				}
			}
		}

	}

}
