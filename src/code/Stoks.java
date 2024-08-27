package code;

public class Stoks {

	public static void main(String[] args) {
		Stoks stoks = new Stoks();
		int[] prices = new int[]{7,1,5,3,6,4};
		System.out.println("result: " + stoks.maxProfit(prices));

		prices = new int[]{1,2,3,4,5};
		System.out.println("result: " + stoks.maxProfit(prices));

		prices = new int[]{7,6,4,3,1};
		System.out.println("result: " + stoks.maxProfit(prices));

		prices = new int[]{7,1,5,3,6,4,8};
		System.out.println("result: " + stoks.maxProfit(prices));

		prices = new int[]{};
		System.out.println("result: " + stoks.maxProfit(prices));

		prices = new int[]{7,1,5,8,6,4,5};
		System.out.println("result: " + stoks.maxProfit(prices));


	}

	public int maxProfit(int[] prices) {
		int sum = 0;
		for (int i = 0; i < prices.length - 1; i++) {
			int dif = prices[i + 1] - prices[i];
			if(dif > 0){
//				System.out.println(">>>>>>>>>>>>>>>");
//				System.out.println(prices[i]);
//				System.out.println(dif);
				sum += dif;
			}
		}
         return sum;
	}


}
