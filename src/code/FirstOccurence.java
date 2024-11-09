package code;

public class FirstOccurence {

	public static void main(String[] args) {
		FirstOccurence firstOccurence = new FirstOccurence();
		System.out.println(firstOccurence.strStr("sadbutsad", "sad"));
		System.out.println(firstOccurence.strStr("leetcode", "leeto"));
		System.out.println(firstOccurence.strStr("aleetocode", "leeto"));
		System.out.println(firstOccurence.strStr("", ""));
		System.out.println(firstOccurence.strStr("asdfgh", "df"));
		System.out.println(firstOccurence.strStr("asdfgh", "h"));
		System.out.println(firstOccurence.strStr("asdfihdfgasssssdfihdfgasdfihdfgasssssidfihdfg", "gasssssi"));
		System.out.println(firstOccurence.strStr("aaa", "aaaa"));
		System.out.println(firstOccurence.strStr("aaa", "aaa"));
		System.out.println(firstOccurence.strStr("mississippi", "issip"));
		System.out.println(firstOccurence.strStr("mississippi", "issipi"));

	}

	public int strStr(String haystack, String needle) {
		if(needle.length() > haystack.length())
			return -1;
		char[] charArray = haystack.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			//System.out.println(i);
			if(i + needle.length() > charArray.length)
				break;
			int needleIndex = 0;

			if (charArray[i] == needle.charAt(0)) {
				//System.out.println("in if " + i);
				boolean check = true;
				while (check && needleIndex < needle.length()) {
					check = charArray[i + needleIndex] == needle.charAt(needleIndex);
					if (check) {
						needleIndex++;
					}
				}
				if (check) {
					return i;
				} else {
					i = i + 1;
				}

			}

		}
		return -1;
	}
}
