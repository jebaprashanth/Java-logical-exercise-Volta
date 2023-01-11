package Question;

import java.util.Arrays;

//7.Write a logic to Swap the first and last element of an array into a new array and print the new array

public class Ex01_Question07 {

	
	public static void main(String args[]) {
		int[] arr = {5, 10, 25, 63, 85 };
		
		int[] new_array = arr.clone();
		

		new_array[(new_array.length - 1)] = arr[0];
		new_array[0] = arr[(arr.length - 1)];
		
		System.out.println(Arrays.toString(new_array));
	}
}
