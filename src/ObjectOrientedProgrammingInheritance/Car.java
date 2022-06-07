package ObjectOrientedProgrammingInheritance;


//Did you notice the protected modifier in Vehicle?
//We set the brand attribute in Vehicle to a protected access modifier. If it was set to private, the Car class would not be able to access it.
//Why And When To Use "Inheritance"?
//- It is useful for code reusability: reuse attributes and methods of an existing class when you create a new class.
//In the example below, the Car class (subclass) inherits the attributes and methods from the Vehicle class (superclass):


public class Car extends Vehicle {
    private String modelName = "Mustang";    // Car attribute
    public static void main(String[] args) {

        // Create a myCar object
        Car myCar = new Car();

        // Call the honk() method (from the Vehicle class) on the myCar object
        myCar.honk();

        // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
        System.out.println(myCar.brand + " " + myCar.modelName);
}}
