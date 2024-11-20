package lecture_02;
import java.util.*;

public class pattern_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();  // Number of rows

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

			// Print alternating * and !
			int j = 1;
			while (j <= star) {
				if (j % 2 != 0) {
					System.out.print("* ");
				} else {
					System.out.print("! ");
				}
				j++;
			}

			// Move to the next row
			System.out.println();
			row++;
			space--;
			star += 2;
		}

		sc.close();
	}
}
/*package lecture_02;
import java.util.*;
public class pattern_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
	//	int a=sc.nextInt();
		int star = 1;
		int row = 1;
		int space = n - 1;
		while (row <= n) {
			// space
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}
			// star
			int j = 1;
			while (j <= star) {
				if (j % 2 != 0) {
					System.out.print("* ");
				} else {
					System.out.print("! ");
				}
				j++;
			}
			// next row Perp
			System.out.println();
			row++;
			space--;
			star += 2;// star = star + 2;
		}
	}

}*/