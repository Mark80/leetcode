package code;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Parentheses {

	public static void main(String[] args) {

		Parentheses parentheses = new Parentheses();

		System.out.println(parentheses.generateParenthesis(1));
		System.out.println(parentheses.generateParenthesis(2));
		System.out.println(parentheses.generateParenthesis(3));
		System.out.println(List.of("((()))", "(()())", "(())()", "()(())", "()()()"));
		System.out.println(parentheses.generateParenthesis(4));

	}

	public List<String> generateParenthesis(int n) {
		ArrayList<String> list = new ArrayList<>();
		list.add("(");
		return generateParenthesisLoop(n * 2, 1, 0, list);
	}

	public List<String> generateParenthesisLoop(int n, int aperte, int chiuse, List<String> list) {
		if (aperte + chiuse == n)
			return list;

		if (aperte == n / 2) {
			List<String> l = addParentheses(list,  ")");
			return generateParenthesisLoop(n, aperte, ++chiuse, l);
		}
		if (aperte > chiuse) {
			List<String> l1 = addParentheses(list,  ")");
			List<String> l2 = addParentheses(list,  "(");
			List<String> list1 = generateParenthesisLoop(n, aperte, chiuse + 1, l1);
			list1.addAll(generateParenthesisLoop(n, aperte + 1, chiuse, l2));
			return list1;
		} else {
			List<String> l2 = addParentheses(list,  "(");
			return generateParenthesisLoop(n, aperte + 1, chiuse, l2);
		}
	}

	private List<String> addParentheses(List<String> list, String par) {
		List<String> newList = new ArrayList<>();
		list.forEach(p -> newList.add(p + par));
		return newList;
	}

}
