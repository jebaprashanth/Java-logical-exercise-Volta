package Question;
import java.util.Scanner;


//2.Check whether a String is Palindrome. i.e. when the word is reversed, it gives the same word. E.g.
//“Madam” is a Palindrome


public class Question02 {

	public static void main(String args[]) {
		
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("type the word ");
			String str = scanner.nextLine();
			
			String reversedString = new StringBuilder(str).reverse().toString();
			
			 if (str.replaceAll("\\s", "").equalsIgnoreCase(reversedString.replaceAll("\\s", ""))) {
			      System.out.println("The string is a palindrome.");
			    } 
			 else {
			      System.out.println("The string is not a palindrome.");
			 	}
		
		
	    

		}
	}
}
