class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long sum = 0;
        int i = 0;
        if((long)cost1+(long)cost2 <= costBoth){
            return (long)cost1*need1+(long)cost2*need2;
        }else{
            if(need1 > need2){
                i = cost1;
            }else{
                i = cost2;
            }
            int a = Math.min(need1,need2);
            sum += (long)costBoth*a;
        }
        if(i >= costBoth){
            sum += (long)costBoth*(Math.abs(need1-need2));
        }else{
            if(i == cost1){
                sum += (long)cost1*Math.abs(need1-need2);
            }else{
                sum += (long)cost2*Math.abs(need2-need1);
            }
        }
        return sum;
    }
}