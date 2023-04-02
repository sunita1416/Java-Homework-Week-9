package javaprograms;
// 5. Write a Java program to iterate through all elements in an array list using
//Iterater.


import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {
    public static void main(String[] args) {
        // Create an Arraylist of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add some integers to the Arraylist

        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);
        numbers.add(600);
        numbers.add(700);
        numbers.add(800);

        // Create an Iterator for the ArrayList

        Iterator<Integer> iterator = numbers.iterator();

        // use the Iterator to iterate through the Arraylist

        while (iterator.hasNext()){
            Integer number = iterator.next();
            System.out.println(number);
        }
    }
}
