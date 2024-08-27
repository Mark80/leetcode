package code;

public class ReverseNumber {

	private static final String MAX = Integer.valueOf(Integer.MAX_VALUE).toString();
	private static final String MIN = Integer.valueOf(Integer.MIN_VALUE).toString();

	public static void main(String[] args) {
		ReverseNumber reverseNumber = new ReverseNumber();


		System.out.println(Integer.MAX_VALUE);
		System.out.println(lessOrEqualsThen("12345"));
		System.out.println(lessOrEqualsThen(MAX));
		System.out.println(lessOrEqualsThen(Integer.valueOf(Integer.MAX_VALUE - 1).toString()));
		System.out.println(lessOrEqualsThen("9999999999999999999999999999"));
		System.out.println(lessOrEqualsThen("2147483647"));
		System.out.println(lessOrEqualsThen("2147483648"));
		System.out.println(lessOrEqualsThen("2147484647"));






	}


	public int reverse(int x) {
        return 1;
	}



	private static boolean lessOrEqualsThen(String value){
		if(value.length() < MAX.length())
			return true;
		if(value.length() > MAX.length())
			return false;
		for (int i = 0; i < value.length(); i++) {
            var digit = value.charAt(i);
            var digitMax = MAX.charAt(i);
			if(digit > digitMax )
				return false;
		}
		return true;
	}


	private static boolean greaterOrEqualsThen(String value){
		if(value.length() < MIN.length())
			return true;
		if(value.length() > MIN.length())
			return false;
		for (int i = 0; i < value.length(); i++) {
			var digit = value.charAt(i);
			var digitMax = MAX.charAt(i);
			if(digit > digitMax )
				return false;
		}
		return true;
	}

}
