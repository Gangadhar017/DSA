package lecture_14;

public class Book_Allocation {
	public static void main(String[] args) {
		int[] page = { 10, 20, 30, 40 }; // pages in each book
		int nos = 2; // number of students

		// Call the MinimumPage function to get the result
		int result = MinimumPage(page, nos);
		System.out.println("Minimum number of pages each student has to read: " + result);
	}

	/**
	 * Finds the minimum number of pages each student has to read to ensure that
	 * no student has to read more than the minimum maximum pages.
	 *
	 * @param page The array of pages in each book.
	 * @param nos  The number of students.
	 * @return The minimum maximum pages.
	 */
	public static int MinimumPage(int[] page, int nos) {
		int lo = 0;
		int hi = 0;
		int ans = 0;

		// Set the initial hi as the sum of all pages (max pages if only 1 student)
		for (int i = 0; i < page.length; i++) {
			hi += page[i];
		}

		// Perform binary search on the answer range
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (isitpossible(page, nos, mid)) {
				ans = mid;
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}
		}
		return ans;
	}

	/**
	 * Checks if it is possible to allocate books to students so that no student
	 * reads more than 'mid' pages.
	 *
	 * @param page The array of pages in each book.
	 * @param nos  The number of students.
	 * @param mid  The maximum pages any student should read.
	 * @return True if possible, otherwise false.
	 */
	public static boolean isitpossible(int[] page, int nos, int mid) {
		int student = 1;
		int readpage = 0;

		for (int i = 0; i < page.length; i++) {
			// Check if the current student can read the current book
			if (readpage + page[i] <= mid) {
				readpage += page[i];
			} else {
				// Assign books to the next student
				student++;
				readpage = page[i];

				// If students exceed the available number, allocation is not possible
				if (student > nos) {
					return false;
				}
			}
		}
		return true;
	}
}

/*package lecture_14;

public class Book_Allocation {
	public static void main(String[] args) {
		int[] page = { 10, 20, 30, 40 };
		int nos = 2;
	}

	public static int MinimumPage(int[] page, int nos) {
		int lo = 0;
		int hi = 0;
		int ans = 0;
		for (int i = 0; i < page.length; i++) {
			hi = hi + page[i];
		}
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (isitpossible(page, nos, mid) == true) {
				ans = mid;
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}
		}
		return ans;
	}

	public static boolean isitpossible(int[] page, int nos, int mid) {
		// TODO Auto-generated method stub
		int student = 1;
		int readpage = 0;
		int i=0;
		while(i<page.length) {
			if(readpage+page[i]<=mid) {
				readpage+=page[i];
				i++;
			}
			else {
				student++;
				readpage=0;
			}
			if(student>nos) {
				return false;
			}
			
		}
		return true;
	}
}*/