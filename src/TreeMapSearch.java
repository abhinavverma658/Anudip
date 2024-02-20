/*
Q3 Write a Java program to search a value in a Tree Map.

[Hint:create a TreeMap and add some name-age pairs to it.
Then, the user is prompted to enter an age to search for.
The program iterates through the entries in the TreeMap and checks if the entered age matches any of the values.
If a match is found, the corresponding name is displayed; otherwise, a message indicating that no name was found with the entered age is shown.]
* */


import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapSearch {

    public static void main(String[] args) {
        TreeMap<Integer, String> ageNameMap = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);

        // Adding some name-age pairs to TreeMap
        ageNameMap.put(25, "John");
        ageNameMap.put(30, "Alice");
        ageNameMap.put(22, "Bob");
        ageNameMap.put(28, "Eve");

        // Prompting the user to enter an age to search for
        System.out.print("Enter an age to search for: ");
        int searchAge = scanner.nextInt();

        // Searching for the entered age in TreeMap
        String foundName = searchInTreeMap(ageNameMap, searchAge);

        // Displaying the result
        if (foundName != null) {
            System.out.println("Name found for age " + searchAge + ": " + foundName);
        } else {
            System.out.println("No name found for age " + searchAge);
        }

        scanner.close();
    }

    private static String searchInTreeMap(TreeMap<Integer, String> map, int age) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() == age) {
                return entry.getValue();
            }
        }
        return null;
    }
}
