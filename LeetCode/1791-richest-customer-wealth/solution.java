class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for(int[] customers : accounts){
            int rowSum = 0;
            for(int amount : customers) rowSum += amount;
            maxWealth = Math.max(maxWealth,rowSum);
        }
        return maxWealth;
    }
}
