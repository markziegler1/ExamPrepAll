package ObjectOrientedProgramming;

public class ClassesAndObjects {

    //Create an object called "myObj" and print the value of x:
    int x = 5;


    public static void main(String[] args) {

        ClassesAndObjects myObj = new ClassesAndObjects();
        System.out.println(myObj.x);

        //Creating multiple objects
        ClassesAndObjects myObj1 = new ClassesAndObjects();  // Object 1
        ClassesAndObjects myObj2 = new ClassesAndObjects();  // Object 2
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);


    }
}
