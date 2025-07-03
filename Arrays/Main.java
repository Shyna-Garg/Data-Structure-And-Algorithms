//my approach to solve ...

public class Main {
   
  
  public static int buyAndSell(int prices[]){
  
  int buyPrice= prices[0];
  int maxProfit=0;
  
    for (int i = 1; i<prices.length;i++){
      if (buyPrice>prices[i]){
      buyPrice = prices [i]  ;
      }
      else{
        maxProfit = Math.max(maxProfit,prices[i]-buyPrice);
      }
    }
      return maxProfit;
      }
    
    public static void main(String[] args) {
      int prices[]={7,6,4,3,1};
      System.out.println(buyAndSell(prices));
  }
}