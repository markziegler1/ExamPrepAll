package Input;

import java.util.Scanner;

public class Scanners {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input


        //nextBoolean()	Reads a boolean value from the user
        //nextByte()	Reads a byte value from the user
        //nextDouble()	Reads a double value from the user
        //nextFloat()	Reads a float value from the user
        //nextInt()	Reads a int value from the user
        //nextLine()	Reads a String value from the user
        //nextLong()	Reads a long value from the user
        //nextShort()	Reads a short value from the user

        //Example

        System.out.println("Enter name, age and salary:");

        // String input
        String name = myObj.nextLine();

        // Numerical input
        int age = myObj.nextInt();
        double salary = myObj.nextDouble();

        // Output input by user
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);

    }
}
