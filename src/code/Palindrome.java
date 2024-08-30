package code;

public class Palindrome {

	public static void main(String[] args) {
		Palindrome palindrome = new Palindrome();

		System.out.println(palindrome.isPalindrome(123));
		System.out.println(palindrome.isPalindrome(121));
		System.out.println(palindrome.isPalindrome(-121));
		System.out.println(palindrome.isPalindrome(1221));
		System.out.println(palindrome.isPalindrome(12213));
	}

	public boolean isPalindrome(int x) {
		var string = String.valueOf(x);

		for (int i = 0; i < string.length() / 2; i++) {
			if (string.charAt(i) != string.charAt(string.length() - i - 1))
				return false;
		}
		return true;
	}

}
