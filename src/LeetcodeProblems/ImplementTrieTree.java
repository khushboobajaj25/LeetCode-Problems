package LeetcodeProblems;

public class ImplementTrieTree {
}
class Trie {
    Trie children[];
    boolean IsEnd;
    /** Initialize your data structure here. */
    public Trie() {
        children = new Trie[26];
        IsEnd = false;
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        Trie curr = this;
        char str[] = word.toCharArray();
        for(char c:str){
            int index = c-'a';
            if(curr.children[index]==null){
                curr.children[index] = new Trie();
            }
            curr = curr.children[index];
        }
        curr.IsEnd = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Trie curr = this;
        char str[] = word.toCharArray();
        for(char c:str){
            int index = c-'a';
            curr = curr.children[index];
            if(curr==null){
                return false;
            }
        }
        if(!(curr.IsEnd)){
            return false;
        }
        return true;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Trie curr = this;
        char str[]= prefix.toCharArray();
        for(char c:str){
            int index = c-'a';
            curr = curr.children[index];
            if(curr==null){
                return false;
            }
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