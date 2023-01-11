package Question;

import java.util.Arrays;

//3. Insert integer numbers into an array, then copy the array elements into another array
public class Ex02_Q03 {

	public static void main(String[] args) {
 int[] arr = { 1, 2, 5, 6};
 
 int[] arr2 = arr.clone();
 
 System.out.println(Arrays.toString(arr2));
	}

}
