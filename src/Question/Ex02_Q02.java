package Question;


//2.  Assume that you are given a word, write a logic to count the number of vowels and consonants in the
//given word
//E.g.: - given word: ALPHABET No of Vowels: 3 &amp; consonants: 5

public class Ex02_Q02 {

	public static void main(String args[]) {
		
		String word = "ALPHABET";
		int consonants = word.replaceAll("[aeiouAEIOU ]", "").length();
		int vowels = word.replaceAll(" ", "").length() - word.replaceAll("[aeiouAEIOU ]", "").length();
		
		System.out.println("Vowels are: " + vowels +"   constants are: " + consonants);
	}
}
