class Solution {
    public int maxProfit(int[] p) {
        int min=Integer.MAX_VALUE;
        int maxp=0;
        for(int i=0;i<p.length;i++){
            if(p[i]<min){
                min=p[i];
            }
            int profit=p[i]-min;
            if(profit>maxp){
                maxp=profit;
            }
        }
        return maxp;
    }
}
