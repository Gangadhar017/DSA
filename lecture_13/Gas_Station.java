package lecture_13;

public class Gas_Station {

	public static void main(String[] args) {
		int[] gas = { 1, 2, 3, 4, 5 };
		int[] cost = { 3, 4, 5, 1, 2 };

		// Call the canComplete function and display the result
		int startIndex = canComplete(gas, cost);
		if (startIndex != -1) {
			System.out.println("The car can start at station index: " + startIndex);
		} else {
			System.out.println("It is not possible to complete the circuit.");
		}
	}

	public static int canComplete(int[] gas, int[] cost) {
		int total = 0;
		for (int i = 0; i < cost.length; i++) {
			total += gas[i] - cost[i];
		}

		// If total gas is less than total cost, return -1
		if (total < 0) {
			return -1;
		}

		int idx = 0;  // Start index
		int curr = 0; // Current balance of gas

		for (int i = 0; i < cost.length; i++) {
			curr += gas[i] - cost[i];
			if (curr < 0) {
				// Reset current gas balance and update the starting index
				curr = 0;
				idx = i + 1;
			}
		}
		return idx;
	}
}
/*package lecture_13;

public class Gas_Station {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] gas = { 1, 2, 3, 4, 5 };
		int[] cost = { 3, 4, 5, 1, 2 };
	}

	public static int canComplete(int[] gas, int[] cost) {
		int total = 0;
		for (int i = 0; i < cost.length; i++) {
			total += gas[i] - cost[i];
		}
		if (total < 0) {
			return -1;
		}
		int idx = 0;
		int curr = 0;
		for (int i = 0; i < cost.length; i++) {
			curr += gas[i] - cost[i];
			if (curr < 0) {
				curr = 0;
				idx = i + 1;
			}
		}
		return idx;
		
	}
}*/