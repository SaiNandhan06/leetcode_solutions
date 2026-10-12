class Solution {
    public int lengthOfLongestSubstring(String s) {
        int p1 = 0;
        int maxLen = 0;
        HashSet<Character> set = new HashSet<>();
        for(int p2 =0;p2<s.length();p2++){
            //if there is repetition
            while(set.contains(s.charAt(p2))){
                set.remove(s.charAt(p1));
                p1++;
            }
            //without any repeation
            set.add(s.charAt(p2));
            maxLen = Math.max(maxLen,p2-p1+1);
        }
        return maxLen;
    }
}
