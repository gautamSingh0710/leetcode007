class Solution {
    public String toLowerCase(String s) {
    String r="";
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)>='A'&&s.charAt(i)<='Z'){
            r+=(char)(s.charAt(i)+32);
        }
        else r+=s.charAt(i);
    }
    return r;
    }
}