import java.util.Arrays;

public class MyHashMap<K, V> {
    private Object[] arr = new Object[10];
    private int size;

    public void put(K key, V value) {
        Entry entry = new Entry(key, value);
        if (size >= arr.length) {
            growArray();
        }
        int putIndex = getIndexFromHash(key);
        arr[size] = entry;
        size++;
    }

    private void growArray(){
        arr = Arrays.copyOf(arr, arr.length+arr.length>>1);
    }

    private int getIndexFromHash(K key) {
        if (key == null) {
            return 0;
        } else {
            return key.hashCode() % arr.length;
        }
    }


    public V get(K key) {
        return null;
    }

    class Entry {
        K key;
        V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }
}

