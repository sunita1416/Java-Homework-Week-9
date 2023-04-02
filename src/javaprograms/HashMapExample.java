package javaprograms;

import java.util.HashMap;
import java.util.Map;

//9. Create a HashMap object called people that will store String keys and Integer
//values: And use for each loop to iterate the value from Map.

public class HashMapExample {

    public static void main(String[] args) {
        // Create a new HashMap object called "people"
        Map<String, Integer> people = new HashMap<>();

        // Add some key-value pairs to the map
        people.put("Akash", 25);
        people.put("Bobby", 30);
        people.put("Chetan", 35);

        // Use a for-each loop to iterate over the values in the map
        for (Integer value : people.values()) {
            System.out.println("Value: " + value);
        }
    }
}

