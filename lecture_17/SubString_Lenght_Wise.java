package lecture_17;

public class SubString_Lenght_Wise {

	public static void main(String[] args) {
		// code
		String str = "CodingBlocks";
		PrintSubString(str);

	}

	public static void PrintSubString(String s) {
		for (int len = 1; len <= s.length(); len++) {
			for (int j = len; j <= s.length(); j++) {
				int i = j - len;
				System.out.println(s.substring(i, j));
			}
		}
	}

}