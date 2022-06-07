package ObjectOrientedProgrammingInheritance;


//The protected keyword is an access modifier used for attributes, methods and constructors.
// making them accessible in the same package and subclasses.
public class Protected {

}
    class Person {
        protected String fname = "John";
        protected String lname = "Doe";
        protected String email = "john@doe.com";
        protected int age = 24;
    }

    class Student extends Person {
        private int graduationYear = 2018;
        public static void main(String[] args) {
            Student myObj = new Student();
            System.out.println("Name: " + myObj.fname + " " + myObj.lname);
            System.out.println("Email: " + myObj.email);
            System.out.println("Age: " + myObj.age);
            System.out.println("Graduation Year: " + myObj.graduationYear);
}}
