class Trie {
    Trie root;
    Trie [] children;
    boolean eow;
    public Trie() {
        eow=false;
        children=new Trie[26];
         root =this;
    }
    
    public void insert(String word) {
        Trie curr=root;
        for(char ch:word.toCharArray()){
            if(curr.children[ch-'a']==null){
                curr.children[ch-'a']= new Trie();
            }
            curr=curr.children[ch-'a'];
        }
        curr.eow=true;

    }
    
    public boolean search(String word) {
        Trie curr=root;
        for(char ch : word.toCharArray()){
            if(curr.children[ch-'a']==null){
                return false;
            }
            curr=curr.children[ch-'a'];
        }
        return curr.eow;
    }
    
    public boolean startsWith(String prefix) {
        Trie curr=root;
        for(char ch : prefix.toCharArray()){
            if(curr.children[ch-'a']==null){
                return false;
            }
            curr=curr.children[ch-'a'];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */