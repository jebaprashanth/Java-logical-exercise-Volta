package Question;

import java.util.Arrays;

//8.Write a logic to rotate an array in cyclic order. For example, if we have input numbers 2,3,7,6,4 into an
//array. Your program should rotate this as 4,2,3,7,6

public class Ex01_Question08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {2, 3, 7, 6, 4};
		int[] newarray = new int[arr.length];
		
		 for (int i = 0; i < arr.length; i++) {
		   newarray[(((arr.length) + i)%(arr.length))] = arr[i];

		 }
		System.out.println(Arrays.toString(newarray)); 
	}

}
