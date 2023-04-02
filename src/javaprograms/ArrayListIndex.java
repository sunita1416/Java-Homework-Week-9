package javaprograms;

import java.util.ArrayList;

//6. Write a Java program to retrieve an element (at a specified index) from a given
//array list
public class ArrayListIndex {
    public static void main(String[] args) {
        // Create an Arraylist of integers

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // Add some numbers to the ArrayList

        numbers.add(50);
        numbers.add(100);
        numbers.add(150);
        numbers.add(200);
        numbers.add(250);
        numbers.add(300);
        numbers.add(350);
        numbers.add(400);

        // Retrieve the element at index 2

        int element = numbers.get(3);

        // Print the element

        System.out.println("Element at index 3: " + element);
    }
}
