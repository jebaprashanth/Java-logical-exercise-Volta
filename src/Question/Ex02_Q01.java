package Question;

import java.util.ArrayList;
import java.util.Arrays;


//1. Write a logic to list down unique values and times of occurrence in a given array.
//E.g.:
//Stored list: (9,8,7,3,15,7,9,4,9,2,8,3,8,8)
//Expected output: 9 – 3, 8-4, 7-2, 3-2,15-1,4-1,2-1

public class Ex02_Q01 {

	
	public static void main(String[] args) {
        int[] array = {9, 8, 7, 3, 15, 7, 9, 4, 9, 2, 8, 3, 8, 8};

        ArrayList<Integer> dynamicArray = new ArrayList<>();
        
        for (int number : array) {
        	if (dynamicArray.contains(number)) {
        	}
        	else {
        		dynamicArray.add(number);
        	}
      		    }
        
        
        for (int number : dynamicArray) {
        	
        	long count = Arrays.stream(array).filter(x -> x == number).count();
        	System.out.println(number + " - " +  count);
        }
    }
}
