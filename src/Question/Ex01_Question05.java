package Question;

//5.Write a program to check if two given Strings are anagram of each other or not E.g, “Funeral” and
//“Real Fun” are anagram.

import java.util.Arrays;

public class Ex01_Question05 {
	
    public static void main(String[] args) {
    	
        String s1 = "Funeral";
        String s2 = "Real Fun";
        
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        char[] s1Chars = s1.toCharArray();
        char[] s2Chars = s2.toCharArray();
        
        Arrays.sort(s1Chars);
        Arrays.sort(s2Chars);
        
        if (Arrays.equals(s1Chars, s2Chars)) {
        	System.out.println(s1 + " and " + s2 + " are anagrams.");
        }
        else {
        	System.out.println(s1 + " and " + s2 + " are not anagrams.");
        }
        

    }
   
}