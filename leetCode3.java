

public class leetCode3 {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int[] prices){
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                int profit = prices[j] - prices[i];
                if(profit>maxProfit){
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
}
