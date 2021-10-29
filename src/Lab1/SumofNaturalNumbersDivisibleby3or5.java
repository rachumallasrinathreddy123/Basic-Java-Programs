package Lab1;


import java.util.Scanner;
public class SumofNaturalNumbersDivisibleby3or5 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = scn.nextInt();
		System.out.println("Sum of natural numbers Divisible by 3 or 5 is: " + calculateSum(n));

		scn.close();
	}

	// Method for Calculate Sum of natural numbers.
	static int calculateSum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 || i % 5 == 0)
				sum = sum + i;
		}
		return sum;

	}
}