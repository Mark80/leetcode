package code;

public class IntegerToRoman {

	//	Symbol	Value
	//	I	1
	//	V	5
	//	X	10
	//	L	50
	//	C	100
	//	D	500
	//	M	1000

	public static void main(String[] args) {
		IntegerToRoman integerToRoman = new IntegerToRoman();
		//System.out.println(integerToRoman.intToRoman(1));
		System.out.println(integerToRoman.intToRoman(1000));
		System.out.println(integerToRoman.intToRoman(2000));
		System.out.println(integerToRoman.intToRoman(3000));
		System.out.println(integerToRoman.intToRoman(3500));
		System.out.println(integerToRoman.intToRoman(3900));
		System.out.println(integerToRoman.intToRoman(3990));
		System.out.println(integerToRoman.intToRoman(2990) + " " + "MMCMXC");
		System.out.println(integerToRoman.intToRoman(1990));
		System.out.println(integerToRoman.intToRoman(1990));
		System.out.println(integerToRoman.intToRoman(58) + " " + "LVIII");
		System.out.println(integerToRoman.intToRoman(3749) + " " + "MMMDCCXLIX");
		System.out.println(integerToRoman.intToRoman(1994) + " " + "MCMXCIV");
		System.out.println(integerToRoman.intToRoman(237) + " " + "CCXXXVII");





	}

	public String intToRoman(int num) {
		String result = "";

		while (num >= 1000) {
			result = result + "M";
			num -= 1000;
		}

		while (num / 100 == 9){
			result = result + "CM";
			num -= 900;
		}

		while (num >= 500){
			result = result + "D";
			num -= 500;
		}

		while (num / 100  == 4){
			result = result + "CD";
			num -= 400;
		}

		while (num >= 100){
			result = result + "C";
			num -= 100;
		}

		while (num / 10 == 9){
			result = result + "XC";
			num -= 90;
		}

		while (num >= 50){
			result = result + "L";
			num -= 50;
		}

		while (num / 10 == 4){
			result = result + "XL";
			num -= 40;
		}

		while (num >= 10){
			result = result + "X";
			num -= 10;
		}

		while (num == 9){
			result = result + "IX";
			num -= 10;
		}

		while (num >= 5){
			result = result + "V";
			num -= 5;
		}

		while (num  == 4){
			result = result + "IV";
			num -= 4;
		}

		while (num >= 1){
			result = result + "I";
			num -= 1;
		}


		return result;
	}

}
