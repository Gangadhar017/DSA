package lecture_02;

import java.util.Scanner;

public class pattern_21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		int star = 1;
		int row = 1;
		int space = 2 * n - 3;

		while (row <= n) {
			// Print left stars
			int i = 1;
			while (i <= star) {
				System.out.print("* ");
				i++;
			}
			
			// Print spaces in the middle
			int j = 1;
			while (j <= space) {
				System.out.print("  ");
				j++;
			}
			
			// Print right stars (skip first star in last row to avoid duplication)
			int k = 1;
			if (row == n) {
				k = 2;
			}
			while (k <= star) {
				System.out.print("* ");
				k++;
			}
			
			// Move to the next row
			System.out.println();
			row++;
			star++;
			space -= 2;
		}
	}
}
/*package lecture_02;

import java.util.Scanner;

public class pattern_21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star = 1;
		int row = 1;
		int space = 2*n - 3;
		while (row <= n) {
			// star
			int i = 1;
			while (i <= star) {
				System.out.print("* ");
				i++;
			}
			// space
			int j = 1;
			while (j <= space) {
				System.out.print("  ");
				j++;
			}
			// star
			int k = 1;
			if(row==n) {
				k=2;
			}
			while (k <= star) {
				System.out.print("* ");
				k++;
			}
			// next Row Perp
			System.out.println();
			row++;
			star++;
			space -= 2;
		}
	}

}*/