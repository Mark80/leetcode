package code;

public class DivideTwoIntegers {

	public static void main(String[] args) {
		System.out.println(divide(10, 3));
		System.out.println(divide(0, 3));
		System.out.println(divide(7, 3));
		System.out.println(divide(-2147483648, -1));
		System.out.println(divide(2147483647, -1));
		System.out.println(divide(7, -3));
		System.out.println(divide(-7, -3));
		System.out.println(divide(-7, 3));
		System.out.println(divide(2147483647, 1));
		System.out.println(divide(-2147483648, 1));
		System.out.println(divide(-2147483648, 2));
		System.out.println(divide(-2147483648, -2147483648));
		System.out.println(divide(-2147483648, 2147483647));
		System.out.println(divide(1038925803, -2147483648));
	}

	public static int divide(int dividend, int divisor) {
		var q = 0;

		if(divisor == 1)
			return dividend;

		if(divisor == -1)
			return dividend == Integer.MIN_VALUE? Integer.MAX_VALUE: -dividend;

		if ((dividend > 0 && divisor > 0))
			while (dividend >= divisor) {
				q++;
				dividend = dividend - divisor;
				if (q == Integer.MAX_VALUE)
					return Integer.MAX_VALUE;
			}

		if ((dividend < 0 && divisor < 0))
			while (dividend <= divisor) {
				q++;
				dividend = dividend - divisor;
				if (q == Integer.MAX_VALUE)
					return Integer.MAX_VALUE;
			}

		if ((dividend > 0 && divisor < 0)) {
			if (divisor == Integer.MIN_VALUE)
				return 0;
			while (dividend >= -divisor) {
				q--;
				dividend = dividend + divisor;
				if (q == Integer.MIN_VALUE)
					return Integer.MIN_VALUE;
			}
		}

		if ((dividend < 0 && divisor > 0))
			while (dividend <= -divisor) {
				q--;
				dividend = dividend + divisor;
				if (q == Integer.MIN_VALUE)
					return Integer.MIN_VALUE;
			}

		return q;
	}

}
