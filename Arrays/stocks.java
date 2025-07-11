

public class stocks {
  public static int buyAndSellStocks(int num[]) {
    int maxProfit = 0;
    int buyPrice = Integer.MAX_VALUE;
    for (int i = 0; i < num.length; i++) {
      if (buyPrice < num[i]) {
        int profit = num[i] - buyPrice;
        maxProfit = Math.max(profit, maxProfit);
      } else {
        buyPrice = num[i];
      }
    }
    return maxProfit;
  }

  public static void main(String[] args) {
    int num[] = { 7, 6, 4, 3, 1 };
    System.out.print(buyAndSellStocks(num));
  }
}

//output--> 0