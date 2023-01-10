package Question;

import java.util.Arrays;

//Exercise 01 - Question 01

//Write a program to compute the standard deviation
//    Steps: 
//    A. Create the array with 10 numbers
//    B. Calculate the average of the 10 numbers
//  C. Find the difference between each element of the array and the average, then square the
//difference. Thereafter, sum the squares of differences calculated and divide by the number of elements
//(10) and then find the square root.

public class Question01 {

	
	public static void main(String args[]) {
		
		int[] numbers = {1, 2, 3, 4, 5,6 ,7,8,9,10};
		double SquareSum = 0;
		
		double average = Arrays.stream(numbers).average().getAsDouble();
		
		for (int number : numbers) {
		      double difference = number - average;
		      double squareOfDifference = difference * difference;
		      SquareSum += squareOfDifference;
		    }
		
//		System.out.println(SquareSum);

		double SqureSTD = SquareSum / numbers.length;
		double STD = Math.sqrt(SqureSTD);
		
		System.out.println("Standard deviation: " + STD);
		
	}

	

	
	
}
