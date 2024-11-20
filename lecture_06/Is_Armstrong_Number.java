package lecture_06;

import java.util.Scanner;

public class Is_Armstrong_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check if it's an Armstrong number: ");
		int n = sc.nextInt();
		System.out.println("Is Armstrong Number: " + isArmstrongNumber(n));
		sc.close();
	}

	public static boolean isArmstrongNumber(int n) {
		int numDigits = countOfDigits(n);
		int sum = 0;
		int temp = n;
		while (n > 0) {
			int rem = n % 10;
			sum += Math.pow(rem, numDigits);
			n = n / 10;
		}
		return sum == temp;
	}

	public static int countOfDigits(int n) {
		int count = 0;
		while (n > 0) {
			n = n / 10;
			count++;
		}
		return count;
	}
}
/*package lecture_06;

import java.util.Scanner;

public class Is_Armstrong_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(Armstrong_Number(n));

	}
	public static boolean Armstrong_Number(int n) {
		int cod=Countofdigit(n);
		int sum=0;
		int p=n;
		while(n>0) {
			int rem=n%10;
			sum = (int) (sum + Math.pow(rem,cod));
			n=n/10;
		}
		if(sum==p) {
			return true;
		}
		else {
			return false;
		}
	}

	public static int Countofdigit(int n) {
		int c = 0;
		while (n > 0) {
			n = n / 10;
			c++;
		}
		return c;
	}
}*/