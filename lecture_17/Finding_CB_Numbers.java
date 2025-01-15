package lecture_17;

public class Finding_CB_Numbers {
	public static void main(String[] args) {

	}

	public static void PrintSubString(String s) {
		int c = 0;
		boolean[] visited = new boolean[s.length()];
		for (int len = 1; len <= s.length(); len++) {
			for (int j = len; j <= s.length(); j++) {
				int i = j - len;
				long num = Long.parseLong(s.substring(i, j));
				if (isCBnumber(num) && isvisited(visited, i, j)) {
					c++;
					for (int k = i; k < j; k++) {
						visited[k] = true;
					}
				}
			}
		}
		System.out.println(c);
	}

	public static boolean isvisited(boolean[] visited, int i, int j) {
		for (int k = i; k < j; k++) {
			if (visited[k] == true) {
				return false;
			}
		}
		return true;
	}

	public static boolean isCBnumber(long num) {
		if (num == 0 || num == 1) {
			return false;
		}
		int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				return true;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (num % arr[i] == 0) {
				return false;
			}
		}
		return true;
	}
}/*package lecture_17;

public class Finding_CB_Numbers {
	 static int[] cb = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};

	public static void main(String[] args) {
		// code
		String s="81615";
		System.out.print(lengthwise_subs(s));

	}
	public static boolean isCBNumber(long num) {
		if(num==0 || num==1) return false;
		for(int i=0;i<cb.length;i++) {
			if(num==cb[i]) {
				return true;
			}
		}
		
		for(int i=0;i<cb.length;i++) {
			if(num%cb[i]==0) {
				return false;
			}
		}
		
	return true;
	}
	public static int  lengthwise_subs(String s) {
		int c=0;
		for(int len=1; len<s.length();len++) {
			for(int j=len;j<=s.length();j++) {
				int i=j-len;;
				long num=Long.parseLong(s.substring(i,j));
				if(isCBNumber(num)) {
					c++;
				}
			}
		}
		return c;
	}

}*/