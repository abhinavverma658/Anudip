import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        // Create a HashMap with key-value pairs of String and Integer
        Map<String, Integer> hashMap = new HashMap<>();

        // Adding elements to the HashMap
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        hashMap.put("Four", 4);
        hashMap.put("Five", 5);

        // Displaying the initial HashMap
        System.out.println("Initial HashMap: " + hashMap);

        // Associate a new value with a specified key
        String keyToAssociate = "Two";
        int newValue = 22;

        // Check if the key exists before updating the value
        if (hashMap.containsKey(keyToAssociate)) {
            // Update the value associated with the specified key
            hashMap.put(keyToAssociate, newValue);
            System.out.println("Updated HashMap: " + hashMap);
        } else {
            System.out.println("Key not found: " + keyToAssociate);
        }
    }
}
