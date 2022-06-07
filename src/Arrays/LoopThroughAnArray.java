package Arrays;

public class LoopThroughAnArray {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        //Loop Through an Array
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        //Loop though Array with for each
        String[] cars2 = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars2) {
            System.out.println(i);
        }
    }
}
