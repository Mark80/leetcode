package code;

public class LongestPalindrome {

	public static void main(String[] args) {

		System.out.println(isAPalindrome("etttttte", 0, 7));

		System.out.println(longestPalindrome("babad"));
		System.out.println(longestPalindrome("asdfgfdsa"));
		System.out.println(longestPalindrome("b"));
		System.out.println(longestPalindrome("bsetttttte"));

		System.out.println(longestPalindrome("bb"));
	}

	public static String longestPalindrome(String s) {
		var evalLength = s.length();

		while (evalLength > 1) {
			var x = 0;
			while (x + evalLength - 1  < s.length()) {
				if (isAPalindrome(s, x, x + evalLength - 1))
					return s.substring(x, x + evalLength);
				x++;
			}
			evalLength--;
		}

		return s.substring(0, 1);
	}

	private static boolean isAPalindrome(String s, int x, int y) {
		var isAPalindrome = true;
		while (x < y) {
			isAPalindrome = s.charAt(x) == s.charAt(y);
			if (!isAPalindrome)
				break;
			x++;
			y--;
		}
		return isAPalindrome;
	}

}
