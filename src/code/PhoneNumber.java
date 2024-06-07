package code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneNumber {

	static Map<String, List<String>> buttons = new HashMap<>() {

		{
			put("2", List.of("a", "b", "c"));
			put("3", List.of("d", "e", "f"));
			put("4", List.of("g", "h", "i"));
			put("5", List.of("j", "k", "l"));
			put("6", List.of("m", "n", "o"));
			put("7", List.of("p", "q", "r", "s"));
			put("8", List.of("t", "u", "v"));
			put("9", List.of("w", "x", "y", "z"));
		}

	};

	public static void main(String[] args) {
		PhoneNumber phoneNumber = new PhoneNumber();
		System.out.println(phoneNumber.letterCombinations(""));
		System.out.println(phoneNumber.letterCombinations("2"));
		System.out.println(phoneNumber.letterCombinations("23"));
		System.out.println(phoneNumber.letterCombinations("22"));
		System.out.println(phoneNumber.letterCombinations("29"));
	}

	public List<String> letterCombinations(String digits) {
		ArrayList<List<String>> lists = new ArrayList<>();
		List<String> nums = new ArrayList<>();
		for (Character c : digits.toCharArray()) {
			nums.add(c.toString());
		}

		for (String num : nums) {
			lists.add(buttons.get(num));
		}

		return lists.stream().reduce(new ArrayList<>(), (word1, word2) -> merge(word1, word2 != null ? word2 : new ArrayList<>()));
	}

	private static List<String> merge(List<String> word1, List<String> word2) {
		if (word2.isEmpty()) {
			return word1;
		}

		if (word1.isEmpty()) {
			return word2;
		}

		ArrayList<String> strings = new ArrayList<>();
		for (String fletter : word1) {
			for (String sletter : word2) {
				strings.add(fletter + sletter);
			}
		}
		return strings;
	}

}
