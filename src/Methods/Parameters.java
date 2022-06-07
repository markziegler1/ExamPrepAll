package Methods;

public class Parameters {
    //https://www.w3schools.com/java/java_methods_param.asp

//When a parameter is passed to the method, it is called an argument.
// So, from the example above: fname is a parameter, while Liam, Jenny and Anja are arguments.
//Multiple Parameters
        static void myMethod(String fname, int age) {
            System.out.println(fname + " is " + age);
        }

        public static void main(String[] args) {
            myMethod("Liam", 5);
            myMethod("Jenny", 8);
            myMethod("Anja", 31);
        }

}
// Liam is 5
// Jenny is 8
// Anja is 31


