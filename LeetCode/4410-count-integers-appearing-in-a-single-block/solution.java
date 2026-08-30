class Solution {
    public int countSpecialIntegers(int[] nums) {
        int cnt = 0;
        boolean[] processed =  new boolean[101];
        for(int i=0;i<nums.length;i++){
            int target = nums[i];
            if(processed[target])continue;
            processed[target] = true;
            
            int prev = -1;
            boolean valid = true;
            
            for(int j=0;j<nums.length;j++){
                if(nums[j] == target){
                    
                    if(prev != -1 && j - prev != 1) {
                            valid = false;
                            break;
                    }
                    
                    prev  = j;
                }
            }
            if(valid) cnt++;
        }
        return cnt;
    }
}
