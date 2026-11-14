class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] preffix = new int[n];
        Arrays.fill(preffix,1);
        for(int i=1;i<n;i++){
            preffix[i] = preffix[i-1] * nums[i-1]; 
        }
        int[] suffix = new int[n];
        Arrays.fill(suffix,1);
        for(int i=n-2;i>=0;i--){
            suffix[i] = suffix[i+1] * nums[i+1]; 
        }

        int[] answer = new int[n];
        Arrays.fill(answer,1);
        for(int i=0;i<n;i++){
            answer[i] = preffix[i] * suffix[i];
        }
        return answer;
    }
}
