package lecture_06;

import java.util.Scanner;

public class User_Input_and_Display {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter " + n + " elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Array elements: ");
		display(arr);
		sc.close();
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();  // Print a newline after displaying the array
	}
}
/*package lecture_06;

import java.util.Scanner;

public class User_Input_and_Display {

	public static void main(String[] args) {
		// code
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Display(arr);

	}

	public static void Display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}
	}

}
*/