public class DesignHashMap {
}
class MyHashMap {
    int a[]= new int[100001];

    /** Initialize your data structure here. */
    public MyHashMap() {


    }

    /** value will always be non-negative. */
    public void put(int key, int value) {

        a[key]= value+1;

    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        return a[key]-1;
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        a[key]  = 0;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */