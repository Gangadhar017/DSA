package lecture_02;

public class pattern_14 {

	public static void main(String[] args) {
		int n = 5; // Number of rows
		int star = 1; // Initial number of stars
		int space = n - 1; // Initial number of spaces

		for (int row = 1; row <= n; row++) {
			// Print leading spaces
			for (int i = 1; i <= space; i++) {
				System.out.print("  ");
			}

			// Print stars
			for (int j = 1; j <= star; j++) {
				System.out.print("* ");
			}

			// Move to the next line
			System.out.println();

			// Update the number of stars and spaces for the next row
			star += 2;
			space--;
		}
	}
}
/*package lecture_02;

public class pattern_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int star = 1;
		
		int row = 1;
		int space=n-1;
	}

}*/