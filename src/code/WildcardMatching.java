package code;

public class WildcardMatching {

	public static void main(String[] args) {
//		System.out.println(isMatch("a", "a"));
//		System.out.println(isMatch("aa", "a"));
//		System.out.println(isMatch("aac", "aad"));
//		System.out.println(isMatch("aac", "aa?"));
//		System.out.println(isMatch("aa", "*"));
//		System.out.println(isMatch("bc", "?"));
//		System.out.println(isMatch("abc", "a*"));
		System.out.println(isMatch("abcabczzzde", "*abc???de"));

//		System.out.println(isMatch("bc", "?"));
//		System.out.println(isMatch("abc", "ab?"));
//		System.out.println(isMatch("abc", "a*"));
//		System.out.println(isMatch("abc", "ac*"));
//		System.out.println(isMatch("abcabczzzde", "*abc???de"));
//		System.out.println(isMatch("adceb", "* a* b"));
		//System.out.println(isMatch( "acdcb","a*c?b"));

	}

	public static boolean isMatch(String s, String p) {
		System.out.println(s);
		if(s.isEmpty() && p.isEmpty() || p.equals("*"))
			return true;

		if(s.isEmpty() || p.isEmpty())
			return false;

		if(s.startsWith("*") && s.length() > 1)
			differentSearch(s,p.substring(1));


		boolean match = s.charAt(0) == p.charAt(0) || p.charAt(0) == '?';

		if(p.charAt(0) == '*' && p.length() > 1){
			int index = searchIndex(s,p.charAt(1));
			s = s.substring(index);
			match = s.charAt(0) == p.charAt(0) || p.charAt(0) == '?';
		}

		return match && isMatch(s.substring(1), p.substring(1));
	}

	static boolean differentSearch(String s, String p){
		return false;
	}

	static int searchIndex(String s, char p){
		return s.indexOf(p, 1);
	}
}
