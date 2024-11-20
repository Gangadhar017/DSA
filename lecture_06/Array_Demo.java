/*package lecture_06;

public class Array_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		System.out.println(arr);
		int[] other = arr;
		System.out.println(other.length);
		// set
		arr[0] = 9;
		arr[1] = 15;
		arr[2] = -2;
		arr[3] = 6;
		arr[4] = 11;

		// print
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		int[] ar = { 10, 2, 3, 4, 4 };
		int[] ar1 = new int []{ 10, 2, 3, 4, 4 };

	}

}
*/
package lecture_06;

import java.util.Arrays;

public class Array_Demo {

	public static void main(String[] args) {
		int[] arr = new int[5];
		System.out.println("Array reference (memory address): " + arr);
		System.out.println("Array contents (before setting values): " + Arrays.toString(arr));

		// Assigning values
		arr[0] = 9;
		arr[1] = 15;
		arr[2] = -2;
		arr[3] = 6;
		arr[4] = 11;
		
		// Print array contents after setting values
		System.out.println("Array contents (after setting values): " + Arrays.toString(arr));
		
		// Creating a reference copy
		int[] other = arr;
		System.out.println("Length of 'other' array (same as arr): " + other.length);

		// Modifying arr to show the effect on other
		arr[1] = 99;
		System.out.println("Updated 'arr' after modification: " + Arrays.toString(arr));
		System.out.println("Contents of 'other' after modifying 'arr' (same reference): " + Arrays.toString(other));
		
		// Direct initialization of arrays
		int[] ar = { 10, 2, 3, 4, 4 };
		int[] ar1 = new int[]{ 10, 2, 3, 4, 4 };
		
		// Printing initialized arrays
		System.out.println("Array 'ar': " + Arrays.toString(ar));
		System.out.println("Array 'ar1': " + Arrays.toString(ar1));
	}
}







