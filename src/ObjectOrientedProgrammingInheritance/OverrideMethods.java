package ObjectOrientedProgrammingInheritance;

public class OverrideMethods {
    static class ABC{
        public void myMethod()
        {
            System.out.println("Overridden method");
        }
    }
    static class Demo extends ABC {
        public void myMethod() {
            //This will call the myMethod() of parent class
            super.myMethod();
            System.out.println("Overriding method");
        }

        public static void main(String args[]) {
            Demo obj = new Demo();
            obj.myMethod();
        }
    }}