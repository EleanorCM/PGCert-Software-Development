package stringMethods;

public class StringMethods {

	public static void main(String[] args) {
		String myStr = "Eleanor Crossey Malone";
		System.out.printf("Original string: %s \n", myStr);
		System.out.println(String.format("The string is %o characters long", myStr.length()));
		System.out.printf("The first two characters are: %s\n", myStr.subSequence(0, 2) );
		System.out.println("All letters uppercase: " + myStr.toUpperCase());
		System.out.println("\"a\" replaced with \"%\": " + myStr.replace("a", "%") );
		System.out.println("First \"n\" at index " + myStr.indexOf("n"));
		System.out.println("Last \"n\" at index " + myStr.lastIndexOf("n"));
	}

}
