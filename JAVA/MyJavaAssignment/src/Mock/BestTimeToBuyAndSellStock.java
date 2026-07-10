package Mock;

public class BestTimeToBuyAndSellStock {
	public static void main(String[] args) {
		
		int price[] = {20,22,34,67,83};
		int min = price[0];
		
		int maxProfit = 0;
		
		
		for(int i = 1; i < price.length; i++) {
			
			if(price[i] < min) {
				min = price[i];
			}
			int profit = price[i] - min;
			
			if(profit > maxProfit) {
				maxProfit = profit;
			}
		}
		System.out.println(maxProfit);
	}
}
