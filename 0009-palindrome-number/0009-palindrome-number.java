class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int n=s.length();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
}