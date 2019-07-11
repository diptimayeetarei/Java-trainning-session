package interview;

public class RemoveJunkCharacters {
	static String s="@#$&* latin string 78909895";

	public static void main(String[] args) {
		//we have to use regular expression
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

	}

}
