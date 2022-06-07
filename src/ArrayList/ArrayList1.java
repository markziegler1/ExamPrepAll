package ArrayList;

import java.util.ArrayList;

public class ArrayList1 {

    //Array is a fixed length data structure whereas ArrayList is a variable length Collection class.
    //We cannot change length of array once created in Java but ArrayList can be changed.

    public static void main(String[] args){
        String[] fruits = new String[4];
        fruits[0] = "Mango";
        fruits[1] = "Apple";
        fruits[2] = "Strawberry";
        System.out.println(fruits[1]);

       ArrayList<String> fruitList = new ArrayList<>();
       fruitList.add("Mango");
       fruitList.add("Apple");
       fruitList.add("Strawberry");
       System.out.println(fruitList);

       System.out.println(fruitList.contains("Apple"));
       fruitList.remove("Apple");
       fruitList.clear();


    }

}
