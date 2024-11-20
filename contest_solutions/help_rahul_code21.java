package contest_solutions;

import java.util.Scanner;
public class help_rahul_code21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Input array size
		int n = sc.nextInt();
		
		// Input array elements
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int target = sc.nextInt();
		
		// Perform search and print result
		int result = searchInRotatedArray(arr, target);
		System.out.println(result);
		
		sc.close();
	}

	public static int searchInRotatedArray(int[] arr, int target) {
		int left = 0, right = arr.length - 1;
		
		while (left <= right) {
			int mid = left + (right - left) / 2;
			
			// Check if the mid element is the target
			if (arr[mid] == target) {
				return mid;
			}
			
			// Determine which side is sorted
			if (arr[left] <= arr[mid]) {
				// Left side is sorted
				if (target >= arr[left] && target < arr[mid]) {
					right = mid - 1;
				} else {
					left = mid + 1;
				}
			} else {
				// Right side is sorted
				if (target > arr[mid] && target <= arr[right]) {
					left = mid + 1;
				} else {
					right = mid - 1;
				}
			}
		}
		
		// If the target is not found, return -1
		return -1;
	}
}
