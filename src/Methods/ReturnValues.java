package Methods;

public class ReturnValues {
    public static void main(String[] args) {
        System.out.println(myMethod(5, 3));
    }
    static int myMethod(int x, int y) {
        return x + y;
        // Outputs 8 (5 + 3)
    }

}
