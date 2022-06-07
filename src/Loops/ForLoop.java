package Loops;

public class ForLoop {
    public static void main(String[] args) {

        //For loop example
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        //For loop example
        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }

        //Enhanced for loop / For Each
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
