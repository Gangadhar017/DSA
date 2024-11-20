package lecture_12;

import java.util.Scanner;

public class Input_and_Print {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Prompt for matrix dimensions
		System.out.print("Enter number of rows (n): ");
		int n = sc.nextInt();
		System.out.print("Enter number of columns (m): ");
		int m = sc.nextInt();

		// Check for valid dimensions
		if (n <= 0 || m <= 0) {
			System.out.println("Number of rows and columns must be positive integers.");
			sc.close();
			return;
		}

		// Initialize and populate the 2D array
		int[][] arr = new int[n][m];
		System.out.println("Enter matrix elements row by row:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		// Display the matrix
		System.out.println("The entered matrix is:");
		Display(arr);

		// Close the scanner
		sc.close();
	}

	public static void Display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}

/*package lecture_12;

import java.util.Scanner;

public class Input_and_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int m=sc.nextInt();
		int [] [] arr = new int [n][m];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		Display(arr);

	}

	public static void Display(int[][] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}






*/