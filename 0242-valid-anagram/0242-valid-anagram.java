class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;}
        char arr[] = s.toCharArray();
        Arrays.sort(arr);
        String an = new String(arr);
        char ar[] = t.toCharArray();
        Arrays.sort(ar);
        String ans = new String(ar);
        for(int i=0;i<s.length();i++){
        if(an.charAt(i)!=ans.charAt(i)){
             return false;
        }
        
        }
        return true;
    }
}