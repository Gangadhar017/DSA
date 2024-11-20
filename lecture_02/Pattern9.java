package lecture_02; // Renamed package to avoid invalid characters

public class Pattern9 {

	public static void main(String[] args) {
		int n = 5;
		int star = 1;
		int row = 1;
		int space = n - 1;
		while (row <= n) {
			// Print spaces
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}
			// Print stars
			int j = 1;
			while (j <= star) {
				System.out.print("* ");
				j++;
			}
			// Prepare for the next row
			System.out.println();
			row++;
			space--;
			star += 2; // star = star + 2;
		}
	}
}
