package Question;
import java.util.Scanner;
//
////4.Write a logic to input characters one by one into a single dimensional array and thereafter reversely
////print the contents in the array.



public class Ex01_Question04 {
    public static void main(String[] args) {
    	
    	
    	 try (Scanner scanner = new Scanner(System.in)) {
			char[] input = new char[10];

			 // Input characters one by one
			 for (int i = 0; i < 10; i++) {
			     System.out.print("Enter character " + (i+1) + ": ");
			     input[i] = scanner.next().charAt(0);
			 }
			 
			 for (int i = 9; i >= 0; i--) {
			     System.out.print(input[i]);

			 }
		}
         

    }
}



