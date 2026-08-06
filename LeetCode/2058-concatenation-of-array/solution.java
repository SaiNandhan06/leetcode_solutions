import java.util.*;

class Solution {
    public int[] getConcatenation(int[] nums) {
        Scanner input = new Scanner(System.in);
        int n = nums.length;
        int[] ans = new int[2*n];
        for(int i=0;i<n;i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }
}
