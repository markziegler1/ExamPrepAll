package Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("A");
        cars.add("C");
        cars.add("B");
        //Printing unsorted list
        System.out.println(cars);
        // Sorting ArrayList in ascending Order
        Collections.sort(cars);
        // printing the sorted ArrayList
        System.out.println(cars);

    }}
