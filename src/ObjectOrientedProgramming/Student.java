package ObjectOrientedProgramming;

public class Student {
        String name;
        String rollNo;

        //constructor
        Student(String name, String rollNo){
            this.name = name;
            this.rollNo = rollNo;
        }

        //Override toString method to get customize results.
        public String toString(){
            return "Name:" + name + ", Name2: " + rollNo;
        }
    }

    class ToStringExample2 {
        public static void main(String args[]){
            //creating Student class object
            Student stu1 = new Student("Mark", "Ziegler");
            Student stu2 = new Student("Ebubekir", "Kayhan");
            Student stu3 = new Student("Lars", "Larsen");

            //println internally call toString method
            System.out.println(stu1);
            System.out.println(stu2);
            System.out.println(stu3);
        }
}
