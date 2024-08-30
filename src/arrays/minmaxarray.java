package arrays;

import java.util.Arrays;

class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
public class minmaxarray {
    public Pair<Long, Long> getMinMax(int[] arr) {
        Arrays.sort(arr);
        long minn = arr[0];
        long maxx = arr[arr.length-1];
        return new Pair(minn,maxx);
    }
}
