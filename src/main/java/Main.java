import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MyHashMap<Integer, String> hashMap = new MyHashMap<>();
        hashMap.put(20, "Dan");
        hashMap.put(18, "Mich");
        hashMap.put(34, "San");
        System.out.println(hashMap);
    }
}
