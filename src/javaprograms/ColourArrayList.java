package javaprograms;
//4. Write a Java program to create a new array list, add some colours (string) and
//printout the collection using for each loop.


import java.util.ArrayList;

public class ColourArrayList {
    public static void main(String[] args) {
        // create a new Arraylist to hold colour strings
        ArrayList<String> colours = new ArrayList<>();

        // add some colours to the Arraylist

        colours.add("Red");
        colours.add("Orange");
        colours.add("Yellow");
        colours.add("Green");
        colours.add("Blue");
        colours.add("Purple");
        colours.add("Pink");
        colours.add("Violet");

        // print out the collection using a for-each loop

        System.out.println("The colours in the collection are: ");
        for(String colour : colours){
            System.out.println(colour);
        }
    }
}
