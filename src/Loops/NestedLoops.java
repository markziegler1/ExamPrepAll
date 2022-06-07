package Loops;

public class NestedLoops {
    public static void main(String[] args) {

        // outer loop
        for (int i = 1; i <= 5; ++i) {
            // codes

            // inner loop
            for (int j = 1; j <= 2; ++j) {
                // codes
                System.out.println("Hi");
            }

            //Another example
            int rows = 5;

            // outer loop
            for (int k = 1; i <= rows; ++i) {

                // inner loop to print the numbers
                for (int j = 1; j <= i; ++j) {
                    System.out.print(j + " ");
                }
                System.out.println("");
        }}}}
