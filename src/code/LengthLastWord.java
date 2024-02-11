package code;

public class LengthLastWord {

	public static void main(String[] args) {
		System.out.println(lengthOfLastWord("Hello World"));
		System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
		System.out.println(lengthOfLastWord("luffy is still joyboy"));
		System.out.println(lengthOfLastWord(""));
		System.out.println(lengthOfLastWord("abc"));
		System.out.println(lengthOfLastWord("abc dd t"));
	}

	public static int lengthOfLastWord(String s) {

		char[] chars = s.toCharArray();

		int length = 0;

		for (int i = chars.length -1; i >= 0; i--) {
			if (chars[i] != ' ' && i > 0  && chars[i-1] == ' '){
				length++;
				break;
			}
			if (chars[i] != ' '){
				length++;
			}
		}
		return length;

	}

}
