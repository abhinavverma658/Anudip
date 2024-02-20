import java.util.HashMap;
import java.util.Map;

public class HashMapCheckEmpty {

    public static void main(String[] args) {
        // Create an empty HashMap
        Map<String, Integer> emptyHashMap = new HashMap<>();

        // Check if the HashMap is empty
        if (emptyHashMap.isEmpty()) {
            System.out.println("The HashMap is empty.");
        } else {
            System.out.println("The HashMap is not empty.");
        }

        // Create a non-empty HashMap
        Map<String, Integer> nonEmptyHashMap = new HashMap<>();
        nonEmptyHashMap.put("One", 1);
        nonEmptyHashMap.put("Two", 2);

        // Check if the HashMap is empty
        if (nonEmptyHashMap.isEmpty()) {
            System.out.println("The HashMap is empty.");
        } else {
            System.out.println("The HashMap is not empty.");
        }
    }
}
