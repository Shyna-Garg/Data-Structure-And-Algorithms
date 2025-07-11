public class stocks2 {
    public static int stocks(int arr[]) {
        int maxprofit = 0;

        int profit;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] > arr[i]) {
                    profit = arr[j] - arr[i];
                    maxprofit = Math.max(maxprofit, profit);
                }

            }

        }

        return maxprofit;

    }

    public static void main(String[] args) {
        int arr[] = { 7, 5, 8, 1 };

        System.out.print(stocks(arr));

    }
}

// output --> 3