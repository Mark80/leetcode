package code;


/*

Example 1:

Input: n = 4

Output: "1211"

Explanation:

countAndSay(1) = "1"
countAndSay(2) = RLE of "1" = "11"
countAndSay(3) = RLE of "11" = "21"
countAndSay(4) = RLE of "21" = "1211"
Example 2:

Input: n = 1

Output: "1"

Explanation:

This is the base case.

3322251 -> 23321511
           233215
 */

public class CountASay {

	public static void main(String[] args) {
		CountASay c = new CountASay();
		System.out.println(c.countToSay("3322251"));
		System.out.println(c.countToSay("2"));
		System.out.println(c.countToSay("33333"));

		System.out.println(c.countToSay("1"));
		System.out.println(c.countToSay("11"));
		System.out.println(c.countToSay("21"));

		System.out.println(c.countAndSay(1));
		System.out.println(c.countAndSay(2));
		System.out.println(c.countAndSay(4));
		System.out.println(c.countAndSay(5));

	}

	public String countAndSay(int n) {
		String result = "1";
		while (n > 1) {
			result = countToSay(result);
			n--;
		}

		return result;
	}

	public String countToSay(String s) {
		StringBuilder result = new StringBuilder();
		int count = 1;
		int i = 0;
		int j = 1;

		while (i <= s.length() - 1) {
			if (j > s.length() - 1) {
				result.append(count).append(s.charAt(i));
				break;
			}
			if (s.charAt(i) == s.charAt(j)) {
				count++;
				j++;
			} else {
				result.append(count).append(s.charAt(i));
				i = j;
				j = j + 1;
				count = 1;
			}
		}
		return result.toString();
	}

}
