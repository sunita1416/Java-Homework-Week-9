package javaprograms;

import java.util.ArrayList;

// 11. Declare following two arrylist and compare it.
 //ArrayList<String> c1= new ArrayList<String>();
 //c1.add("Red");
 //c1.add("Green");
 //c1.add("Black");
 //c1.add("White");
 //c1.add("Pink");
 //ArrayList<String> c2= new ArrayList<String>();
 //c2.add("Red");
 //c2.add("Green");
 //c2.add("Black");
 //c2.add("Pink")
public class ArrayListCompare {
     public static void main(String[] args) {
         // We delclare two ArrayLists named c1 and c2
         ArrayList<String> c1 = new ArrayList<String>();
         c1.add("Red");
         c1.add("Green");
         c1.add("Black");
         c1.add("White");
         c1.add("Pink");

         ArrayList<String> c2 = new ArrayList<String>();
         c2.add("Red");
         c2.add("Green");
         c2.add("Black");
         c2.add("Pink");

         //We compare them using the equals() method, which returns true if two ArrayLists are same elements in the same
         //order, and false if they are not. We print  the message if ArrayLists are not equal if they have different elements

         if (c1.equals(c2)) {
             System.out.println("The two ArrayLists are equal");
         }else {
             System.out.println("The two ArrayLists are not equal");
         }
     }


}
