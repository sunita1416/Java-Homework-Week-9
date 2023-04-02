package javaprograms;

import java.util.ArrayList;

// 7. Write a Java program to test if an array list is empty or not
public class ArrayListEmptyOrNot {
    public static void main(String[] args) {
         // Create an empty Arraylist

        ArrayList<String> list =  new ArrayList<>();

        // Check if the ArrayList is empty

        if (list.isEmpty()){
            System.out.println("The ArrayList is empty");

        }else {
            System.out.println("The ArrayList is not empty");
        }
    }
}

