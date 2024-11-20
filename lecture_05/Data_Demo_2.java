package lecture_05;

import java.util.Scanner;

public class Data_Demo_2 {
	public static void main(String[] args) {
		double d = 6.8;
		float f = 67.9f;
		boolean b1 = true;
		boolean b2 = false;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a double value: ");
		d = sc.nextDouble();
		System.out.print("Enter a float value: ");
		f = sc.nextFloat();
		System.out.print("Enter first boolean value (true/false): ");
		b1 = sc.nextBoolean();
		System.out.print("Enter second boolean value (true/false): ");
		b2 = sc.nextBoolean();
		
		// Print the values to verify input
		System.out.println("Double value: " + d);
		System.out.println("Float value: " + f);
		System.out.println("First boolean value: " + b1);
		System.out.println("Second boolean value: " + b2);
		
		// Example of using b2
		if (b1 && b2) {
			System.out.println("Both boolean values are true.");
		} else if (!b1 && !b2) {
			System.out.println("Both boolean values are false.");
		} else {
			System.out.println("One of the boolean values is true and the other is false.");
		}
		
		sc.close();
	}
}
