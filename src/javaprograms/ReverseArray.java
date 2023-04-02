package javaprograms;

import java.util.Arrays;

//3. Write a Java program to reverse an array of integer values.
public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50};
        System.out.println("Original array: " + Arrays.toString(arr)); //Arrays.toString method is used to print the original
                                                                       //and the reversed arrays to the console
        reverseArray(arr);
        System.out.println("Reversed array: " + Arrays.toString(arr));
    }

    // Use reversArray method to reverse the given array of integers.
    // It takes the array as input and then uses a while loop to swap the first and last elements of the array,
    //continuing until the entire array is reversed.

    public static void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
