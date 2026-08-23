class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder binaryStr = new StringBuilder();
        for(char c : s.toCharArray()){
            String b = String.format("%8s",Integer.toBinaryString(c)).replace(' ','0');
            binaryStr.append(b);
        }
        binaryStr.toString();
        int left = 0;
        int right = binaryStr.length() - 1;
        while(left < right){
            if(binaryStr.charAt(left) != binaryStr.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
