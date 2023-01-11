package Question;
//3.Given an Integer array “A”, Write a program to sum the elements of A

import java.util.Arrays;

public class Ex01_Question03 {

	public static void main(String[] args) {
		int[] A = {1, 2, 3, 4, 5, 6};
		
		int sum =  Arrays.stream(A).sum();
		System.out.println(sum);
	}

}
