package zadania;

public class StringNapis {

	public static void main(String[] args) {
		String napis = "Ala ma kota";
		System.out.println(napis.charAt(4));
		System.out.println(napis.length());
		System.out.println(napis.indexOf(5));
		System.out.println(napis.substring(3));
		System.out.println(napis.substring(2, 5));
		System.out.println(napis.concat("kota"));
		System.out.println(napis.replaceAll("a", "u"));
		System.out.println(napis.replaceFirst("la", "ka"));

	}

}
