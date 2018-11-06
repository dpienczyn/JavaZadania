/*Napisz program, który w formie tabeli przedstawi dziaanie operatorów logicznych (plik 	ródowy: OperatoryLogiczne.java).
Moesz zbudowa	 dwuelementow tablic wartoci logicznych i uy	 ptli typu for each do pobierania wartoci z tej tablicy. Dziki zagniedeniu ptli moesz w atwy sposób przetestowa	 wszystkie wartoci dla dwóch i wikszej liczby zda logicznych. Do dyspozycji masz trzy operatory:  ! — negacj (NOT),  & lub && — koniunkcj (iloczyn logiczny, AND),  | lub || — alternatyw (sum logiczn, OR).
*/
package zadania;

public class OperatoryLogiczne {

	public static void main(String[] args) {
		
        boolean[] bool = {false, true};
        System.out.println("Operator negacji (NOT) - !");
        
        for(boolean p: bool){
        	System.out.println(p+"\t"+!p);
        }
        System.out.println("Operator koniunkcji - (&)");
        
        for(boolean p:bool){
        	for(boolean q:bool){
        	System.out.println(p+"\t"+q+"\t"+(p&q));
        }
        	
        	System.out.println("Operator alternatywy - (|)");
            
            for(boolean o:bool){
            	for(boolean q:bool){
            	System.out.println(o+"\t"+q+"\t"+(o|q));
            }
        }
	}}}
