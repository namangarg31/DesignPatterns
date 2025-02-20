public class MyHashMap <K, V> {
    private static final int INITIAL_SIZE = 1 << 4; // 16
    private static final int MAXIMUM_CAPACITY = 1 << 30; // HashMap size should be 2^x
    private static final float LOAD_FACTOR = 0.75f;
    private int currBucketSize = 0;
    static class Entry<K, V> {
        public K key;
        public V value;
        public Entry<K, V> next;
        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
    private Entry[] hashTable;
    public MyHashMap() {
        hashTable = new Entry[INITIAL_SIZE];
    }
    public MyHashMap(int capacity) {
        hashTable = new Entry[capacity];
    }
    public void put(K key, V value) {
        int hashCode = key.hashCode() % hashTable.length;
        Entry node = hashTable[hashCode];
        if(node == null) {
            hashTable[hashCode] = new Entry<K, V>(key, value);
            currBucketSize++;
        }
        else {
            while(node.next != null) {
                if(node.key == key) {
                    node.value = value;
                    return;
                }
                node = node.next;
            }
            node.next = new Entry<K, V>(key, value);
        }
        if(currBucketSize >= hashTable.length * LOAD_FACTOR) {
            resize();
        }
    }
    public void resize() {
        if(2L * hashTable.length >= MAXIMUM_CAPACITY) {
            return;
        }
        Entry[] oldHashTable = hashTable;
        hashTable = new Entry[2 * oldHashTable.length];
        currBucketSize = 0;
        for (Entry entry : oldHashTable) {
            while(entry != null) {
                put((K) entry.key, (V) entry.value);
                entry = entry.next;
            }
        }
    }
    public V get(K key) {
        int hashCode = key.hashCode() % hashTable.length;
        Entry node = hashTable[hashCode];
        while(node != null) {
            if(node.key.equals(key)) {
                return (V) node.value;
            }
            node = node.next;
        }
        return null;
    }
}
