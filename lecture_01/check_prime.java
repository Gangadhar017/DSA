package lecture_01;

public class check_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		int c = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				c++;
				break;
			}
		}
		if (c >= 1) {
			System.out.println("Not Prime");
		} else {
			System.out.println("Prime");
		}

	}

}