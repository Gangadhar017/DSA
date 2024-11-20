package lecture_02;

public class pattern_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int star = n;
		int row = 1;
		while (row <= n) {
			// star
			int i = 1;
			while (i <= star) {
				System.out.print("* ");
				i++;
			}
			// next row prep
			System.out.println();
			row++;
		}

	}

}